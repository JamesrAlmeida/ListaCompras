package br.com.umc.lista.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.umc.lista.ConnectionFactory;
import br.com.umc.lista.modelo.Produto;

public class ProdutoDao {
	private final Connection connection;

	public ProdutoDao() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void adiciona(Produto produto) {
		String sql = "insert into produtos (categoria, descricao, qtdProd) values (?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getCategoriaProduto());
			stmt.setString(2, produto.getDescricaoProduto());
			stmt.setDouble(3, produto.getQuantidadeProduto());
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Produto produto) {

		if (produto.getId() == null) {
			throw new IllegalStateException("Id do produto n�o deve ser nula.");
		}

		String sql = "delete from produtos where idProd = ?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, produto.getId());
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Produto produto) {
		String sql = "update produtos set categoria = ?, descricao = ?, qtdProd = ? where idProd = ?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getCategoriaProduto());
			stmt.setString(2, produto.getDescricaoProduto());
			stmt.setDouble(3, produto.getQuantidadeProduto());
//			stmt.setDate(4, produto.getDataFinalizacao() != null ? new Date(
//					produto.getDataFinalizacao().getTimeInMillis()) : null);
			stmt.setLong(4, produto.getId());
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Produto> lista() {
		try {
			List<Produto> produtos = new ArrayList<Produto>();
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from produtos");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// adiciona o produto na lista
				produtos.add(populaProduto(rs));
			}

			rs.close();
			stmt.close();

			return produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Produto buscaPorId(Long id) {

		if (id == null) {
			throw new IllegalStateException("Id do produto não deve ser nula.");
		}

		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from produtos where idProd = ?");
			stmt.setLong(1, id);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				return populaProduto(rs);
			}

			rs.close();
			stmt.close();

			return null;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

//	public void finaliza(Long id) {
//
//		if (id == null) {
//			throw new IllegalStateException("Id da tarefa não deve ser nula.");
//		}
//
//		String sql = "update tarefas set finalizado = ?, dataFinalizacao = ? where id = ?";
//		PreparedStatement stmt;
//		try {
//			stmt = connection.prepareStatement(sql);
//			stmt.setBoolean(1, true);
//			stmt.setDate(2, new Date(Calendar.getInstance().getTimeInMillis()));
//			stmt.setLong(3, id);
//			stmt.execute();
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}

	private Produto populaProduto(ResultSet rs) throws SQLException {
		Produto produto = new Produto();

		// popula o objeto produto
		produto.setId(rs.getLong("idProd"));
		produto.setCategoriaProduto(rs.getString("categoria"));
		produto.setDescricaoProduto(rs.getString("descricao"));
		produto.setQuantidadeProduto(rs.getDouble("qtdProd"));

//		// popula a data de finalizacao do produto, fazendo a conversao
////		Date data = rs.getDate("dataFinalizacao");
////		if (data != null) {
////			Calendar dataFinalizacao = Calendar.getInstance();
////			dataFinalizacao.setTime(data);
////			tarefa.setDataFinalizacao(dataFinalizacao);
//		}
		return produto;
	}
}
