
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;

public class Hashing {

    static class HashMap<K, V> {

        private class Node {

            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of nodes
        private int N; // number of buckets
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            this.n = 0;

            // Initialize the buckets
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i; // di
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehashing() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node> ll : oldBucket) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        public V put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1

            if (di == -1) {
                // Insert
                Node node = new Node(key, value);
                buckets[bi].add(node);
                n++;
            } else {
                // Update
                Node node = buckets[bi].get(di);
                V oldValue = node.value;
                node.value = value;
                return oldValue;
            }

            // Check load factor
            // Load factor = n / N
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehashing();
            }

            return null; // No old value
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return di != -1;
        }

        public int size() {
            return n;
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public void clear() {
            for (int i = 0; i < N; i++) {
                buckets[i].clear();
            }
            n = 0;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public Collection<V> values() {
            ArrayList<V> values = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    values.add(node.value);
                }
            }

            return values;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 220);
        map.put("China", 210);
        map.put("US", 180);
        map.put("Russia", 170);
        map.put("Brazil", 160);
        map.put("Germany", 150);

        System.out.println("HashMap: " + map.keySet() + " -> " + map.values());
        System.out.println("Size: " + map.size());
        System.out.println("Contains 'India': " + map.containsKey("India"));
        map.remove("China");
        System.out.println("After removing 'China': " + map.keySet() + " -> " + map.values());
        System.out.println("Size: " + map.size());

        map.put("India", 250);
        System.out.println("After updating 'India' population to 250: " + map.keySet() + " -> " + map.values());
    }
}