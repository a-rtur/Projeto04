package classesDoProjeto;
import java.util.ArrayList;
import java.util.Collections;


public class Quiz {
    
    public static int quantidade ;
    public static double soma ;
    private static ArrayList<Questao>questoes;
    
    public static double getMedia(){
        return soma / (double)quantidade;
    }
    
     public static ArrayList<Questao> getQuestoes() {
        if (questoes == null) {
            questoes = new ArrayList<>();
            questoes.add(new Questao("Mark Zuckerberg é daltônico. A cor do logo do Facebook é azul porque é a cor que ele pode distinguir melhor.", true));
            questoes.add(new Questao("Os humanos adultos tem menos ossos que os bebês.", true));
            questoes.add(new Questao("Os orangotangos dormem em pé.", false));
            questoes.add(new Questao("O inventor da lâmpada incandescente também inventou a cadeira elétrica.", true));
            questoes.add(new Questao("Os humanos brilham na escuridão.", true));
            questoes.add(new Questao("Beber álcool destroi suas células cerebrais.", false));
            questoes.add(new Questao("Se você corta uma minhoca pela metade, as duas partes podem regenerar seu corpo.", false));
            questoes.add(new Questao("Quando os leões machos conquistam uma manada, costumam matar todos os filhotes machos.", true));
            questoes.add(new Questao("O memorial dedicado a John Lennon, “Strawberry Fields memorial”, está em Liverpool.", false));
            questoes.add(new Questao("A Muralha da China é a única obra construída pelo homem visível ate do espaço.", false));
            questoes.add(new Questao("Tem mais calorias em um só amendoim que em 500gr de carne magra.", false));
            questoes.add(new Questao("Os cabelos e as unhas continuam crescendo depois da morte.", false));
            questoes.add(new Questao("O café tem arsênio?", true));
            questoes.add(new Questao("Os relâmpagos nunca caem no mesmo lugar.", false));
            questoes.add(new Questao("Tem mais células de bacterias no corpo que células humanas.", true));
            questoes.add(new Questao("Os isqueiros foram inventados antes dos fósforos.", true));
            questoes.add(new Questao("Quando faz muito frio, um copo de álcool aquece o corpo.", false));
            questoes.add(new Questao("Os humanos podem distinguir entre um trilhão de cheiros diferentes.", true));
            questoes.add(new Questao("Napoleão Bonaparte era extremadamente baixo.", false));
            questoes.add(new Questao("Tomar leite quente induz o sono.", true));
            questoes.add(new Questao("Tem mais andares do Empire State em seu subterrâneo que os que tem em cima.", false));
            questoes.add(new Questao("O hino nacional da Espanha não tem palavras.", true));
            questoes.add(new Questao("Um pão com manteiga jogado ao ar cai pelo lado da manteiga três de cada quatro vezes.", false));
            questoes.add(new Questao("Quando um avião aterriza de noite se apagam todas as suas luzes interiores.", true));
            questoes.add(new Questao("Os coelhos são roedores.", false));
            questoes.add(new Questao("Todos os insetos tem seis patas.", true));
            questoes.add(new Questao("Durante sua vida, um homem com uma alimentação normal pode ingerir uma quantidade de alimentos equivalente ao peso de cem elefantes adultos.", false));
            questoes.add(new Questao("Se você chora no espaço suas lágrimas ficam no rosto.", true));
            questoes.add(new Questao("A principal limitação dos neurônios do nosso cérebro é que se sofrem algum dado não tem a possibilidade de se regenerar.", false));
            questoes.add(new Questao("O peso total de todos os cupins na terra é muito maior que o peso total de humanos.", true));
            Collections.shuffle(questoes);
        } 
        else {
            Collections.shuffle(questoes);
        }
        return questoes;
    }
}
