package MercadinhoDoCurvello;

class KeyValueStore<T> {
    private class KeyValueEntry<U> {
        private String key;
        private U value;

        public KeyValueEntry(String key, U value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public U getValue() {
            return value;
        }
    }

    private KeyValueEntry<T>[] entries;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public KeyValueStore() {
        this.entries = new KeyValueEntry[DEFAULT_CAPACITY];
        this.size = 0;
    }


    public boolean add(String key, T value) {
        if (containsKey(key)) {
            return false; 
        }
        if (size == entries.length) {
            resize();
        }
        entries[size++] = new KeyValueEntry<>(key, value);
        return true; 
    }

    private void resize() {
        KeyValueEntry<T>[] newEntries = new KeyValueEntry[entries.length * 2];
        System.arraycopy(entries, 0, newEntries, 0, size);
        entries = newEntries;
    }

    private boolean containsKey(String key) {
        for (int i = 0; i < size; i++) {
            if (entries[i].getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public T get(String key) {
        for (int i = 0; i < size; i++) {
            if (entries[i].getKey().equals(key)) {
                return entries[i].getValue();
            }
        }
        return null; 
    }
}

