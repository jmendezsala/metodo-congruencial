/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;


/**
 *
 * @author juane
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int semilla = 15, rango = 13;
        int arreglo [] = new int [semilla];
        System.out.print( "DIGITE EL NUMERO DE LA SEMILLA \n");
        int i = Integer.parseInt( entrada.readLine() ); 
                 
        //arreglo [i] =(int) (Math.random()*rango);
        for(i=1; i<semilla; i++){
            arreglo[i]=(int)(Math.random()*rango);
            for(int j=0; j<i; j++){
                if(arreglo[i]==arreglo[j]){
                    i--;
                }
            }
        }
        for(int k=0; k<semilla; k++){
            System.out.print((k+1)+ ".="+arreglo[k]+"\n");
        }
// TODO code application logic here
    }
    
}
