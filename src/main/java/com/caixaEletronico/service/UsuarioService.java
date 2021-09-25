package com.caixaEletronico.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caixaEletronico.model.UserLogin;
import com.caixaEletronico.model.Usuario;
import com.caixaEletronico.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;

	public Object CadastrarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean logar(UserLogin user) {
		// TODO Auto-generated method stub
		List<Usuario> usuarioEncontrado = new ArrayList<>();
		usuarioEncontrado = repository.findByConta(user.getConta());
		if (usuarioEncontrado.isEmpty()) {
			//deve devolver erro de usuário não encontrado
		}else {
			Usuario usuario = usuarioEncontrado.get(0);
			
			if (user.getSenha().equals(usuario.getSenha())) {
				return true;
			}
		}
		return false;
	}

}
