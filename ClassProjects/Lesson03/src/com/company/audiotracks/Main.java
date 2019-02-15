package com.company.audiotracks;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        AudioTrack a1 = new AudioTrack("abc", "cde", 12);
        AudioTrack a2 = new AudioTrack("лдузу", "sdfdf", 120);

        Comparator<AudioTrack> c = new ByDurationComparator();
        Playlist p = new Playlist(c);
        p.add(a1);
        p.add(a2);
    }
}
