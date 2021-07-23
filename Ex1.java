
package listaexcecao1;

import java.util.Scanner;


public class ListaExcecao1 {

    
    public static void main(String[] args) throws Exception {
        
        double result = 0;
        
        
       try{
        
        Scanner myscanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        
        float n1 = myscanner.nextInt();
        
        System.out.println("Digite outro numero: ");
       
        float n2 = myscanner.nextInt();
       
        
         
         
       try{  
       if ( n1 < 0 || n2 < 0 ){
           
           throw new IllegalArgumentException ("Erro: argumento ");
         }
       }catch (IllegalArgumentException ex){
           System.err.println(ex.getMessage());
           
       }
         
          try{  
       if ( n1 > 1000 || n2 > 1000 ){
           
           throw new IllegalArgumentException ("Erro: digite um valor menor que 1000");
         }
       }catch (IllegalArgumentException ex){
           System.err.println(ex.getMessage());
           
       }
         
          try {
              result = n1/n2;
              System.out.println("Resultado da divisao : " + result);
          }catch (ArithmeticException ex){
              System.err.println("Divisao por zero \n "+ex.getMessage());
          }
          
          
          
       }catch (Exception error){
           System.out.println("Comando invalido ! \n Erro: " + error.getMessage());
       }
       finally {
           System.out.println("Finalizada a execucao");
       }   
          
          
          
         
    }
    
}
