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
public class Puntaje {
    public int BateriaPantalla(int ma, double pantalla){
        if (pantalla <=5) {
            if (ma<1200) {
                return 3;
            }else if (ma>1200&&ma<2400) {
                return 4;
            }else if (ma>2400&&ma<3100) {
                return 5;
            }else if (ma>3100) {
                return 6;
            }
        }else if (pantalla<=4) {
            if (ma<1200) {
                return 1;
            }else if (ma>1200&&ma<2400) {
                return 2;
            }else if (ma>2400&&ma<3100) {
                return 3;
            }else if (ma>3100) {
                return 4;
            }
        }else if (pantalla<=4) {
            if (ma<1200) {
                return 1;
            }else if (ma>1200&&ma<2400) {
                return 2;
            }else if (ma>2400&&ma<3100) {
                return 3;
            }else if (ma>3100) {
                return 4;
            }
        }else if (pantalla<=3) {
            if (ma<1200) {
                return 0;
            }else if (ma>1200&&ma<2400) {
                return 1;
            }else if (ma>2400&&ma<3100) {
                return 2;
            }else if (ma>3100) {
                return 3;
            }    
        }
    return 0;
    
    }
    public int refDeMarca(String marca){
    
        if (marca.equals("Nexus")||marca.equals("Lenovo")||marca.equals("Huawei")||marca.equals("Sony")||marca.equals("Apple")) {
            return 4;
        }else if (marca.equals("Samsung")||marca.equals("Alcatel")||marca.equals("LG")) {
            return 3;
        }else{
            return 2;
        }
    
    }
    
    public int rangoPrecio(double precio){
        if (precio<100) {
            return 2;
        }else if (precio>=100&&precio<=350) {
            return 3;
        }else if (precio>350) {
            return 4;
        }
        
    return 0;
    }
    
    public int garantia(double garantia){
        if (garantia<3) {
            return 1;
        }else if (garantia>3&&garantia<6) {
            return 2;
        }else if (garantia >=6) {
            return 4;
        }
    return 0;
    }
    public int cpu(int cpu){
        switch (cpu) {
            case 2:
                return 0;
            case 4:
                return 1;
            case 6:
                return 2;
            case 8:
                return 3;
            default:
                break;
        }
    return 0;
    }
    public int ram(double ram){
        if (ram<=1) {
            return 0;
        }else if (ram>=1&&ram<2) {
            return 2;
        }else if (ram>=2&&ram<4) {
            return 4;
        }else if (ram>4) {
            return 6;
        }
    return 0;
    }
    
    
}
