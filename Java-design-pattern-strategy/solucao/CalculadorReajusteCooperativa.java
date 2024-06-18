package strategy.solucao;

import strategy.Funcionario;

import java.math.BigDecimal;

public class CalculadorReajusteCooperativa implements CalculadorReajusteAnualSalario{
    @Override
    public void calcularReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.07))));
    }
}