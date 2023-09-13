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
public class TesteCRUD {
    
    public void TesteRegistro(DefaultTableModel model,String p){
        
        //String cod = (String) model.getValueAt(0, 0);
        String nome = (String) model.getValueAt(0, 1);
        
        //System.out.println(cod);
        System.out.println(nome.toUpperCase());
        System.out.println(p.toUpperCase());
        if(nome.toUpperCase().equals(p.toUpperCase())){
            System.out.println("teste realizado com sucesso. Tudo funcionando");
        } else {
            System.out.println("Ops! Ocorreu um erro no teste. Os paramêtros não batem");
        }
    }
}
