import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        int percentual;
        double salario, novosalario, reajuste;

        salario = entrada.nextDouble();
        percentual = 0;

        if (salario >=0 && salario <= 400.00){
            percentual = 15;
         }  
        else if (salario >=400.01 && salario <= 800.00){
            percentual = 12;
        }    
        else if (salario >=800.01 && salario <= 1200.00){
            percentual = 10;
        }    
        else if (salario >=1200.1 && salario <= 2000.00){
            percentual = 7;
        }  
        else if (salario > 2000.00){
            percentual = 4;
        }  
        reajuste = percentual * salario/100;
        novosalario = salario + reajuste;
        System.out.printf("Novo salario: %.2f\n", novosalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);        
    }
}