import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        int numeroInt = entrada.nextInt();
        for (int contador = 1; contador <= numeroInt; contador = contador + 2){
                System.out.println(contador);
        }
    }
}