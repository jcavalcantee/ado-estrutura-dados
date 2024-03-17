package org.example.vetor;

import org.example.dados.Funcionario;

import java.util.Arrays;

public class Empresa {

    private static int cont = 0;
    private String cnpj;
    private Funcionario[] func = new Funcionario[1];

    public Empresa() {
    }

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    public Empresa(String cnpj, Funcionario[] func) {
        this.cnpj = cnpj;
        this.func = func;
    }

    /**
     * Insere o funcionario no array de funcionarios da empresa
     * 
     * @param funcionario (Obj Funcionario)
     */
    public void inserir(Funcionario funcionario) {
        if (cont >= func.length) {
            func = redimensionarVetor();
        }
        func[cont++] = funcionario;
    }

    /**
     * Redimensiona o Array inicial caso exceda a quantidade de indices, mantem os
     * dados do array anterior adicionando mais 5 posições.
     * 
     * @return Retorna o novo array redimensionado
     */
    private Funcionario[] redimensionarVetor() {
        Funcionario novoFuncionario[] = new Funcionario[func.length + 5];
        System.arraycopy(func, 0, novoFuncionario, 0, func.length);

        return novoFuncionario;
    }

    /**
     * Exibe a lista com todos os funcionarios da empresa
     */
    public void exibir() {
        for (int i = 0; i <= func.length - 1; i++) {
            System.out.println(func[i]);
        }
    }

    /**
     * Localiza o funcionario através do ID informado e exibe todos os dados do
     * funcionario
     * 
     * @param id (int)
     * @return Retorna -1 caso o id do funcionario não seja encontrado
     */
    public int pesquisarPorId(int id) {
        for (int i = 0; i < func.length; i++) {
            if (id == func[i].getId())
                System.out.println(func[i]);
        }
        return -1;
    }

    /**
     * Atualiza os atributos do objeto de acordo com a necessidade do usuario, pode
     * ser alterado um ou mais atributos do objeto.
     * Caso não queira alterar um certo atributo, devera informar (null) no devido
     * parametro.
     * 
     * @param id          (int)
     * @param novoNome    (String)
     * @param novaIdade   (Integer)
     * @param novoSalario (Double)
     */
    public void atualizar(int id, String novoNome, Integer novaIdade, Double novoSalario) {
        for (Funcionario funcionario : func) {
            if (funcionario.getId() == id) {
                if (novoNome != null) {
                    funcionario.setNome(novoNome);
                }
                if (novaIdade != null) {
                    funcionario.setIdade(novaIdade);
                }
                if (novoSalario != null) {
                    funcionario.setSalario(novoSalario);
                }
            }
        }
    }

    /**
     * Ordena a lista de funcionarios em ordem alfabetica, com base no nome de cada
     * funcionario
     */
    public void ordenarVetor() {
        int n = func.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (func[j].getNome().compareTo(func[j + 1].getNome()) > 0) {
                    Funcionario aux = func[j];
                    func[j] = func[j + 1];
                    func[j + 1] = aux;
                }
            }
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario[] getFunc() {
        return func;
    }

    public void setFunc(Funcionario[] func) {
        this.func = func;
    }

    @Override
    public String toString() {
        return "Empresa [cnpj=" + cnpj + ", func=" + Arrays.toString(func) + "]";
    }

}
