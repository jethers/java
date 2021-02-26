import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        int numeroInt = entrada.nextInt();

        for (int contador = 2; contador <= numeroInt; contador = contador + 2){
                System.out.printf("%d^2 = %d\n", contador, contador * contador);
        }
    }
}