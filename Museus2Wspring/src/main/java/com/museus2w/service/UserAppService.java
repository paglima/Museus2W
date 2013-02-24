package com.museus2w.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.museus2w.DAO.UsuarioDAO;
import com.museus2w.model.Usuario;

@Component
public class UserAppService {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Transactional
	public Usuario inclui(Usuario umUsuario) 
	{	return usuarioDAO.inclui(umUsuario);
	}	
	
	public Usuario recuperaUmUsuarioPorLoginESenha(String login, String senha){
		
		return null;
	}
}
