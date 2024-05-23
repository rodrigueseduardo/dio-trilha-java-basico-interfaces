```mermaid
classDiagram
    class MusicApp {
        +playMusic()
        +pauseMusic()
        +selectMusic(String music)
    }

    class PhoneApp {
        +callPhone(String number)
        +answerPhone()
        +listenVoiceMail()
    }

    class SafariApp {
        +displayPage()
        +addNewTab()
        +refreshPage()
    }

    class iPhone {
    }

    iPhone --> MusicApp
    iPhone --> PhoneApp
    iPhone --> SafariApp
```
