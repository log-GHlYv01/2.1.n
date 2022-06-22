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
    public static void maino(String[] args) {
        Integer[] value ={ 2,4,6};
        changeValue(value);
        System.out.println(Arrays.toString(value));
    }
    public static void changeValue(Integer []changeValue) {
        changeValue [1]= 99;
    }
    /*public static void mainт(String[] args) {
        Person person= new Person("Виктор", "Цой");
        changePerson(person);
        System.out.println(person);
    }
    public static void changePerson(Person hangePerson) {
        Person changePerson = new Person("Сургей", "Шнур");
    }*/
    public static void main(String[] args) {
        Person person= new Person("Виктор", "Цой");
        changePerson(person);
        System.out.println(person);
    }
    public static void changePerson (Person hangePerson) {
        hangePerson.setName("Сергей");
        hangePerson.setSuname("Шнуров");
    }
}