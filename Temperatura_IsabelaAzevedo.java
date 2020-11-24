/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura_isabelaazevedo;
import java.util.Scanner;
/**
 *
 * @author Isabela
 */
public class Temperatura_IsabelaAzevedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada;
        double c,f;
        entrada = new Scanner (System.in);
        System.out.print ("Digite a temperatura em celsius:" );
        c = entrada.nextDouble ();
        f = (c *1.8 + 32);
        System.out.println("A temperatura em fahrenheit é:" +f );
        int i=0;
        do
        {f=f+10;
        i++;
        if(i<=10){
          System.out.println("tempratura subindo de 10 em 10 /n"+f);};
        }while (i<=10);
        
        
        
  }
}