package acadamy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        boolean notQuitMainMenu = true;
        while(notQuitMainMenu) {
            printMenu();
            int menuChoice = scanner.nextInt();

            switch(menuChoice) {
                case 1:
                    boolean notQuitAlbumMenu = true;

                    while(notQuitAlbumMenu) {
                        printAlbumMenu();
                        int albumMenuChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch(albumMenuChoice) {
                            case 1:
                                playlist.printAlbumList();
                                continue;
                            case 2:
                                addNewAlbum(playlist);
                                continue;
                            case 3:
                                addSongToAlbum(playlist);
                                continue;
                            case 4:
                                notQuitAlbumMenu = false;
                                break;
                            case 5:
                                viewSongsInAlbum(playlist);
                                continue;
                            default:
                                System.out.println("Please re-enter valid option choice.");
                                break;
                        }
                    }
                    continue;

                case 2:
                    boolean notQuitPlayListMenu = true;

                    while(notQuitPlayListMenu) {
                        printPlayListMenu();
                        int playlistMenuChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch(playlistMenuChoice) {
                            case 1:
                                playlist.printPlayListQueue();
                                continue;
                            case 2:
                                addSongToPlayList(playlist);
                                continue;
                            case 3:
                                removeSongFromPlayList(playlist);
                                continue;
                            case 4:
                                listenToMusic(playlist);
                                break;
                            default:
                                System.out.println("Please re-enter valid option choice.");
                                notQuitPlayListMenu = false;
                                break;
                        }
                    }
                    continue;
                case 3:
                    notQuitMainMenu = false;
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("=====================");
        System.out.println("Main Menu:");
        System.out.println("1. View album option menu");
        System.out.println("2. View playlist option menu");
        System.out.println("3. Exit menu");
        System.out.println("=====================\n");
    }

    public static void printAlbumMenu() {
        System.out.println("=====================");
        System.out.println("Album Option Menu:");
        System.out.println("1. View album list");
        System.out.println("2. Add new album");
        System.out.println("3. Add song to album");
        System.out.println("4. Exit to main menu");
        System.out.println("5. View songs in album");
        System.out.println("=====================\n");
    }

    public static void printPlayListMenu() {
        System.out.println("=====================");
        System.out.println("PlayList Option Menu:");
        System.out.println("1. View playlist queue");
        System.out.println("2. Add song to playlist");
        System.out.println("3. remove song from playlist");
        System.out.println("4. Listen to music");
        System.out.println("5. Exit to main menu");
        System.out.println("=====================\n");
    }

    public static void addNewAlbum(Playlist playlist) {
        System.out.println("Enter new album name:\n");
        String albumName = scanner.nextLine();

        playlist.addAlbum(albumName);
    }

    public static void addSongToAlbum(Playlist playlist) {
        System.out.println("Enter album name:\n");
        String albumName = scanner.nextLine();
        System.out.println("Enter song name:\n");
        String songName = scanner.nextLine();
        System.out.println("Enter song duration:\n");
        String songDuration = scanner.nextLine();

        playlist.addSongToAlbum(albumName,songName,songDuration);
    }

    public static void viewSongsInAlbum(Playlist playlist) {
        System.out.println("Enter album name:\n");
        String albumName = scanner.nextLine();

        playlist.viewSongInAlbum(albumName);
    }

    public static void addSongToPlayList(Playlist playlist) {
        System.out.println("Enter album name:\n");
        String albumName = scanner.nextLine();
        System.out.println("Enter song name:\n");
        String songName = scanner.nextLine();

        playlist.addSongToPlaylist(songName,albumName);
    }

    public static void removeSongFromPlayList(Playlist playlist) {
        System.out.println("Enter song name to be removed: \n");
        String songNameForRemoval = scanner.nextLine();

        playlist.removeSongFromPlaylist(songNameForRemoval);
    }

    public static void listenToMusic(Playlist playlist) {
        playlist.listenToMusic();
    }

}
