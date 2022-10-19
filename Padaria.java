package com.mycompany.padaria;

import javax.swing.JOptionPane;

public class Padaria {

    public static void main(String[] args) {
        int op;
        String menuPadaria = "1- Registrar produto\n2- Alterar produto\n3- Excluir produto\n4- Consultar produto\n0- Cancelar operação";
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menuPadaria));
            switch(op){
                case 1:{
                    String nome = JOptionPane.showInputDialog("Nome: ");
                    Double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço: "));
                    String unidade = JOptionPane.showInputDialog("Unidade");
                    Produto p = new Produto();
                    p.setNome(nome);
                    p.setPreco(preco);
                    p.setUnidade(unidade);
                    p.RegistrarProduto();
                
                    break;
                }
                case 2:{
                    String nome = JOptionPane.showInputDialog("Nome: ");
                    Double preco = Double.parseDouble(JOptionPane.showInputDialog("Preco: "));
                    String unidade = JOptionPane.showInputDialog("Unidade: ");
                    String Id = JOptionPane.showInputDialog("Id: ");
                    Produto p = new Produto();
                    p.setNome(nome);
                    p.setPreco(preco);
                    p.setUnidade(unidade);
                    p.setId(Id);
                
                    p.AlterarProduto();
                    break;
                }
                case 3:{
                    String Id = JOptionPane.showInputDialog("Id: ");
                    Produto p = new Produto();
                    p.setId(Id);
                
                    p.ExcluirProduto();
                    break;
                }
                case 4:{
                    Produto p = new Produto();
                    p.ConsultarProduto();
                    break;
                }
                case 0:{
                    
                }
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }while(op != 0);
    }
}
