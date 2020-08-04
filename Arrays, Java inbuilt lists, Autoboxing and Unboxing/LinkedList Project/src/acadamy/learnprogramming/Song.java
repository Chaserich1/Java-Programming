package acadamy.learnprogramming;

public class Song {
    private String songTitle;
    private String songDuration;

    public Song(String songName, String songDuration){
        this.songTitle = songName;
        this.songDuration = songDuration;
    }

    public String getSongTitle(){
        return songTitle;
    }

    public String getSongDuration(){
        return songDuration;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setSongDuration(String songDuration) {
        this.songDuration = songDuration;
    }
}
