package quiz;
import java.util.ArrayList;
import java.util.Collections;


public class BancoQuestoes {
    private static ArrayList<Questao>questoes;

     public static ArrayList<Questao> getQuestoes() {
        if (questoes == null) {
            questoes = new ArrayList<>();
            questoes.add(new Questao("1","Mark Zuckerberg é daltônico. A cor do logo do Facebook é azul porque é a cor que ele pode distinguir melhor.", "V"));
            questoes.add(new Questao("2","Os humanos adultos tem menos ossos que os bebês.", "V"));
            questoes.add(new Questao("3","Os orangotangos dormem em pé.", "F"));
            questoes.add(new Questao("4","O inventor da lâmpada incandescente também inventou a cadeira elétrica.", "V"));
            questoes.add(new Questao("5","Os humanos brilham na escuridão.", "V"));
            questoes.add(new Questao("6","Beber álcool destroi suas células cerebrais.", "F"));
            questoes.add(new Questao("7","Se você corta uma minhoca pela metade, as duas partes podem regenerar seu corpo.", "F"));
            questoes.add(new Questao("8","Quando os leões machos conquistam uma manada, costumam matar todos os filhotes machos.", "V"));
            questoes.add(new Questao("9","O memorial dedicado a John Lennon, “Strawberry Fields memorial”, está em Liverpool.", "F"));
            questoes.add(new Questao("10","A Muralha da China é a única obra construída pelo homem visível ate do espaço.", "F"));
            questoes.add(new Questao("11","Tem mais calorias em um só amendoim que em 500gr de carne magra.", "F"));
            questoes.add(new Questao("12","Os cabelos e as unhas continuam crescendo depois da morte.", "F"));
            questoes.add(new Questao("13","O café tem arsênio?", "V"));
            questoes.add(new Questao("14","Os relâmpagos nunca caem no mesmo lugar.", "F"));
            questoes.add(new Questao("15","Tem mais células de bacterias no corpo que células humanas.", "V"));
            questoes.add(new Questao("16","Os isqueiros foram inventados antes dos fósforos.", "V"));
            questoes.add(new Questao("17","Quando faz muito frio, um copo de álcool aquece o corpo.", "F"));
            questoes.add(new Questao("18","Os humanos podem distinguir entre um trilhão de cheiros diferentes.", "V"));
            questoes.add(new Questao("19","Napoleão Bonaparte era extremadamente baixo.", "F"));
            questoes.add(new Questao("20","Tomar leite quente induz o sono.", "V"));
            questoes.add(new Questao("21","Tem mais andares do Empire State em seu subterrâneo que os que tem em cima.", "F"));
            questoes.add(new Questao("22","O hino nacional da Espanha não tem palavras.", "V"));
            questoes.add(new Questao("23","Um pão com manteiga jogado ao ar cai pelo lado da manteiga três de cada quatro vezes.", "F"));
            questoes.add(new Questao("24","Quando um avião aterriza de noite se apagam todas as suas luzes interiores.", "V"));
            questoes.add(new Questao("25","Os coelhos são roedores.", "F"));
            questoes.add(new Questao("26","Todos os insetos tem seis patas.", "V"));
            questoes.add(new Questao("27","Durante sua vida, um homem com uma alimentação normal pode ingerir uma quantidade de alimentos equivalente ao peso de cem elefantes adultos.", "F"));
            questoes.add(new Questao("28","Se você chora no espaço suas lágrimas ficam no rosto.", "V"));
            questoes.add(new Questao("29","A principal limitação dos neurônios do nosso cérebro é que se sofrem algum dano não tem a possibilidade de se regenerar.", "F"));
            questoes.add(new Questao("30","O peso total de todos os cupins na terra é muito maior que o peso total de humanos.", "V"));
            Collections.shuffle(questoes);
        } 
        return questoes;
    }
}
