package com.company.audiotracks;

import java.util.Comparator;

public class ByTitleComparator implements Comparator<AudioTrack> {
    @Override
    public int compare(AudioTrack o1, AudioTrack o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
