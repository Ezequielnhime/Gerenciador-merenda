/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ConnectionFactory;
import model.Endereco;

/**
 *
 * @author TI
 */
public class EnderecoDAO {
    private static final String SQL_INSERIR_ENDERECO = "insert into contatos (id_usuario, nome, email, endereco) values(?,?,?,?)";
    private static final String SQL_LISTAR_ENDERECO = "select * from contatos where id_usuario = ? order by nome";
    private static final String SQL_CONSULTAR_ENDERECO = "select * from contatos where id_usuario = ? and nome like ? order by nome";
    private static final String SQL_EXCLUIR_ENDERECO = "delete from contatos where id = ?";
    private static final String SQL_ALTERAR_ENDERECO = "update contatos set nome=?, email=?, endereco=? where id=?";

    private Connection connection;

    public void adicionar(Endereco endereco) throws SQLException, ClassNotFoundException {
        try {
            connection = ConnectionFactory.getConnection();
            try {
                PreparedStatement stmt = connection.prepareStatement(SQL_INSERIR_ENDERECO);
                stmt.setLong(1, endereco.getId());
                stmt.setString(2, endereco.getCidade());
                stmt.setString(3, endereco.getBairro());
                stmt.setInt(4, endereco.getNumero());
                stmt.setString(5, endereco.getEstado());
                stmt.setString(6, endereco.getRua());
                stmt.execute();
                stmt.close();
            } finally {
                connection.close();
            }
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public List<Endereco> listar() throws SQLException, ClassNotFoundException {
        List<Endereco> enderecos = new ArrayList<>();
        try {
            connection = ConnectionFactory.getConnection();
            try {
                PreparedStatement stmt = connection.
                        prepareStatement(SQL_LISTAR_ENDERECO);
                
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Endereco e = new Endereco();
                    e.setId(rs.getLong("id"));
                    e.setNumero(rs.getInt("numero"));
                    e.setBairro(rs.getString("bairro"));
                    e.setCidade(rs.getString("cidade"));
                    e.setEstado(rs.getString("estado"));
                    e.setRua(rs.getString("rua"));
                    enderecos.add(e);
                }
                stmt.close();
                rs.close();
            } finally {
                connection.close();
            }
        } catch (SQLException e) {
            throw e;
        }
        return enderecos;
    }
    
    
    
    public void excluir(Long id) throws SQLException, ClassNotFoundException {
        try {
            connection = ConnectionFactory.getConnection();
            try {
                PreparedStatement stmt = connection.prepareStatement(SQL_EXCLUIR_ENDERECO);
                stmt.setLong(1, id);
                stmt.execute();
                stmt.close();
            } finally {
                connection.close();
            }
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public void alterar(Endereco endereco) throws SQLException, ClassNotFoundException {
        try {
            connection = ConnectionFactory.getConnection();
            try {
                System.out.println(endereco);
                PreparedStatement stmt = connection.prepareStatement(SQL_ALTERAR_ENDERECO);
                stmt.setString(2, endereco.getCidade());
                stmt.setString(3, endereco.getBairro());
                stmt.setInt(4, endereco.getNumero());
                stmt.setString(5, endereco.getEstado());
                 stmt.setString(6, endereco.getRua());
                stmt.execute();
                stmt.close();
            } finally {
                connection.close();
            }
        } catch (SQLException ex) {
            throw ex;
        }
    }
}
