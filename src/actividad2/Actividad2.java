/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;
import java.util.Scanner;
/**
 *
 * @author VICTOR
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declarar variables
        
        int an, mn, dn, aa, ma, da,año, mes ,dia;
        String periodo;
        
        an=0; mn=0; dn=0; aa=0; da=0; año=0; mes=0; dia=0;
        periodo = "am";
        
        System.out.println("Programa que permite calcular la edad de una perona");
        System.out.println("--------------------");
        
        System.out.println("Ingrese en año de nacimiento");
        an = leer.nextInt();
        System.out.println("Ingrese en mes de nacimiento");
        mn = leer.nextInt();
        System.out.println("Ingrese el día de nacimiento");
        dn = leer.nextInt();
        System.out.println("Ingrese el año actual");
        aa = leer.nextInt();
        System.out.println("Ingrese el mes actual");
        ma = leer.nextInt();
        System.out.println("Ingrese el día actual");
        da = leer.nextInt();
        
        //Proceso
         if ((aa>an)&&(ma>mn)&&(da>dn)){
            año = (aa-an);
            mes = (ma-mn);
            dia= (da-dn); 
            System.out.println("Su edad exacta es " +año + " años " +mes + " meses y " +dia+ " días");
            
        } else if (an>aa) {
            System.out.println("Error el año de nacimiento es mayor al actual");
        
        } else if ((aa>an)&&(mn>ma)&&(da>dn)){
            año = (aa-an)-1; 
            mes = (ma+10)-mn;
            dia = (da-dn);
            System.out.println("Su edad exacta es " +año + " años " +mes + " meses y " +dia+ " días");
            
        } else if ((aa>an)&&(ma>mn)&&(dn>da)){
            año = (aa-an);
            mes = (ma-mn)-1;
            dia = (da+10)-dn;
            System.out.println("Su edad exacta es " +año + " años " +mes + " meses y " +dia+ " días");
            
        } else if ((aa>an)&&(mn>ma)&& (dn>da)){
            año = (aa-an)-1;
            mes = (ma+10)-mn-1;
            dia = (da+10)-dn;
            System.out.println("Su edad exacta es " +año + " años " +mes + " meses y " +dia+ " días");
            }
            
                 
        
    }
    
}
