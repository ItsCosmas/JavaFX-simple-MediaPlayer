package com.cozytheDEV;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Extract implements Initializable {

    @FXML
    private Label lblMediaTitle;

    @FXML
    private MediaView mainMediaView;

    MediaPlayer mediaPlayer;
    Stage stage;

    @FXML
    public void openMediaFile(){
        FileChooser fileChooser = new FileChooser();

        fileChooser.setTitle("Select Media To Play");
        fileChooser.getExtensionFilters().addAll(
                // To filter only specific Video formats
                // To add more Video formats in future
                new FileChooser.ExtensionFilter("Video Files","*.mp4")
                //new FileChooser.ExtensionFilter("All Files","*.*")
        );




        File file = fileChooser.showOpenDialog(stage);

        if (file != null){
            String MEDIA_URL = file.toString();
            // The regex below only extracts the Tittle part of the media


            String [] mediaTitleParts = MEDIA_URL.split(":");
            String mediaTitleSecondPart = mediaTitleParts [1];
            //System.out.println(mediaTitleSecondPart);
            String [] MediaTitlePartsMain = mediaTitleSecondPart.split("\\\\");
            //Extract the Title part which usually the last String after split
            String MediaTitle = MediaTitlePartsMain [MediaTitlePartsMain.length - 1];
            //System.out.println(MediaTitle);
            lblMediaTitle.setText(MediaTitle);

            //lblMediaTitle.setText(MEDIA_URL);

            Media media = new Media(new File(MEDIA_URL).toURI().toString());

            mediaPlayer = new MediaPlayer(media);

            //mediaPlayer = new MediaPlayer(new Media(this.getClass().getResource(MEDIA_URL).toExternalForm()));


            mainMediaView.setMediaPlayer(mediaPlayer);

            //Resize Video

       /* DoubleProperty width = mainMediaView.fitWidthProperty();
        DoubleProperty height = mainMediaView.fitHeightProperty();

        width.bind(Bindings.selectDouble(mainMediaView.sceneProperty(), "width"));
        height.bind(Bindings.selectDouble(mainMediaView.sceneProperty(), "height"));*/
        }
    }



    @Override
    public void initialize(URL Location, ResourceBundle resources) {


    }



    @FXML
    private void play(){
        mediaPlayer.play();
    }

    @FXML
    private void pause(){
        mediaPlayer.pause();
    }
    @FXML
    private void stop(){
        mediaPlayer.stop();
    }
    @FXML
    private void restart(){
        mediaPlayer.seek(mediaPlayer.getStartTime());
        mediaPlayer.play();
    }
}
