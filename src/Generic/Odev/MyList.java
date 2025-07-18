package Generic.Odev;

public class MyList <T> {
    private int capasity;
    private T[] array;
    private int size;

    public MyList(int capasity, T[] array, int size) {
        this.capasity = 10;
        this.array = (T[]) new Object[capasity];
        this.size = 0;
    }
    public MyList(int capasity){
        this.capasity =capasity;
        this.array = (T[]) new Object[capasity];
        this.size = 0;
    }
    public void add(T data){
        if (size>=capasity){
            expandCapacity();
        }
        array[size++]=data;
    }
    private void expandCapacity(){
        capasity *= 2;
        T[] newArray = (T[]) new Object[capasity];

        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public int size(){
     return size;
    }

}
