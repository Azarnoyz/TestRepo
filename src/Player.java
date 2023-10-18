import ui.Screen;

class Player {
    private Song nameOfSong;
    private Song nameOfSong2;
    private Song nameOfSong3;
    private Song nameOfSong4;
    private Song nameOfSong5;
    private Song nameOfSong6;
    private Song nameOfSong7;
    private Song nameOfSong8;
    private Song nameOfSong9;
    private Song nameOfSong12;
    private Song nameOfSong11;

    public Player(Song nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    static class Song {

        public String name;

        public Song(String name) {
            this.name = name;
        }

        public void testMethod(){

        }
    }

}

