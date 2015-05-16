package br.com.agenda.dao;

import br.com.agenda.model.Contatos;
import br.com.agenda.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class ContatosDao implements InterfaceContatos {
    Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
                
    @Override
    public Contatos getContatos(Long id) {
        return (Contatos) ss.load(Contatos.class, id);        
    }

    @Override
    public void salvar(Contatos contatos) {
        ss.beginTransaction();
        ss.save(contatos);
        ss.getTransaction().commit();        
    }

    @Override
    public void remover(Contatos contatos) {
        ss.beginTransaction();
        ss.delete(contatos);
        ss.getTransaction().commit();
    }

    @Override
    public void atualizar(Contatos contatos) {
        ss.beginTransaction();
        ss.update(contatos);
        ss.getTransaction().commit();
    }

    @Override
    public List<Contatos> list() {
        ss.beginTransaction();
        List lista = ss.createQuery("From contatos").list();
        ss.getTransaction().commit();
        return lista;
    }    
}
