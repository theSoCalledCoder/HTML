package Java_oops;

public class Singol {
    private static Singol instance;
    static String name;
    private Singol(String name){
        Singol.name = name;
        System.out.println("Constructor called " + name);
        
    }
    public static Singol getInstance(String name) {
        if (instance == null) {
            instance = new Singol(name);
        }
        return instance;
    }
}
