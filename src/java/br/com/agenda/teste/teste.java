/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.agenda.teste;

import br.com.agenda.dao.ContatosDao;
import br.com.agenda.dao.InterfaceContatos;
import br.com.agenda.model.Contatos;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Anderson
 */
public class teste {
    public static void main(String[] args){
        List<Contatos> lista = new ContatosDao().list();        
        String rec = "";
        
        for(Contatos contatos: lista){
            rec = rec + "\nNome: "+contatos.getNome()+"Email: "+contatos.getEmail()+"Telefone: "+contatos.getTelefone()+"Celular: "+contatos.getCelular();
            
            JOptionPane.showMessageDialog(null, rec);
        }
    }    
}
