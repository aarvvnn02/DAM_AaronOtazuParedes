import java.util.HashSet;
import java.util.Random;

public class ejercicio {
    public static void main(String[] args) {

        var loteria = new HashSet<Integer>();
        Random random = new Random();

        while (loteria.size() < 6) {
            int numero = random.nextInt(49) + 1;
            loteria.add(numero);
        }

        System.out.println("Su loteria es: " + loteria);



    }
}