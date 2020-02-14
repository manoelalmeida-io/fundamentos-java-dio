package one.digitalinnovation.DIP.problem;

import java.util.ArrayList;
import java.util.List;

import one.digitalinnovation.SRP.problem.Produto;

@SuppressWarnings("unused")
public class ProdutoRepository {

  private MySqlConnection mySqlConnection;

  public ProdutoRepository(MySqlConnection mySqlConnection) {
    this.mySqlConnection = mySqlConnection;
  }

  public List<Produto> buscarProdutos() {
    // retorna a lista de produtos da base de dados
    return new ArrayList<>();
  }

  public void salvarProduto(Produto produto) {
    // salva a lista de produtos na base de dados
  }
}