/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

/**
 *
 * @author 
 */
public class Geometria {
    public String CalculaArea(double a, double b, double c, double d){
        double resultado, diagonal, lado1, lado2;
        resultado = a*b*c*d;
        if (a>b&&a>c&&a>d) {
            lado1=a;
        }else if (b>a&&b>c&&b>d) {
            lado1=b;
        }else if (c>a&&c>b&&c>d) {
            lado1=c;
        }else{
            lado1=d;
        }
        if (lado1==a) {
            if (b>c&&b>d) {
                lado2 = b;
            }else if (c>b&&c>d) {
                lado2 = c;
            }else{
                lado2=d;
            }
        }else if (lado1==b) {
            if (a>c&&b>d) {
                lado2 = a;
            }else if (c>a&&c>d) {
                lado2 = c;
            }else{
                lado2=d;
            }
        }else if (lado1==c) {
            if (b>a&&b>d) {
                lado2 = b;
            }else if (a>b&&a>d) {
                lado2 = a;
            }else{
                lado2=d;
            }
        }else{
            if (b>c&&b>a) {
                lado2 = b;
            }else if (c>b&&c>a) {
                lado2 = c;
            }else{
                lado2=a;
            }
        }
        diagonal = Math.sqrt(Math.pow(lado2, 2)+Math.pow(lado1, 2));
    
    return "Area: "+resultado+" Diagonal: "+diagonal;
    }
    public String AreaCirculo(double a, String b){
        double area;
        if (b.equals("r")) {
            area = Math.PI*Math.pow(a, 2);
            return "Area "+area;
        }else{
        
            area = Math.PI+Math.pow(a/2, 2);
            return "Area :"+area;
        }
        
    }
        public String VolumenEsfera(double a, String b){
        double volumen;
        if (b.equals("r")) {
            volumen = (4/3)*Math.PI*Math.pow(a, 2);
            return "Volumen "+volumen;
        }else{
        
            volumen = (4/3)*Math.PI+Math.pow(a/2, 2);
            return "Volumen :"+volumen;
        }
        
        
    }
    public String Cubo(double a){
        double volumen;
        volumen = Math.pow(a*(Math.sqrt(3)/3),3);
        
    return "Volumen: "+volumen;
    }
    
    public String Promedio(double[] a){
        double promedio = 0;
        for (double d : a) {
            promedio = promedio +d;
        }
        promedio = promedio /a.length;
    return"promedio "+promedio;
    }
}
