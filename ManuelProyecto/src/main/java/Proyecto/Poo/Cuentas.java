/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Poo;

import java.text.DecimalFormat;

/**
 *
 * @author rolando
 */
public class Cuentas {
   
    public String descuento(String sub,String descuento){
        float desc = (Float.parseFloat(descuento)/100);
        String descue= String.valueOf((desc * Float.parseFloat(sub)));
        return descue;
    }
    public String iva(String sub,String descuento){
        float descontado = Float.parseFloat(descuento)/100;
        float valor=  ((descontado*-1)+1) *Float.parseFloat(sub);
        String iva = String.valueOf(Integer.parseInt(String.valueOf(valor *0.15)));
        return iva;
    }
    public String IvaSinDescuento( String sub){
        String ivaSin= String.valueOf(Integer.parseInt(sub)*0.15);
        return ivaSin;
    }
    public String Total(float sub,float des,float iva){
        float total=0;
        total= (sub-(des+iva));
        return String.valueOf(total);
        
    }
}
