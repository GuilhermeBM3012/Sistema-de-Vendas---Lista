package Infrastructure;

import Domain.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionariosRepositorio {
    private List<Funcionario> listaFuncionarios;

    public FuncionariosRepositorio() {listaFuncionarios = new ArrayList<>();}

    public void adicionarFuncionario(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        listaFuncionarios.remove(funcionario);
    }

    public boolean existeFuncionarioPorId(int id) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getId() == id)
                return true;
        }

        return false;
    }

    public Funcionario buscarFuncionarioPorId(int id) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getId() == id)
                return funcionario;
        }

        return null;
    }

    public Funcionario buscarFuncionarioPorMatricula(String matricula) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getMatricula().equals(matricula))
                return funcionario;
        }

        return null;
    }

    public boolean existeFuncionarioPorMatricula(String matricula) {
        return buscarFuncionarioPorMatricula(matricula) != null;
    }

    public List<Funcionario> buscarFuncionariosPorFaixaSalarial(double salarioMinimo, double salarioMaximo) {
        List<Funcionario> funcionariosEncontrados = new ArrayList<>();

        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getSalarioBase() >= salarioMinimo && funcionario.getSalarioBase() <= salarioMaximo)
                funcionariosEncontrados.add(funcionario);
        }

        return funcionariosEncontrados;
    }

    public List<Funcionario> buscarFuncionariosPorNome(String nome) {
        List<Funcionario> funcionariosEncontrados = new ArrayList<>();

        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getNomeCompleto().toLowerCase().contains(nome.toLowerCase()))
                funcionariosEncontrados.add(funcionario);
        }

        return funcionariosEncontrados;
    }

    public List<Funcionario> listarTodosFuncionarios() {
        return listaFuncionarios;
    }
}
