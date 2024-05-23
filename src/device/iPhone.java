package device;

import apps.browser.SafariApp;
import apps.music.MusicApp;
import apps.phone.PhoneApp;

public class iPhone {
    public static void main(String[] args) {
        Services iDevice = new Services();

        SafariApp safariApp = iDevice;
        MusicApp musicApp = iDevice;
        PhoneApp phoneApp = iDevice;

        safariApp.displayPage();
        safariApp.addNewTab();
        safariApp.refreshPage();

        musicApp.playMusic();
        musicApp.pauseMusic();
        musicApp.selectMusic(null);

        phoneApp.callPhone(null);
        phoneApp.answerPhone();
        phoneApp.listenVoiceMail();
    }
}
