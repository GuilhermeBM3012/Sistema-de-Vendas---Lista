package Infrastructure;

import Domain.Pedido;
import Domain.StatusPedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidosRepositorio {
    private List<Pedido> listaPedidos;

    public  PedidosRepositorio(){listaPedidos = new ArrayList<>();}

    public void adicionarPedido(Pedido pedido){listaPedidos.add(pedido);}

    public void removerPedido(Pedido pedido){listaPedidos.remove(pedido);}

    public boolean existePedidoPorId(int id) {
        for (Pedido pedido : listaPedidos) {
            if (pedido.getId() == id)
                return true;
        }
        return false;
    }

    public Pedido buscarPedidoPorId(int id){
        for (Pedido pedido : listaPedidos){
            if (pedido.getId() == id)
                return pedido;
        }
        return null;
    }

    public List<Pedido> buscarPedidosPorCliente(int idCliente) {
        List<Pedido> pedidosCliente = new ArrayList<>();

        for (Pedido pedido : listaPedidos) {
            if (pedido.getCliente().getId() == idCliente)
                pedidosCliente.add(pedido);
        }
        return pedidosCliente;
    }

    public List<Pedido> buscarPedidosPorStatus(StatusPedido status) {
        List<Pedido> pedidosEncontrados = new ArrayList<>();

        for (Pedido pedido : listaPedidos) {
            if (pedido.getStatus() == status)
                pedidosEncontrados.add(pedido);
        }
        return pedidosEncontrados;
    }

    public List<Pedido> buscarPedidosPorPeriodo(LocalDate inicio, LocalDate fim) {
        List<Pedido> pedidosEncontrados = new ArrayList<>();

        for (Pedido pedido : listaPedidos) {
            if (!pedido.getDataPedido().isBefore(inicio) && !pedido.getDataPedido().isAfter(fim))
                pedidosEncontrados.add(pedido);
        }
        return pedidosEncontrados;
    }

    public List<Pedido> listarTodosPedidos(){return listaPedidos;}
}
