package com.company;

import java.util.Objects;

public class AudioTrack implements Comparable<AudioTrack> {
    @Override
    public int compareTo(AudioTrack o) {
        return this.getTitle().compareTo(o.getTitle());
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

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + duration;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof AudioTrack)) return false;
//        AudioTrack that = (AudioTrack) o;
//        return getDuration() == that.getDuration() &&
//                Objects.equals(getTitle(), that.getTitle()) &&
//                Objects.equals(getAuthor(), that.getAuthor());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getTitle(), getAuthor(), getDuration());
//    }
}








