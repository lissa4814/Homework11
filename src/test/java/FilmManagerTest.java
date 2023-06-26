import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class FilmManagerTest {

    @Test
    public void shouldAddNoFilm() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilm() {
        FilmManager manager = new FilmManager();
        manager.addFilm("#1");
        String[] expected = {"#1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddSomeFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilm("#1");
        manager.addFilm("#2");
        manager.addFilm("#3");
        String[] expected = {"#1", "#2", "#3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        FilmManager manager = new FilmManager();
        manager.addFilm("#1");
        manager.addFilm("#2");
        manager.addFilm("#3");
        manager.addFilm("#4");
        manager.addFilm("#5");
        manager.findAll();
        String[] expected = {"#1", "#2", "#3", "#4", "#5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast1() {
        FilmManager manager = new FilmManager();
        manager.addFilm("#1");
        manager.addFilm("#2");
        manager.addFilm("#3");
        manager.addFilm("#4");
        manager.addFilm("#5");
        manager.findLast();
        String[] expected = {"#5", "#4", "#3", "#2", "#1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast2() {
        FilmManager manager = new FilmManager();
        manager.addFilm("#1");
        manager.addFilm("#2");
        manager.addFilm("#3");
        manager.findLast();
        String[] expected = {"#3", "#2", "#1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast3() {
        FilmManager manager = new FilmManager();
        manager.addFilm("#1");
        manager.addFilm("#2");
        manager.addFilm("#3");
        manager.addFilm("#4");
        manager.addFilm("#5");
        manager.addFilm("#6");
        manager.addFilm("#7");
        manager.findLast();
        String[] expected = {"#7", "#6", "#5", "#4", "#3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast4() {
        FilmManager manager = new FilmManager(7);
        manager.addFilm("#1");
        manager.addFilm("#2");
        manager.addFilm("#3");
        manager.addFilm("#4");
        manager.addFilm("#5");
        manager.addFilm("#6");
        manager.addFilm("#7");
        manager.findLast();
        String[] expected = {"#7", "#6", "#5", "#4", "#3", "#2", "#1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5() {
        FilmManager manager = new FilmManager(3);
        manager.addFilm("#1");
        manager.addFilm("#2");
        manager.addFilm("#3");
        manager.addFilm("#4");
        manager.addFilm("#5");
        manager.addFilm("#6");
        manager.addFilm("#7");
        manager.findLast();
        String[] expected = {"#7", "#6", "#5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
