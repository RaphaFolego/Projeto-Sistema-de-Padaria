package com.mycompany.padaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Raphael Folego
 */
public class Produto {
    
    private String Id;
    private double preco;
    private String unidade;
    private String nome;
    //constructors

    //getters and setters
    public String getId() {
        return this.Id;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getUnidade() {
        return this.unidade;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    //methods
    public void AlterarProduto() {
        //Define o comando SQL
        String sql = "UPDATE tb_produto SET nome = ?, preco = ?, unidade = ? WHERE Id = ?";
        
        //Abre a conexão
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            
            //Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            
            //Preenche os dados
            ps.setString(1, nome);
            ps.setDouble(2, preco);
            ps.setString(3, unidade);
            ps.setString(4, Id);
            
            //Executa o comando
            ps.execute();
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void ExcluirProduto() {
        //Define o comando SQL
        String sql = "DELETE FROM tb_produto WHERE Id = ?";
        
        //Abre a conexão
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            
            //Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            
            //Preenche os dados faltantes
            ps.setString(1, Id);
            
            //Executa o comando
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void ConsultarProduto() {
        //Define o comando SQL
        String sql = "SELECT * FROM tb_produto";
        
        //Abre a conexão
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            
            //Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            
            //Executa o comando e guarda o resultado em um ResultSet
            ResultSet rs = ps.executeQuery();
            
            //Itera sobre o resultado
            while(rs.next()){
                String Id = rs.getString("Id");
                String nome = rs.getString("nome");
                String unidade = rs.getString("unidade");
                Double preco = rs.getDouble("preco");
                String aux = String.format(" Id: %d, Nome: %s, Unidade: %s, Preco: %s",
                        Id,
                        nome,
                        unidade,
                        preco
                        );
                JOptionPane.showMessageDialog(null, aux);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    

    public void RegistrarProduto() {
        //Define o comando SQL
        String sql = "INSERT INTO tb_produto(nome, preco, unidade) VALUES(?, ?, ?)";
        
        //Abre uma conexão
        ConnectionFactory factory= new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            
            //Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            
            // Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setDouble(2, preco);
            ps.setString(3, unidade);
            
            //Executa o comando
            ps.execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
