package com.company.lambdas;

public class AudioTrack implements Comparable<AudioTrack> {
    @Override
    public int compareTo(AudioTrack o) {
        return this.getTitle().compareTo(o.getTitle());
//        return this.getDuration() - o.getDuration();

//        if (this.getDuration() > o.getDuration()) {
//            return 1;
//        } else {
//            if (this.getDuration() < o.getDuration()) {
//                return -1;
//            } else {
//                return 0;
//            }
//        }
    }

    private String title;
    private String author;
    private int duration;

    public AudioTrack(String title, String author, int duration) {
        this.title = title;
        this.author = author;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {//излишне, след. проверка покрывает условие
            return false;
        }
        if (!(obj instanceof AudioTrack)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        AudioTrack at = (AudioTrack) obj;
        return this.getDuration() == at.getDuration() &&
                this.getTitle().equals(at.getTitle()) &&
                this.getAuthor().equals(at.getAuthor());
    }
}
