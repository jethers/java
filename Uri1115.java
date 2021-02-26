import java.util.Scanner;

public class Uri1115{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);
        int x, y;
        x = entrada.nextInt();  
        y = entrada.nextInt();          
        while (x != 0 && x != 0){
            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");                
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");                
            }
            else if (x > 0 && y < 0){
                System.out.println("quarto");                
            }                        
            x = entrada.nextInt();  
            y = entrada.nextInt();                
        }
    }
}