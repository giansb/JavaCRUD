/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocrudoperation;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 182210120
 */
public class Produto {
    int cod;
    String nome;
    int qntd;
    float preco;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public Produto registrarProduto(Produto p , DefaultTableModel table) {
        String[] coluna ={"","","",""};
        
        coluna[0] =  String.valueOf(p.getCod());
        coluna[1] = p.getNome();
        coluna[2] = String.valueOf(p.getPreco());
        coluna[3] = String.valueOf(p.getQntd());
        
        table.addRow(coluna);
        
        return p;
    }
    
    
    
}
