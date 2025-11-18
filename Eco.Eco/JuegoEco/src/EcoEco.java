import java.util.Scanner;
public class EcoEco {
    public static void main() {

    System.out.println("Juego del \"eco,eco\" : dime algo que yo lo repito :)");
    Scanner entrada = new Scanner(System.in);
    System.out.println("¿Eco? \n¿Eco? ¡Escribe algo!");
    String frase = entrada.nextLine();
    System.out.println("¡Te repito! " + frase);
    entrada.close();

    }
}
