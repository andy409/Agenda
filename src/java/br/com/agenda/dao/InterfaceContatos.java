/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.agenda.dao;

import br.com.agenda.model.Contatos;
import java.util.List;

public interface InterfaceContatos {
    public Contatos getContatos(Long id);
    public void salvar(Contatos contatos);
    public void remover(Contatos contatos);
    public void atualizar(Contatos contatos);
    public List<Contatos> list();
            
    
}
