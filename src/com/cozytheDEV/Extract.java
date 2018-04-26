package com.cozytheDEV;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Extract implements Initializable {

    @FXML
    private Label lblMediaTitle;

    @FXML
    private MediaView mainMediaView;

    MediaPlayer mediaPlayer;


   //private String MEDIA_URL = new File("C:\\Users\\user\\Videos\\eminemagain.MP4").getAbsolutePath();
   //private String MEDIA_URL = new File("D:\\Music Videos\\Rock\\Gorillaz - Melanchony Hill.MP4").getAbsolutePath();
   //private String MEDIA_URL = new File("D:\\Music Videos\\Rock\\My Chemical Romance -  Welcome To The Black Parade.MP4").getAbsolutePath();
   //private String MEDIA_URL = new File("C:\\Project Videos\\My Chemical Romance -  Welcome To The Black Parade.MP4").getAbsolutePath();
   //private String MEDIA_URL = new File("C:\\Project Videos\\Busted - Sleeping With The Light On.MP4").getAbsolutePath();
   private String MEDIA_URL = new File("C:\\Project Videos\\Avril Lavigne - Sk8er Boi.MP4").getAbsolutePath();
   //private String MEDIA_URL = new File("C:\\Project Videos\\R.E.M. - Everybody Hurts (Official Music Video).MP4").getAbsolutePath();
   //private String MEDIA_URL = new File("C:\\Project Videos\\Thirty Seconds To Mars - ATTACK - YouTube_2.MP4").getAbsolutePath();


    @Override
    public void initialize(URL Location, ResourceBundle resources) {




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
