public class StorePairGeneric<T extends Comparable> {
    private T first, second;

    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "first = " + first + ", second = " + second;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof StorePairGeneric)) {
            return false;
        }

        StorePairGeneric<?> p = (StorePairGeneric<?>) o;
        return this.getFirst().equals(p.getFirst());
    }

    public int compareTo(StorePairGeneric<T> p) {
        return this.getFirst().compareTo(p.getFirst());
    }

    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);

        if (a.compareTo(b) >=0 && a.compareTo(c) >=0) {
            System.out.println("a has the largest first value");
        } else if (b.compareTo(a) >=0 && b.compareTo(c) >=0) {
            System.out.println("b has the largest first value");
        } else if (c.compareTo(a) >=0 && c.compareTo(b) >=0) {
            System.out.println("c has the largest first value");
        }

    }

}
