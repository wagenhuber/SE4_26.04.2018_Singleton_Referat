package classic;

public class ClassicSingleton {


    //Objekterstellung erst beim ersten Aufruf getInstance
    private static ClassicSingleton instance = null;


    private ClassicSingleton() {

    }


    public static ClassicSingleton getInstance() {
        if (instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;

    }
}
