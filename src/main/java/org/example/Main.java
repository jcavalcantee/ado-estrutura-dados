package org.example;

import org.example.dados.Funcionario;
import org.example.vetor.Empresa;

public class Main {

    public static void main(String[] args) {

        Empresa cinpal = new Empresa("43655612000125");
        cinpal.inserir(new Funcionario("Patrick", 20, 1200.00));
        cinpal.inserir(new Funcionario("Gouveia", 21, 1300.00));
        cinpal.inserir(new Funcionario("Pedro", 21, 1350.00));
        cinpal.inserir(new Funcionario("Gabriel", 21, 1200.00));
        cinpal.inserir(new Funcionario("Vitor", 21, 1300.00));
        cinpal.inserir(new Funcionario("Jefferson", 21, 1370.00));

        System.out.println("----------------------------------------------------");
        System.out.println("Exibindo todos os funcionarios");
        System.out.println("----------------------------------------------------");
        cinpal.exibir();
        System.out.println("----------------------------------------------------");
        System.out.println("Exibindo atualização dos funcionarios");
        System.out.println("----------------------------------------------------");
        cinpal.atualizar(5, null, null, 1590D);
        cinpal.exibir();
        System.out.println("----------------------------------------------------");
        System.out.println("Exibindo os funcionarios por ordem alfabetica");
        System.out.println("----------------------------------------------------");
        cinpal.ordenarVetor();
        cinpal.exibir();
        System.out.println("----------------------------------------------------");
        System.out.println("Exibindo busca de funcionario por ID");
        System.out.println("----------------------------------------------------");
        System.out.println(cinpal.pesquisaPorId(4));
    }
}
