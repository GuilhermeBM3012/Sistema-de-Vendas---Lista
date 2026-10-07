package Infrastructure;

import Domain.Fornecedor;

import java.util.ArrayList;
import java.util.List;

public class FornecedorRepositorio {
    private List<Fornecedor> listaFornecedores;

    public FornecedorRepositorio(){listaFornecedores = new ArrayList<>();}

    public void adicionarFornecedor(Fornecedor fornecedor){listaFornecedores.add(fornecedor);}

    public void removerFornecedor(Fornecedor fornecedor){listaFornecedores.remove(fornecedor);}

    public boolean existeFornecedorPorId(int id) {
        for (Fornecedor fornecedor : listaFornecedores) {
            if (fornecedor.getId() == id)
                return true;
        }
        return false;
    }

    public Fornecedor buscarFornecedorPorId(int id){
        for (Fornecedor fornecedor : listaFornecedores){
            if (fornecedor.getId() == id)
                return fornecedor;
        }
        return null;
    }

    public boolean existePorCnpj(String cnpj) {
        return buscarFornecedorPorCnpj(cnpj) != null;
    }

    public Fornecedor buscarFornecedorPorCnpj(String cnpj) {
        for (Fornecedor fornecedor : listaFornecedores) {
            if (fornecedor.getCnpj().equals(cnpj))
                return fornecedor;
        }
        return null;
    }

    public List<Fornecedor> listarTodosFornecedores(){return listaFornecedores;}
}
