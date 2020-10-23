/**
 * @autor Chekmarev Andrey
 * 3rd year, 7th group
 * @version 1.1
 *  Main class
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<> ();
        arr.add ("one");
        arr.add("three");
        arr.add("five");
        arr.add("seven");
        System.out.println(arr.get(0));
        System.out.println(arr.get(2));
        arr.remove(0);
        System.out.println(arr.get(0));

    }
}
