class TimeMap {

    Map<String, List<Pair<Integer, String>>> keystore;

    public TimeMap() {
        keystore = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {

        Pair<Integer, String> newPair = new Pair<>(timestamp, value);
        List<Pair<Integer, String>> newList = new ArrayList<>();

        newList.add(newPair);

        if(keystore.get(key) == null) {
            keystore.put(key, newList);
        }
        else {
            keystore.get(key).add(newPair);
        }
    }
    
    public String get(String key, int timestamp) {

        List<Pair<Integer, String>> values = keystore.getOrDefault(key, new ArrayList<>());

        String result = "";
        int l = 0;
        int r = values.size() - 1;

        while(l<=r) {
            int mid = l + (r-l)/2;

            if(values.get(mid).getKey() <= timestamp) {
                result = values.get(mid).getValue();
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }

        return result;
        
    }

    private static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
