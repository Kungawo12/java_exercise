import java.util.Iterator;

public class IntArrayBag implements Iterable<Integer>{

    private int[] data;
    private int manyItems;

    public IntArrayBag(){
        this.data = new int[10];
        this.manyItems = 0;
    }

    /**
     * Constructor
     */
    public IntArrayBag(int capacity){
        this.data = new int[capacity];
        this.manyItems = 0;
    }
    
    public void add(int element){
        if(this.manyItems == this.data.length)
            ensureCapacity();


        this.data[this.manyItems]= element;
        this.manyItems++;
    }

    public void ensureCapacity(){
        int currentCapacity = this.data.length;
        int newCapacity = currentCapacity * 2;
        int[] newData = new int[newCapacity];

        for (int i = 0; i < newData.length; i++) 
            newData[i] = this.data[i];
        
        this.data = newData;
    }

    public int grab(int index){
        return this.data[index];
    }

    public int size(){
        return this.manyItems;
    }

    @Override
    public String toString(){
        String output = "";

        for (int i = 0; i < this.manyItems; i++) {
            output = output + this.data[i] + ",";
        }
        return output;
    }

    public int countOccurances(int target){
        int count = 0;

        for (int i = 0; i < this.manyItems; i++) {
            if(target == this.data[i])
                count++;
        }
        return count;
    }

    public int max(){
        int max = this.data[0];

        for (int i = 0; i < this.manyItems; i++) {
            if(this.data[i] > max )
                max = this.data[i];
        }
        return max;
    }

    public boolean remove(int target){
        boolean output = false;

        for (int i = 0; i < this.manyItems; i++) {
            if(this.data[i]== target){
                this.data[i] = this.data[this.manyItems-1];
                this.manyItems--;
                output = true;

            }
        }
        return output;
    }

    public static boolean bagSearch(IntArrayBag b, int target){
        boolean output = false;
        
        for (int i = 0; i < b.size(); i++) {
            if(b.grab(i) == target)
                output = true;
        }
        return output;
    }

    public static boolean equalsTo(IntArrayBag bag1, IntArrayBag bag2){
        boolean output = true;

        for (int i = 0; i < bag1.size(); i++) {

            int item = bag1.grab(i);

            int count1 = bag1.countOccurances(item);
            int count2 = bag2.countOccurances(item);

            if (count1 != count2){
                output =false;
                return output;
            }
        
        }
        return output;

    }

    public int search(int target){
        for (int i = 0; i < manyItems; i++) {
            if(data[i] == target){
                return i;
            }
        }
        return -1;
    }

}