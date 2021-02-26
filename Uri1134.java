import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        int codigo, totalAlcool = 0, totalGasolina = 0, totalDiesel = 0;
        codigo = entrada.nextInt();  
        while (codigo != 4){
            if (codigo == 1){
                totalAlcool++;
            }
            else if (codigo == 2){
                totalGasolina++;
            }
            else if (codigo == 3){
                totalDiesel++;
            }
            codigo = entrada.nextInt();  
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + totalAlcool);
        System.out.println("Gasolina: " + totalGasolina);                
        System.out.println("Diesel: " + totalDiesel);         
    }
}