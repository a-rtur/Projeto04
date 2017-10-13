package classesDoProjeto;
import java.util.ArrayList;


public class Quiz {
    
    public static int quantidade ;
    public static double soma ;
    public static double getMedia(){
        return soma / (double)quantidade;
    }
    
     private static ArrayList<Questao>questoes;
     public static ArrayList<Questao>getQuestoes(){
         
         if(questoes==null){
             questoes = new ArrayList<>();
             
             Questao q1  = new Questao("Mark Zuckerberg é daltônico. A cor do logo do Facebook é azul porque é a cor que ele pode distinguir melhor.", true, new boolean[]{true,false});
             Questao q2  = new Questao("Os humanos adultos tem menos ossos que os bebês.", true, new boolean[]{true,false});
             Questao q3  = new Questao("Os orangotangos dormem em pé.", false, new boolean[]{true,false});
             Questao q4  = new Questao("O inventor da lâmpada incandescente também inventou a cadeira elétrica.", true, new boolean[]{true,false});
             Questao q5  = new Questao("Os humanos brilham na escuridão.", true, new boolean[]{true,false});
             Questao q6  = new Questao("Beber álcool destroi suas células cerebrais.", false, new boolean[]{true,false});
             Questao q7  = new Questao("Se você corta uma minhoca pela metade, as duas partes podem regenerar seu corpo.", false, new boolean[]{true,false});
             Questao q8  = new Questao("Quando os leões machos conquistam uma manada, costumam matar todos os filhotes machos.", true, new boolean[]{true,false});
             Questao q9  = new Questao("O memorial dedicado a John Lennon, “Strawberry Fields memorial”, está em Liverpool.", false, new boolean[]{true,false});
             Questao q10 = new Questao("A Muralha da China é a única obra construída pelo homem visível ate do espaço.", false, new boolean[]{true,false});
             Questao q11 = new Questao("Tem mais calorias em um só amendoim que em 500gr de carne magra.", false, new boolean[]{true,false});
             Questao q12 = new Questao("Os cabelos e as unhas continuam crescendo depois da morte.", false, new boolean[]{true,false});
             Questao q13 = new Questao("O café tem arsênio?", true, new boolean[]{true,false});
             Questao q14 = new Questao("Os relâmpagos nunca caem no mesmo lugar.", false, new boolean[]{true,false});
             Questao q15 = new Questao("Tem mais células de bacterias no corpo que células humanas.", true, new boolean[]{true,false});
             Questao q16 = new Questao("Os isqueiros foram inventados antes dos fósforos.", true, new boolean[]{true,false});
             Questao q17 = new Questao("Quando faz muito frio, um copo de álcool aquece o corpo.", false, new boolean[]{true,false});
             Questao q18 = new Questao("Os humanos podem distinguir entre um trilhão de cheiros diferentes.", true, new boolean[]{true,false});
             Questao q19 = new Questao("Napoleão Bonaparte era extremadamente baixo.", false, new boolean[]{true,false});
             Questao q20 = new Questao("Tomar leite quente induz o sono.", true, new boolean[]{true,false});
             Questao q21 = new Questao("Tem mais andares do Empire State em seu subterrâneo que os que tem em cima.", false, new boolean[]{true,false});
             Questao q22 = new Questao("O hino nacional da Espanha não tem palavras.", true, new boolean[]{true,false});
             Questao q23 = new Questao("Um pão com manteiga jogado ao ar cai pelo lado da manteiga três de cada quatro vezes.", false, new boolean[]{true,false});
             Questao q24 = new Questao("Quando um avião aterriza de noite se apagam todas as suas luzes interiores.", true, new boolean[]{true,false});
             Questao q25 = new Questao("Os coelhos são roedores.", false, new boolean[]{true,false});
             Questao q26 = new Questao("Todos os insetos tem seis patas.", true, new boolean[]{true,false});
             Questao q27 = new Questao("Durante sua vida, um homem com uma alimentação normal pode ingerir uma quantidade de alimentos equivalente ao peso de cem elefantes adultos.", false, new boolean[]{true,false});
             Questao q28 = new Questao("Se você chora no espaço suas lágrimas ficam no rosto.", true, new boolean[]{true,false});
             Questao q29 = new Questao("A principal limitação dos neurônios do nosso cérebro é que se sofrem algum dado não tem a possibilidade de se regenerar.", false, new boolean[]{true,false});
             Questao q30 = new Questao("O peso total de todos os cupins na terra é muito maior que o peso total de humanos.", true, new boolean[]{true,false});
             
         }
         
         return questoes;
     }
}
