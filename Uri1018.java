import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner entrada;
        entrada = new Scanner(System.in);

        int valorInt, notas100, notas50, notas20, notas10, notas5, notas2, notas1;
                
        valorInt = entrada.nextInt();
        System.out.println(valorInt);        

        notas100 = valorInt / 100;
        valorInt = valorInt % 100;
        //System.out.println(notas100);
        //System.out.println(valorInt); 
        notas50 = valorInt / 50;
        valorInt = valorInt % 50;
        //System.out.println(notas50);
        //System.out.println(valorInt);
        notas20 = valorInt / 20;
        valorInt = valorInt % 20;
        //System.out.println(notas20);
        //System.out.println(valorInt);
        notas10 = valorInt / 10;
        valorInt = valorInt % 10;
        //System.out.println(notas10);
        //System.out.println(valorInt);
        notas5 = valorInt / 5;
        valorInt = valorInt % 5;
        //System.out.println(notas5);
        //System.out.println(valorInt);
        notas2 = valorInt / 2;
        valorInt = valorInt % 2;
        //System.out.println(notas1);
        //System.out.println(valorInt);
        notas1 = valorInt / 1;
        valorInt = valorInt % 1;
        //System.out.println(notas1);
        //System.out.println(valorInt);

        System.out.printf("%d nota(s) de R$ 100,00\n",notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n",notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n",notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n",notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n",notas5);                                
        System.out.printf("%d nota(s) de R$ 2,00\n",notas2);                                        
        System.out.printf("%d nota(s) de R$ 1,00\n",notas1);                                        
    }   
    
}