package Service;

import Infrastructure.FuncionariosRepositorio;
import Domain.Funcionario;
import Exception.FuncionarioNaoEncontradoException;

import java.util.List;

public class FuncionarioServico {
    private FuncionariosRepositorio funcionarioRepository;

    public FuncionarioServico(FuncionariosRepositorio funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        if (funcionario == null)
            throw new IllegalArgumentException("Funcionário não pode ser nulo.");

        if (funcionarioRepository.existeFuncionarioPorId(funcionario.getId()))
            throw new IllegalArgumentException("Já existe um funcionário com esse ID.");

        if (funcionario.getSalarioBase() <= 0)
            throw new IllegalArgumentException("O salário deve ser maior que zero.");

        funcionarioRepository.adicionarFuncionario(funcionario);
    }

    public Funcionario buscarFuncionarioPorId(int id) {
        Funcionario funcionario = funcionarioRepository.buscarFuncionarioPorId(id);

        if (funcionario == null)
            throw new FuncionarioNaoEncontradoException("Funcionário não encontrado.");

        return funcionario;
    }

    public Funcionario buscarFuncionarioPorMatricula(String matricula) {
        Funcionario funcionario = funcionarioRepository.buscarFuncionarioPorMatricula(matricula);

        if (funcionario == null)
            throw new FuncionarioNaoEncontradoException("Funcionário não encontrado.");

        return funcionario;
    }

    public void removerFuncionario(int id) {
        Funcionario funcionario = buscarFuncionarioPorId(id);

        funcionarioRepository.removerFuncionario(funcionario);
    }

    public void alterarSalario(int id, double novoSalario) {
        Funcionario funcionario = buscarFuncionarioPorId(id);

        if (novoSalario <= 0)
            throw new IllegalArgumentException("O salário deve ser maior que zero.");

        funcionario.setSalarioBase(novoSalario);
    }

    public double calcularSalarioFuncionario(int id) {
        Funcionario funcionario = buscarFuncionarioPorId(id);

        return funcionario.calcularSalario();
    }

    public double calcularFolhaSalarial() {
        double total = 0;

        for (Funcionario funcionario : funcionarioRepository.listarTodosFuncionarios()) {
            total += funcionario.calcularSalario();
        }

        return total;
    }

    public void darAumento(int id, double percentual) {
        Funcionario funcionario = buscarFuncionarioPorId(id);

        if (percentual <= 0)
            throw new IllegalArgumentException("O percentual de aumento deve ser maior que zero.");

        double novoSalario = funcionario.getSalarioBase() + (funcionario.getSalarioBase() * percentual / 100);

        funcionario.setSalarioBase(novoSalario);
    }

    public List<Funcionario> buscarFuncionariosPorFaixaSalarial(double salarioMinimo, double salarioMaximo) {
        if (salarioMinimo < 0 || salarioMaximo < 0)
            throw new IllegalArgumentException("Os salários não podem ser negativos.");

        if (salarioMinimo > salarioMaximo)
            throw new IllegalArgumentException("O salário mínimo não pode ser maior que o salário máximo.");

        return funcionarioRepository.buscarFuncionariosPorFaixaSalarial(salarioMinimo, salarioMaximo);
    }

    public List<Funcionario> listarTodosFuncionarios(){
            return funcionarioRepository.listarTodosFuncionarios();
    }
}

