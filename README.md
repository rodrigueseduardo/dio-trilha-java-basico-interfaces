classDiagram
    class MusicApp {
        +playMusic()
        +pauseMusic()
        +selectMusic(String exemplo)
    }

    class AparelhoTelefonico {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class NavegadorInternet {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class iPhone {
    }

    iPhone --> MusicApp
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
