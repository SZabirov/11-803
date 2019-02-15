package com.company.simplemap;

public class SimpleMap<K, V> implements Map<K, V> {
    private static final int SIZE = 10;
    private Entry<K, V>[] entries;
    private int n;


    public SimpleMap() {
        this.entries = (Entry<K, V>[]) new Object[SIZE];
        this.n = 0;
    }

    @Override
    public void put(K key, V value) {
        for (int i = 0; i < n; i++) {
            if (entries[i].key.equals(key)) {
                entries[i].value = value;
                return;
            }
        }
        entries[n++] = new Entry<>(key, value);
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < n; i++) {
            if (entries[i].key.equals(key)) {
                return entries[i].value;
            }
        }
        return null;
    }

    class Entry<I, O> {
        I key;
        O value;

        public Entry(I key, O value) {
            this.key = key;
            this.value = value;
        }
    }
}



