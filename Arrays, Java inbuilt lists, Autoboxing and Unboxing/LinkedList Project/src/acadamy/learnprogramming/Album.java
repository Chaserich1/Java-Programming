package acadamy.learnprogramming;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songArrayList;
    private String albumName;

    public Album(String albumName){
        this.albumName = albumName;
        this.songArrayList = new ArrayList<Song>();
    }

    public String getAlbumName(){
        return albumName;
    }

    public int findSongIndex(String songName){
        int index = 0;
        for(int i = 0; i < songArrayList.size(); i++){
            Song tempSong = songArrayList.get(i);
            if(tempSong.getSongTitle().equals(songName)){
                return i;
            }
        }
        return -1;
    }

    public Song returnSong(String songName){
        Song tempSong = songArrayList.get(findSongIndex(songName));
        return tempSong;
    }

    public void getSong(){
        System.out.println("==========================");
        System.out.println(albumName + "'s Songs: \n");
        for(int i = 0; i < songArrayList.size(); i++){
            Song tempSong = songArrayList.get(i);
            System.out.println((i + 1) + ". " + tempSong.getSongTitle() + "\nDuration: " + tempSong.getSongDuration());
        }
        System.out.println("==========================");
    }

    public void addSong(String songName, String songDuration){
        if(findSongIndex(songName) < 0){
            Song createSong = new Song(songName, songDuration);
            System.out.println("==========================");
            System.out.println(songName + " successfully added.");
        } else{
            System.out.println("==========================");
            System.out.println(songName + " already exists.");
        }
        System.out.println("==========================");
    }

}
