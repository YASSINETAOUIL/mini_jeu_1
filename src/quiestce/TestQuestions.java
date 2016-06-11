/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiestce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author YassineTaouil@gmail.com
 */
public class TestQuestions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Input_text;
        Scanner in = new Scanner(System.in);
        BaseDeConaissance B = new BaseDeConaissance();
        B.lireFichier("quiestce_binaire_questions.csv");
        Questions Q = new Questions("essai");
        do {
            System.out.println("est un homme? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_gender(Input_text);

        do {
            System.out.println("a un chapeau? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_hat(Input_text);

        do {
            System.out.println("est ce que les cheveux sont blonds? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_blond_hair(Input_text);

        do {
            System.out.println("est ce que les cheveux sont bruns? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_brown_hair(Input_text);

        do {
            System.out.println("est ce que les cheveux sont noirs? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_black_hair(Input_text);

        do {
            System.out.println("est ce que les cheveux sont roux? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_red_hair(Input_text);

        do {
            System.out.println("est ce que les cheveux sont blancs? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_white_hair(Input_text);

        do {
            System.out.println("a les yeux marrons? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_eyes(Input_text);

        do {
            System.out.println("a les yeux lunettes? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_glasses(Input_text);

        do {
            System.out.println("a les yeux barbe? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_beard(Input_text);

        do {
            System.out.println("a les yeux moustache? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_mustache(Input_text);

        do {
            System.out.println("a un gros nez? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_nose(Input_text);

        do {
            System.out.println("a une grande bouche? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_mouth(Input_text);

        do {
            System.out.println("a des boucles d'oreilles? oui or non");
            Input_text = in.nextLine();
        } while (!Input_text.equals("oui") && !Input_text.equals("non"));
        Q.select_earring(Input_text);

        System.out.println(Q.search_in_database());
    }
}
