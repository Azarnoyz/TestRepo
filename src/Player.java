import ui.Screen;

class Player {
    private Song nameOfSong;
    private Song nameOfSong2;
    private Song nameOfSong3;

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

