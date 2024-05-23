package device;

import apps.browser.SafariApp;
import apps.music.MusicApp;
import apps.phone.PhoneApp;

public class Services implements SafariApp, MusicApp, PhoneApp {

    public void callPhone(String number) {
        System.out.println("Calling Number");
    }

    public void answerPhone() {
        System.out.println("Answering Phone");
    }

    public void listenVoiceMail() {
        System.out.println("Listening to Voicemail");
    }

    public void playMusic() {
        System.out.println("Playing Music");
    }

    public void pauseMusic() {
        System.out.println("Music Paused");
    }

    public void selectMusic(String music) {
        System.out.println("Music Selected");
    }

    public void displayPage() {
        System.out.println("Displaying Page");
    }

    public void addNewTab() {
        System.out.println("New Tab Added");
    }

    public void refreshPage() {
        System.out.println("Refreshing Page");
    }
}
