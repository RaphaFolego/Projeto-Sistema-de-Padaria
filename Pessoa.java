package com.mycompany.padaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Raphael Folego
 */
public class Pessoa {

    //atributos
    private String nome;
    private String email;
    private String fone;
    private int codigo;

    //construtores
    //getters & setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //métodos
    public void RegistrarPessoa() {
        //Definir o comando SQL
        String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";

        //Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {

            //Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);

            //Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);

            //Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AlterarPessoa() {
        //Definir o comando SQL
        String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE codigo = ?";

        //Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {

            //Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);

            //Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);

            //Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ExcluirPessoa() {
        //Definir o comando SQL
        String sql = "DELETE FROM tb_pessoa WHERE codigo = ?";

        //Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {

            //Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);

            //Preenche os dados faltantes
            ps.setInt(1, codigo);

            //Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ConsultarPessoa() {
        //Definir o comando SQL
        String sql = "SELECT * FROM tb_pessoa";

        //Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {

            //Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);

            //Executa o comando e guarda o resultado em um ResultSet
            ResultSet rs = ps.executeQuery();

            //itera sobre o resultado
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String fone = rs.getString("fone");
                String email = rs.getString("email");
                String aux = String.format(
                        "Código: %d, Nome: %s, Fone: %s, Email: %s",
                        codigo,
                        nome,
                        fone,
                        email
                );
                JOptionPane.showMessageDialog(null, aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
