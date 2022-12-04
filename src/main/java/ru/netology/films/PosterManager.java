package ru.netology.films;

public class PosterManager {
    private PosterItem[] films = new PosterItem[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }


    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = item;
        films = tmp;
    }

    public PosterItem[] findAll() {
        return films;
    }

    public PosterItem[] findLast() {
        int resultLength;

        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        PosterItem[] tmp = new PosterItem[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
