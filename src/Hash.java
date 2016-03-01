
public class Hash<K, V> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static int CAPACITY,size;
    Entry<K, V>[] entries;

    public Hash(int initialCapacity) throws Exception {
        if (initialCapacity <= 0)
            throw new Exception("Invalid siza");
        if (initialCapacity > DEFAULT_INITIAL_CAPACITY)
            CAPACITY = DEFAULT_INITIAL_CAPACITY;
        else
            CAPACITY = initialCapacity;
        this.entries = new Entry[initialCapacity];
    }

    static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    static int indexFor(int h, int size) {
        return h & (size - 1);
    }

    public void put(K key, V value) throws RuntimeException {
        if (entries[hash(key)] != null)
            throw new RuntimeException("Key already exists");
        entries[hash(key)] = new Entry<>(key, value);
        this.size++;
    }

    public V get(K key) {
        if (entries[hash(key)] == null)
            throw new RuntimeException("Key not found");
        return entries[hash(key)].getValue();
    }
}
