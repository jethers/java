import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);

        int distancia;
        double combustivel, consumo;

        distancia = entrada.nextInt();
        combustivel = entrada.nextDouble();

        consumo = distancia / combustivel;

        System.out.printf("%.3f km/l\n", consumo);
    }
    
}