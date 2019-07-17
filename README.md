### **Java Media Player with JAVAFX**
- A lightweight project I built while learning java:

- Below are screenshots of the Media player:

- ![A Screenshot of the Media Player Home](https://github.com/ItsCosmas/JavaFX-simple-MediaPlayer/blob/master/src/com/cozytheDEV/Screenshots/homeScreenshot.PNG) <br />
- ![A Screenshot of the Media Player Home](https://github.com/ItsCosmas/JavaFX-simple-MediaPlayer/blob/master/src/com/cozytheDEV/Screenshots/homescreen.PNG) <br />

- It has a Simple Method to Extract Media Name from the path directory shown in the code.
- It's pretty basic and only plays MP4 files

- To Use on Windows uncomment the windows block comment on MainClass.java and block comment the Linux block.
```

/*			 On Windows OS
            String [] mediaTitleParts = MEDIA_URL.split(":");
            String mediaTitleSecondPart = mediaTitleParts [1];
            System.out.println(mediaTitleSecondPart);
            String [] MediaTitlePartsMain = mediaTitleSecondPart.split("\\\\");
            MediaClass the Title part which usually the last String after split
 */

			// On Linux and Mac
			String [] MediaTitlePartsMain = MEDIA_URL.split("/");
			//MediaClass the Title part which usually the last String after split
			String MediaTitle = MediaTitlePartsMain [MediaTitlePartsMain.length - 1];
```
