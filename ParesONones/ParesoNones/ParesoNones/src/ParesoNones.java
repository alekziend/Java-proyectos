import java.util.Scanner;
import java.util.Random;

public class ParesoNones {
    public static void main(String[] args) {
        //Declaración variable
        int ordenador, numero, suma;
        String jugador;

        //Generador aleatorio y lectura

        Random r = new Random(); //Para que el ordenador escoja aleatoriamente.
        ordenador = r.nextInt(1, 3); //El rango es de 1 a 2. Origin: Valor mínimo posible (incluido) y bound: valor máximo, pero excluido.

        System.out.println("¿1 o 2?");
        Scanner entrada = new Scanner(System.in);
        jugador = entrada.next();

        if (!jugador.equals("1") && !jugador.equals("2")) {
            System.out.println("¡Mal!");
        } else {
            numero = Integer.parseInt(jugador); //Convertimos valor textual, que hemos guardado en jugador, en un entero y lo guardamos en la variable número.
            suma = ordenador + numero;

            if (suma % 2 == 0) {
                System.out.println("¡Pares!");
            } else {
                System.out.println("¡Nones!");
            }
            System.out.println("El ordenador dijo " + ordenador + " y el jugador " + jugador);

        }
        entrada.close();
    }
}