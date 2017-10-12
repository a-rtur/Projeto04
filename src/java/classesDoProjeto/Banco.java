package classesDoProjeto;

import java.util.ArrayList;

public class Banco {
    private static ArrayList<Jogadores> jogadores;
    
    public static ArrayList<Jogadores> getJogadores(){
        if(jogadores == null){
            jogadores = new ArrayList<>();
        }
        return jogadores;
    }
}
