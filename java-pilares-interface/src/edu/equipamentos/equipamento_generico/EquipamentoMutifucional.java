package edu.equipamentos.equipamento_generico;

import edu.equipamentos.digitarizadora.Digitarizadora;
import edu.equipamentos.impressora.Impressora;

public class EquipamentoMutifucional implements Impressora,Digitarizadora {

    @Override
    public void imprime() {
        // TODO Auto-generated method stub
        System.out.println("imprime");
    }

    @Override
    public void digitaliza() {
        System.out.println("digita");
    }

    
}