/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decrypte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author obyobuora
 */
public class Decrypte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String s;
        String out = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give us the crypted code ");
        s = br.readLine();
        for(int i = 0;i < s.length();i++){
            int ascii = (int) s.charAt(i);
            out += (char) (ascii - 3);
        }
        System.out.println(out);
        
        
    }
    
}
