package src.test;
import org.junit.jupiter.api.Test;

import src.main.java.MediaLib;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MediaLibTest {
    @Test
    void testAddObjects() {
        Medialib myLib1 = new MediaLib();
        
        myLib1.addBook(new Book(" "," "));
        myLib1.addMovie(new Movie(" ",1.5));
        myLib1.addSong(new Song("Bulls on Parade"));
        assertEquals(3, MediaLib.getNumEntries());
    }
    @Test
    void TestGetTallies(){
        Medialib myLib1 = new MediaLib();
        myLib1.addBook(new Book(" "," "));
         Medialib myLib2 = new MediaLib();
        myLib2.addBook(new Book(" "," "));
        assertEquals(2, MediaLib.getNumBooks());
       
        myLib1.addMovie(new Movie(" ",1.2));
        
        myLib2.addMovie(new Movie(" ",1.2));
        assertEquals(2, MediaLib.getNumMovies());
        myLib1.addSong(new Song("Bulls on Parade"));
        myLib2.addSong(new Song("3's&7's"));
        assertEquals(2, MediaLib.getNumSongs());
        
    }
    
}
