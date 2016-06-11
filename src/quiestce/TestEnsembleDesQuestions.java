/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiestce;

/**
 *
 * @author YassineTaouil@gmail.com
 */
public class TestEnsembleDesQuestions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EnsembleDesQuestions q=new  EnsembleDesQuestions();
        q.lireFichier("quiestce_binaire_questions.csv");
        System.out.println(q);

    }
    
}
