/**
 * Реализация динамического списка (аналог ArrayList)
 * с базовыми операциями: добавление, удаление, получение элемента.
 * Использует внутренний массив, который автоматически расширяется при необходимости.
 */
public class MyArrayList<T> {
    // Начальная ёмкость массива (константа)
    private static final int INITIAL_CAPACITY = 10;

    // Текущий массив элементов
    private Object[] elements;

    // Текущее количество элементов
    private int size;

    // Текущая вместимость массива
    private int capacity;

    /**
     * Конструктор: создаёт список с начальной ёмкостью
     */
    public MyArrayList() {
        capacity = INITIAL_CAPACITY;
        elements = new Object[capacity];
        size = 0;
    }

    /**
     * Добавление элемента в конец списка
     */
    public void add(T value) {
        if (size == capacity) {
            expandArray();
        }
        elements[size] = value;
        size++;
    }

    /**
     * Возвращение элемента по указанному индексу
     */
    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) elements[index];
        }
        return null;
    }

    /**
     * Удаление элемента по индексу, сдвигая все последующие элементы
     */
    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
        }
    }

    /**
     * Возвращение текущего количества элементов в списке
     */
    public int size() {
        return size;
    }

    /**
     * Расширение массива в два раза при нехватке места
     */
    private void expandArray() {
        capacity = capacity * 2;
        Object[] newElements = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
}
