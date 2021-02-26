import java.util.Scanner;

public class Uri1043{

    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);

        float A, B, C, perimetro, area;
        A = entrada.nextFloat();
        B = entrada.nextFloat();
        C = entrada.nextFloat();        

        if (A + B > C && B + C > A && C + A > B){
            perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        else{
            area = (A + B) * C / 2;
            System.out.printf("Area = %.1f\n", area);      
        }
    }
}