package hw20221123;

public class DynamicArray implements Dynamic {

    public int[] array;
    public final static int CAPACITY = 16;
    public final static int GROW_CAPACITY = 2;

    private int size;

    public DynamicArray() {
        this.array = new int[DynamicArray.CAPACITY];
    }

    // Конструктор с заданным начальным размером массива
    public DynamicArray(int capacity) {
        this.array = new int[capacity];
    }

    // Добавление элемента в конец массива
    @Override
    public void add(int value) {
        if(size == array.length){
            this.growSize();
        }
        this.array[size++] = value;
    }

    // Добавление элемента по индексу
    @Override
    public void addAt(int index, int value) {
        if(index < this.array.length && index >= 0){
            if(size == array.length) {
                this.growSize();
            }
            for (int i = size; i > index; i--){
                array[i] = array[i-1];
            }
            array[index] = value;
        }
    }

    // Удаление последнего элемента
    @Override
    public void remove() {
        this.array[--size] = 0;
    }

    // Удаление элемента по индексу
    @Override
    public void removeAt(int index) {
        if(index < size && index >= 0){
            for(int i = index; i < size ; i++){
                if(i < array.length-1){
                    array[i] = array[i+1];
                }else{
                    array[i] = 0;
                }
            }
            this.size--;
        }
    }

    // Увеличивает размер массива. Вызывается когда нужно добавить элемент на позицию, больше, чем размер массива
    private void growSize() {
        int [] tmpArray = new int[size * DynamicArray.GROW_CAPACITY];
        for (int i = 0 ; i < size ; i++){
            tmpArray[i] = this.array[i];
        }
        this.array = tmpArray;
    }

    // Уменьшает размер массива до количества элементов
    @Override
    public void shrinkSize() {
        int [] tmpArray = new int[size];
        for (int i = 0 ; i < size ; i++){
            tmpArray[i] = this.array[i];
        }
        this.array = tmpArray;
    }

    // Записывает новое значение в массив по индексу
    @Override
    public void set(int index, int value) {
        this.array[index] = value;
    }

    // Получение элемента по индексу
    @Override
    public int get(int index) {
        if(index < this.size){
            return this.array[index];
        }
        return 0;
    }

    // Удаление всех элементов из массива (массив меняет свое значение на дефолтное)
    @Override
    public void clear() {
        this.array = new int[DynamicArray.CAPACITY];
        this.size = 0;
    }

    // Проверяет, есть ли данный элемент в массиве
    @Override
    public boolean contains(int value) {
        for (int i = 0 ; i <= size; i++){
            if (this.array[i] == value){
                return true;
            }
        }
        return false;
    }

    // Проверяет, является ли массив пустым
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}