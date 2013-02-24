package com.museus2w.DAOImpl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.museus2w.DAO.UsuarioDAO;
import com.museus2w.model.Usuario;

@Component
public class UsuarioDAOImpl implements UsuarioDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Usuario inclui(Usuario usuario) {
		em.persist(usuario);
		return usuario;
	}

	@Override
	public Usuario recuperaUmUsuarioPorContaESenha(String login, String senha) {
		Usuario usuario;
		
		try
		{
			usuario = (Usuario) em
				.createQuery("select u from Usuario u where u.login = :conta and u.senha = :senha")
				.setParameter("conta", login)
				.setParameter("senha", senha)
				.getSingleResult();
		}
		catch(NoResultException e)
		{
			throw new NoResultException();
		}
		
		return usuario;
	}

}
