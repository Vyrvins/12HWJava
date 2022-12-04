package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterItem film1 = new PosterItem(11, "Бладшот", "Боевик");
    PosterItem film2 = new PosterItem(222, "Вперед", "Мультфильм");
    PosterItem film3 = new PosterItem(3, "Отель Белград", "Комедия");
    PosterItem film4 = new PosterItem(11, "Джентельмены", "Боевик");
    PosterItem film5 = new PosterItem(121, "Красотка", "Комедия");
    PosterItem film6 = new PosterItem(411, "Друзья", "Комедия");
    PosterItem film7 = new PosterItem(2422, "Маленький принц", "Мультфильм");
    PosterItem film8 = new PosterItem(53, "Папаши", "Комедия");
    PosterItem film9 = new PosterItem(4511, "Семь", "Боевик");
    PosterItem film10 = new PosterItem(4121, "LOL", "Комедия");
    PosterItem film11 = new PosterItem(417, "Игрушка", "Комедия");

    @Test

    public void shouldShowAddedFilms() {
        PosterManager manager = new PosterManager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);

        PosterItem[] expected = {film1, film2, film3, film4};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastEqualToLimit() {
        PosterManager manager = new PosterManager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);
        PosterItem[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastLessLimit() {
        PosterManager manager = new PosterManager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        PosterItem[] expected = {film9, film8, film7, film6, film5, film4, film3, film2, film1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastMoreLimit() {
        PosterManager manager = new PosterManager();

        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);

        PosterItem[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

