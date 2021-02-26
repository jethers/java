import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        int numeroInt = entrada.nextInt();
        if (numeroInt % 2 == 0){
            numeroInt++;
        }
        for (int contador = numeroInt; contador < numeroInt + 12; contador = contador + 2){
                System.out.println(contador);
        }
    }
}