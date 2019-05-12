package ejercicio_1.pkg12;

public class Ejercicio_112 {

    public static void main(String[] args) {
        double d = 24 * 1.6;
        double t = ((1 * 60 * 60 + 40 * 60 + 35));//pasar todo a segundos, luego a horas
        t /= 3600;
        double v = d / t;
        System.out.println("XD" + t);
        System.out.println("Velocidad: " + v + " kilómetros por hora");
    }
}
