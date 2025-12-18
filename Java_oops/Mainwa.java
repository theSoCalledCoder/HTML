package Java_oops;

public class Mainwa {
    public static void main(String[] args) {
        Singol obj1 = Singol.getInstance("FirstInstance");
        Singol obj2 = Singol.getInstance("SecondInstance");
        System.out.println(obj1 == obj2); // This will print true, confirming both references point to the same instance
    }
}
