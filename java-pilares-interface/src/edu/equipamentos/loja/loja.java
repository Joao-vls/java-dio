package edu.equipamentos.loja;

import edu.equipamentos.digitarizadora.Digitarizadora;
import edu.equipamentos.equipamento_generico.EquipamentoMutifucional;
import edu.equipamentos.impressora.Impressora;
import edu.equipamentos.impressora.Xerox;

public class loja {
    public static void main(String[] args) {


        EquipamentoMutifucional multi = new EquipamentoMutifucional();

        Xerox xerox = new Xerox();
        xerox.imprime();

        Impressora marca = xerox;
        marca.imprime();

        Digitarizadora digitarizadora = multi;
        digitarizadora.digitaliza();

        
        Impressora impressora = multi;
        impressora.imprime();
    }
}
