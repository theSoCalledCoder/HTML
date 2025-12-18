package Java_oops;

public class circle extends Shape {
    int radius;
    public circle(int radius, int length, int breadth) {
        super(length, breadth);
        this.radius = radius;
    }
    public circle(int radius) {
        this.radius = radius;
    }
    // public void area() {
    //     double area = Math.PI * radius * radius;
    //     System.out.println("Area: " + area);
    // }
    public void bhadwa(){
        System.out.println("Bhadwa");
    }
}
