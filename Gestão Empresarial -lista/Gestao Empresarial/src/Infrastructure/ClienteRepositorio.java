package Infrastructure;

import Domain.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositorio {
    private List<Cliente> listaClientes;

    public  ClienteRepositorio(){listaClientes = new ArrayList<>();}

    public void adicionarCliente(Cliente cliente){listaClientes.add(cliente);}

    public void removerCliente(Cliente cliente){listaClientes.remove(cliente);}

    public boolean existeClientePorId(int id) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == id)
                return true;
        }
        return false;
    }

    public Cliente buscarClientePorId(int id){
        for (Cliente cliente : listaClientes){
            if (cliente.getId() == id)
                return cliente;
        }
        return null;
    }

    public boolean existeClientePorCpf(String cpf) {
        return buscarClientePorCpf(cpf) != null;
    }

    public Cliente buscarClientePorCpf(String cpf) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf().equals(cpf))
                return cliente;
        }
        return null;
    }

    public List<Cliente> listarTodosClientes(){return listaClientes;}
}
