package com.museus2w.DAO;

import org.springframework.stereotype.Component;

import com.museus2w.model.Usuario;


@Component
public interface UsuarioDAO {
		
	public Usuario inclui (Usuario umUsuario);
	
	public Usuario recuperaUmUsuarioPorContaESenha(String login, String senha);
}
