package Infrastructure;

import Domain.CategoriaProduto;
import Domain.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutosRepositorio {
    private List<Produto> listaProdutos;

    public ProdutosRepositorio() {listaProdutos = new ArrayList<>();}

    public void adicionarProduto(Produto produto) {listaProdutos.add(produto);}

    public void removerProduto(Produto produto) {listaProdutos.remove(produto);}

    public boolean existeProdutoPorId(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id)
                return true;
        }
        return false;
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id)
                return produto;
        }
        return null;
    }

    public List<Produto> buscarProdutosPorCategoria(CategoriaProduto categoria) {
        List<Produto> produtosEncontrados = new ArrayList<>();

        for (Produto produto : listaProdutos) {
            if (produto.getCategoria() == categoria)
                produtosEncontrados.add(produto);
        }
        return produtosEncontrados;
    }

    public List<Produto> buscarProdutosPorFornecedor(int idFornecedor) {
        List<Produto> produtosEncontrados = new ArrayList<>();

        for (Produto produto : listaProdutos) {
            if (produto.getFornecedor().getId() == idFornecedor)
                produtosEncontrados.add(produto);
        }
        return produtosEncontrados;
    }

    public List<Produto> buscarProdutosPorNome(String nome) {
        List<Produto> produtosEncontrados = new ArrayList<>();

        for (Produto produto : listaProdutos) {
            if (produto.getNome().toLowerCase().contains(nome.toLowerCase()))
                produtosEncontrados.add(produto);
        }
        return produtosEncontrados;
    }

    public List<Produto> buscarProdutosDisponiveis() {
        List<Produto> produtosDisponiveis = new ArrayList<>();

        for (Produto produto : listaProdutos) {
            if (produto.getQtdEmEstoque() > 0)
                produtosDisponiveis.add(produto);
        }
        return produtosDisponiveis;
    }

    public List<Produto> buscarProdutosPorFaixaDePreco(double precoMinimo, double precoMaximo) {
        List<Produto> produtosEncontrados = new ArrayList<>();

        for (Produto produto : listaProdutos) {
            if (produto.getPreco() >= precoMinimo && produto.getPreco() <= precoMaximo)
                produtosEncontrados.add(produto);
        }

        return produtosEncontrados;
    }

    public List<Produto> listarTodosProdutos() {return listaProdutos;}
}
