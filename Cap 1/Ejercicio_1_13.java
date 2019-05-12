package ejercicio_1.pkg13;

public class Ejercicio_113 {

    public static void main(String[] args) {
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 55, f = 5.9;
        double x, y;
        System.out.println(a + "x + " + b + "y = " + e);
        System.out.println(c + "x + " + d + "y = " + f);
        x = (e * d - b * f) / (a * d - b * c);
        y = (a * f - e * c) / (a * d - b * c);
        System.out.println("x = " + x + ", y = " + y);
    }
}
