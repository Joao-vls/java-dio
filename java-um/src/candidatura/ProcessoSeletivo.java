package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecionarCandidato();
    }

    static String[] selecionarCandidato() {
        String[] candidatos = { "ssdd", "ssas", "swssws", "werer", "wwerrw", "dwfewqq", "wqewe" };
        int quantSelecionado = 0;
        String[] selecionados=new String[5];
        for (int i = 0; i < candidatos.length; i++) {
            String candidato = candidatos[i];
            double salarioPretendido = valorPretendido();
            System.out.println("\no candidato" + candidato + " solicitou : " + salarioPretendido);
            if (analisarCandidato(salarioPretendido)) {
                System.out.println("\no candidato " + candidato + " foi selecionado ");
                quantSelecionado++;
                selecionados[quantSelecionado]=candidato;
                if (quantSelecionado == 5) {
                    break;
                }

            }
        }
        return selecionados;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("\nlg candidato");
            return true;

        } else if (salarioBase == salarioPretendido) {
            System.out.println("\nligar candidato");
            return true;

        }
        System.out.println("\naguardando resultado");
        return false;

    }

}
