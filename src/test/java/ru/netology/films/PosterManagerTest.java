package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterItem film1 = new PosterItem(11, "Бладшот", "Боевик");
    PosterItem film2 = new PosterItem(222, "Вперед", "Мультфильм");
    PosterItem film3 = new PosterItem(3, "Отель Белград", "Комедия");
    PosterItem film4 = new PosterItem(11, "Джентельмены", "Боевик");
    PosterItem film5 = new PosterItem(121, "Красотка", "Комедия");

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

    public void shouldFindLastEqual() {
        PosterManager manager = new PosterManager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        PosterItem[] expected = {film4, film3, film2, film1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastLessLimit() {
        PosterManager manager = new PosterManager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        PosterItem[] expected = {film3, film2, film1};
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
        PosterItem[] expected = {film5, film4, film3, film2};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

