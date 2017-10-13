package classesDoProjeto;
import java.util.ArrayList;


public class Quiz {
     private static ArrayList<Questao>questoes;
     public static ArrayList<Questao>getQuestoes(){
         
         if(questoes==null){
             questoes = new ArrayList<>();
             
             Questao q1  = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q2  = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q3  = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q4  = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q5  = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q6  = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q7  = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q8  = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q9  = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q10 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q11 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q12 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q13 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q14 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q15 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q16 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q17 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q18 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q19 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q20 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q21 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q22 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q23 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q24 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q25 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q26 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q27 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q28 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q29 = new Questao("pergunta", true, new boolean[]{true,false});
             Questao q30 = new Questao("pergunta", true, new boolean[]{true,false});
             
         }
         
         return questoes;
     }
}
