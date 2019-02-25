package com.company.lambdas;

import java.util.Comparator;

public class Main1 {
    public static void main(String[] args) {
        AudioTrack a1 = new AudioTrack("abc", "cde", 12);
        AudioTrack a2 = new AudioTrack("лдузу", "sdfdf", 120);

        Comparator<AudioTrack> c = new Comparator<AudioTrack>() {
            @Override
            public int compare(AudioTrack o1, AudioTrack o2) {
                return o1.getDuration() - o2.getDuration();
            }
        };
        Comparator<AudioTrack> c2 = (o1, o2) -> o1.getDuration() - o2.getDuration();


        Playlist p = new Playlist(c);
        p.add(a1);
        p.add(a2);
    }
}
