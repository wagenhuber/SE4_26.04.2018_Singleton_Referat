package ClassSingleton;


import classic.ClassicSingleton;

import java.util.Properties;

public class ClassSingleton {

    //Objekterstellung direkt bei Start der virtuellen Maschine (schneller verfügbar)=
    private static final ClassSingleton INSTANCE = new ClassSingleton();

    //Finale Methoden können nicht überschrieben werden!
    public static final ClassSingleton getInstance() {
        return INSTANCE;
    }


    private ClassSingleton() {

    }



    private Properties props = new Properties(System.getProperties());


    public String getVersion() {
        return "1.9";
    }

    public String getUserDir() {
        return props.getProperty("user.dir");
    }

}
