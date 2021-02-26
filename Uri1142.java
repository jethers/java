import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        int pum = 1;
        for (int contador = 1; contador <= N; contador++){
            System.out.printf("%d %d %d PUM\n", pum, pum  + 1, pum + 2);                
            pum += 4;
        }
    }
}