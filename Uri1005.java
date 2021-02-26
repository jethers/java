import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);

        double A, B, MEDIA, pesoA, pesoB;
        pesoA = 3.5;
        pesoB = 7.5;
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        MEDIA = (pesoA * A + pesoB * B)/(pesoA + pesoB);
        System.out.printf("MEDIA = %.5f\n", MEDIA);

    }

}
