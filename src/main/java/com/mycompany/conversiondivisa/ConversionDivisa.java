/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversiondivisa;

import javax.swing.JOptionPane;

/**
 *
 * @author Erik
 */
public class ConversionDivisa {

    public static void main(String[] args) {
        int euro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Euros a convertir"));
        String Divisa=JOptionPane.showInputDialog("A que divisa desea convertir? \n 1-Libras \n 2-Pesos \n3-Yenes");
        //Divisa.toUpperCase();
        Conversor(euro,Divisa);
        
    }
    
    public static void Conversor(int euro, String Divisa){
        double conversion=0;
        boolean correcto=true;
        switch(Divisa){
             case "Libras":
                conversion=euro*0.86;
             break;
             case "Pesos":
                conversion=euro*1.29;
             break;
             case "Yenes":
                conversion=euro*129.852;
             break;
             default:
                 JOptionPane.showMessageDialog(null, "Opcion no valida");
                 correcto=false;
             break;
        }
        if(correcto){
            JOptionPane.showMessageDialog(null, euro+" Euros en "+Divisa+" es "+conversion);
        }
        
    }
}
