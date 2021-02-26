import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);

        int tempo, velocidade, distancia;
        double litros, consumo;

        tempo = entrada.nextInt();
        velocidade = entrada.nextInt();

        distancia = velocidade * tempo;

        consumo = 12.0;

        litros = distancia / consumo;

        System.out.printf("%.3f\n",litros);
    }
    
}