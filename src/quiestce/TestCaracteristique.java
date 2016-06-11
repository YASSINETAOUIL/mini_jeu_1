/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiestce;

import java.util.Scanner;

/**
 *
 * @author YassineTaouil@gmail.com
 */
public class TestCaracteristique {


    public static void main(String[] args) {
    Caracteristique car=new Caracteristique("situation" , "est-il célibataire");

    Caracteristique cor = new Caracteristique("sexe", "est-il un homme");
    
    
    System.out.println(cor);
    System.out.println (car.equals(cor));
    
    
}
}