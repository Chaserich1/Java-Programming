package acadamy.learnprogramming;

import java.util.*;

public class Playlist {
    private ArrayList<Album> albumArrayList;
    private LinkedList<Song> playList;
    private static Scanner scanner = new Scanner(System.in);

    public Playlist(){
        this.albumArrayList = new ArrayList<Album>();
        this.playList = new LinkedList<Song>();
    }

    public int findAlbumIndex(String albumName){
        for(int i = 0; i < albumArrayList.size(); i++){
            Album tempAlbum = albumArrayList.get(i);
            if(tempAlbum.getAlbumName().equals(albumName)){
                return i;
            }
        }
        return -1;
    }

    public void addAlbum(String albumName){
        if(findAlbumIndex(albumName) < 0){
            Album tempAlbum = new Album(albumName);
            albumArrayList.add(tempAlbum);
        } else{
            System.out.println("This album already exists.");
        }
    }

    public void addSongToPlaylist(String songName, String albumName){
        if(findAlbumIndex(albumName) >= 0){
            Album tempAlbum = albumArrayList.get(findAlbumIndex(albumName));
            if(tempAlbum.findSongIndex(songName) >= 0){
                Song tempSong = tempAlbum.returnSong(songName);
                playList.add(tempSong);
            }else {
                System.out.println("Song cannot be found in the album.");
            }
        }else{
            System.out.println("Album not found.");
        }
    }

    public void printAlbumList(){
        if(albumArrayList.size() > 0){
            System.out.println("Album List:");
            for(int i = 0; i < albumArrayList.size(); i++){
                Album tempAlbum = albumArrayList.get(i);
                System.out.println((i+1) + ". " + tempAlbum.getAlbumName());
            }
        }else{
            System.out.println("There are no albums.");
        }
    }

    public void printPlayListQueue(){
        if(this.playList.size() > 0){
            Iterator<Song> songIterator = this.playList.listIterator();
            int index = 0;
            while(songIterator.hasNext()){
                System.out.println(index + ". " + songIterator.next().getSongTitle());
                ++index;
            }
        } else{
            System.out.println("Playlist queue is empty.");
        }
    }

    public void addSongToAlbum(String albumName, String songName, String songDuration){
        Album tempAlbum = albumArrayList.get(findAlbumIndex(albumName));
        if(findAlbumIndex(albumName) >= 0){
            tempAlbum.addSong(songName, songDuration);
        } else{
            System.out.println("No album or song could be found.");
        }
    }

    public void removeSongFromPlaylist(String songName){
        ListIterator<Song> songListIterator = this.playList.listIterator();
        while(songListIterator.hasNext()){
            int comparison = songListIterator.next().getSongTitle().compareTo(songName);
            if(comparison == 0){
                System.out.println(songName + " has been removed.");
                songListIterator.remove();
                return;
            }
        }
        System.out.println("No song matches " + songName + "\n");
    }

    public void viewSongInAlbum(String albumName){
        if(findAlbumIndex(albumName) >= 0){
            Album tempAlbum = albumArrayList.get(findAlbumIndex(albumName));
            tempAlbum.getSong();
        } else{
            System.out.println("Unable to queue song due to invalid album name\n");
        }
    }

    public void listenToMusic(){
        if(playList.size() > 0){
            ListIterator<Song> songListIterator = playList.listIterator();
            boolean goingForward = true;
            boolean notQuit = true;

            while(notQuit){
                listenToMusic();
                int listenChoice = scanner.nextInt();

                switch(listenChoice){
                    case 1:
                        if(!goingForward){
                            if(songListIterator.hasNext()){
                                songListIterator.next();
                            }
                            goingForward = true;
                        }
                        if(songListIterator.hasNext()) {
                            System.out.println("Now forwarding to playing " + songListIterator.next().getSongTitle() + "\n");
                        }else{
                            System.out.println("Has reach the end");
                            goingForward = false;
                        }
                        break;
                    case 2:
                        if(goingForward) {
                            if(songListIterator.hasPrevious()) {
                                songListIterator.previous();
                            }
                            goingForward = false;
                        }
                        if(songListIterator.hasPrevious()) {
                            System.out.println("Going backward to playing " + songListIterator.previous().getSongTitle() + "\n");
                        }else {
                            System.out.println("Has reach the beginning");
                            goingForward = true;
                        }
                        break;
                    case 3:
                        songListIterator.previous();
                        System.out.println("Now replaying " + songListIterator.next().getSongTitle() + "\n");
                        break;
                    case 4:
                        printPlayListQueue();
                        continue;
                    default:
                        notQuit = false;
                        break;
                }
            }
        }else{
            System.out.println("Add music to play music!");
        }
    }

    public static void listenToMusicMenu() {
        System.out.println("=====================");
        System.out.println("1. Skip forward");
        System.out.println("2. Skip backward");
        System.out.println("3. Replay current song");
        System.out.println("4. View song queue");
        System.out.println("5. Exit to main menu");
        System.out.println("=====================\n");
    }

}
