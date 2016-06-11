/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiestce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author YassineTaouil@gmail.com
 */
public class TestBaseDeConaissance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            BaseDeConaissance B= new BaseDeConaissance();
            B.lireFichier("quiestce_binaire_questions.csv");
            System.out.println(B);
            
    }
}
   

