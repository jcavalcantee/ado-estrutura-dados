package org.example.dados;

public class Funcionario {

    private int id = 1;
    private String nome;
    private Integer idade;
    private Double salario;
    private static int cont = 1;

    public Funcionario() {
        id = cont++;
    }

    public Funcionario(String nome, Integer idade, Double salario) {
        this.id = cont++;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static int getCont() {
        return cont;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
    }

}