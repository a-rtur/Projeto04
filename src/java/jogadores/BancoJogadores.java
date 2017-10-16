package jogadores;

import jogadores.Jogadores;
import java.util.ArrayList;

public class BancoJogadores {

    private static ArrayList<Jogadores> jogadores;

    public static ArrayList<Jogadores> getJogadores() {
        if (jogadores == null) {
            jogadores = new ArrayList<>();
        }
        return jogadores;
    }

    public static boolean isRegistered(String nome) {
        for (int i = 0; i < BancoJogadores.getJogadores().size(); i++) {
            if (BancoJogadores.getJogadores().get(i).getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public static int indexByName(String nome) {
        for (int i = 0; i < BancoJogadores.getJogadores().size(); i++) {
            if (BancoJogadores.getJogadores().get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }
}
