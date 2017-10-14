package classesDoProjeto;

import java.util.ArrayList;

public class Banco {

    private static ArrayList<Jogadores> jogadores;
    public static String jogosAnteriores;

    public static ArrayList<Jogadores> getJogadores() {
        if (jogadores == null) {
            jogadores = new ArrayList<>();
        }
        return jogadores;
    }

    public static boolean isRegistered(String nome) {
        for (int i = 0; i < Banco.getJogadores().size(); i++) {
            if (Banco.getJogadores().get(i).getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public static int indexByName(String nome) {
        for (int i = 0; i < Banco.getJogadores().size(); i++) {
            if (Banco.getJogadores().get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }
}
