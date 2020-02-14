package one.digitalinnovation.DIP.solution;

import java.util.ArrayList;
import java.util.List;

import one.digitalinnovation.SRP.solution.Produto;

@SuppressWarnings("unused")
public class ProdutoRepository {

  private DbConnection dbConnection;

  public ProdutoRepository(DbConnection dbConnection) {
    this.dbConnection = dbConnection;
  }

  public List<Produto> buscarProdutos() {
    // retorna a lista de produtos da base de dados
    return new ArrayList<>();
  }

  public void salvarProduto(Produto produto) {
    // salva produto na base de dados
  }
}