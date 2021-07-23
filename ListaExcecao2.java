package listaexcecao2;


import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;



public class ListaExcecao2 {

   
    public static void main(String[] args) throws FileNotFoundException {
       
        try (Scanner myscanner = new Scanner(new FileReader("text.txt"))) {
            System.out.print(myscanner.nextLine());
            
        }
        
        try (BufferedReader mybr = new BufferedReader(new FileReader("text2.txt"))) {
            System.out.println(" "+ mybr.readLine());
            
        }catch(IOException ex2){
        ex2.printStackTrace();
        }
        
    }       
}   
