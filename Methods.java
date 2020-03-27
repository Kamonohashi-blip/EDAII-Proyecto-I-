/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Reny
 */
import java.util.*;
public class Methods {
     static String[] lineSplitter(String string){
        String[] s1 = string.split(",",3);  //MODIFICACION
        String[] s2 = s1[0].split(",",3); //MODIFICACION
        String[] output = new String[3];
        output[0] = s2[0].trim();
        output[1] = s1[1].trim();//MODIFICACION
        output[2] = s1[2].trim();//MODIFICACION
        return output;
    
    }
    
    static String[][] textSplitter(String[] string){
        String[][] output = new String[string.length][3];
        int counter = 0;
        for(String line: string){
            output[counter] = lineSplitter(line);
            counter += 1;
        }
        return output;
    }
}