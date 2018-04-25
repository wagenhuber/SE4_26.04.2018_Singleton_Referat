package classic;

public class Main {

    public static void main(String[] args) {

        ClassicSingleton s = ClassicSingleton.getInstance();
        System.out.println(s);

        System.out.println("___________________");

        System.out.println(s);
    }


}
