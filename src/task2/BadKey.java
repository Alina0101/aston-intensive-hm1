package task2;

public class BadKey {
    private final int id;

    public BadKey(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 1; // Все ключи в один бакет
    }

    @Override
    public boolean equals(Object obj) {
        return false; // Объекты никогда не равны, даже себе
    }

    @Override
    public String toString() {
        return "BadKey{" + "id=" + id + '}';
    }
}
