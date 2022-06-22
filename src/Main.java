import java.util.Arrays;

public class Main {
    public static void maini(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);
    }
    public static void changeValue(int value){
            value= 22;
 //
    }
    public static void mainy(String[] args) {
        Integer value = 33;
        changeValue(value);
        System.out.println(value);
    }
    public static void changeValue(Integer value){
        value= 22;

    }
        public static void maina(String[] args) {
        Integer[] value ={ 2,4,6};
        cehangeValue(value);
            System.out.println(Arrays.toString(value));
        }
    public static void cehangeValue(Integer [] cehangeValue) {
        cehangeValue = new Integer[]{1, 3, 5};
    }
    public static void main(String[] args) {
        Integer[] value ={ 2,4,6};
        changeValue(value);
        System.out.println(Arrays.toString(value));
    }
    public static void changeValue(Integer []changeValue) {
        changeValue [1]= 99;
    }
}