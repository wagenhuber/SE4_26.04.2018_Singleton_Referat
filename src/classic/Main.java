package classic;

public class Main {

    public static void main(String[] args) {

        ClassicSingleton s1 = ClassicSingleton.getInstance();
        ClassicSingleton s2 = ClassicSingleton.getInstance();



        System.out.println(s1);

        System.out.println("___________________");

        System.out.println(s2);
    }


}
