/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;



/**
 *
 * @author GIL
 */
public class Convertions {

    public static String toBinary(Object o){
        String binary="";
        if(o instanceof Integer){
            Integer decimal = (Integer)o;
            binary = Integer.toBinaryString(decimal);
        }
        if(o instanceof String){
            String u = (String)o;
            int decimal = Integer.parseInt(u);
            binary = Integer.toBinaryString(decimal);
        }
        return binary;
    }

    public static int toDecimal(String binary){
        int i = Integer.parseInt(binary,2);
        return i;
    }


    public static void main(String[] args){
        Convertions x = new Convertions();
        String y = x.toBinary("192");
        System.out.println(y);
        int b = x.toDecimal(y);
        System.out.println(b);
    }

}
