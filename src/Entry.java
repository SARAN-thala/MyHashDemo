
class Entry<K,V> {
    final K key;
    V value;

    Entry(K key, V value){
        this.key=key;
        this.value=value;
    }

     K getKey() {
        return this.key;
    }

     V getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "value=" + value +
                ", key=" + key +
                '}';
    }
}
