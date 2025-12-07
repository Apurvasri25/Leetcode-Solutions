class MyHashSet {
    boolean[] map;

    public MyHashSet() {
        map = new boolean[1000001]; // max key value
    }

    public void add(int key) {
        map[key] = true;
    }

    public void remove(int key) {
        map[key] = false;
    }

    public boolean contains(int key) {
        return map[key];
    }
}
