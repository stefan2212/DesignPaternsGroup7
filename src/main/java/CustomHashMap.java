import java.util.Arrays;

public class CustomHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 1 << 4; // 16

    private int size = 0;

    private Entry<K, V>[] buckets;

    public CustomHashMap() {
        this(INITIAL_CAPACITY);
    }

    public CustomHashMap(int capacity) {
        this.buckets = new Entry[capacity];
    }

    public void put(K key, V value) {
        Entry<K, V> newEntry = new Entry<>(key, value, null);
        int bucket = key.hashCode() % getBucketSize();

        Entry<K, V> existing = buckets[bucket];
        if (existing == null) {
            buckets[bucket] = newEntry;
            size++;
        } else {
            while (existing.getNext() != null) {
                if (existing.getKey().equals(key)) {
                    existing.setValue(value);
                    return;
                }
                existing = existing.getNext();
            }

            if(existing.getKey().equals(key)){
                existing.setValue(value);
            } else {
                existing.setNext(newEntry);
                size++;
            }
        }
    }

    public int getBucketSize() {
        return this.buckets.length;
    }
}