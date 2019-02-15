package com.company.audiotracks;

import java.util.Comparator;

public class ByDurationComparator implements Comparator<AudioTrack> {
    //если o1 больше о2, то вернет число > 0
    //если o1 меньше о2, то вернет число < 0
    //если o1 равен о2, то вернет 0
    @Override
    public int compare(AudioTrack o1, AudioTrack o2) {
        return o1.getDuration() - o2.getDuration();
    }
}
