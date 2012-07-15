/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

/**
 *
 * @author GIL
 */
public class Utilities {
    public static int random255(){
        return (int)(Math.round(Math.random()*255));
    }
    public static int randomCIDR(){
        return (int)((Math.round(Math.random()*(24-8)))+8);
    }
    public static String[] cidrToMask(int cidr){
        String mask[] = {"0","0","0","0"};
       switch (cidr){
           case 30:mask[3]="252";
           case 29:mask[3]="248";
           case 28:mask[3]="240";
           case 27:mask[3]="224";
           case 26:mask[3]="192";
           case 25:mask[3]="128";
          


       }
        
        return mask;
    }
}
