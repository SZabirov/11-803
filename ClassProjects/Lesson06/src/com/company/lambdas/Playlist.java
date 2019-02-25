package com.company.lambdas;

import java.util.Comparator;

public class Playlist {
    private static final int SIZE = 10;
    private AudioTrack[] trackList;
    private int n;
    Comparator<AudioTrack> comparator;

    public Playlist() {
        this.trackList = new AudioTrack[SIZE];
        this.n = 0;
    }

    public Playlist(Comparator<AudioTrack> comparator) {
        this();
        this.comparator = comparator;
    }

    public void add(AudioTrack track) {
        int i = 0;
        while (i < n) {
            if (comparator != null) {
                if (comparator.compare(track, trackList[i]) < 0) {
                    break;
                }
            } else {
                if (track.compareTo(trackList[i]) < 0) {
                    break;
                }
            }
            i++;
        }
    }

}
