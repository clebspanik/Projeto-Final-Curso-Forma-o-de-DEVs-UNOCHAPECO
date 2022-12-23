package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


import com.example.demo.adm.Role;
import com.example.demo.adm.Usuario;
import com.example.demo.adm.UsuarioRepositorio;




@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {

	@Autowired
	private UsuarioRepositorio usuarioRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public void run(String... args) throws Exception {
	
	//Após Exucutar a primeira vez comentar
	/**	Usuario u1 = new Usuario("admin", passwordEncoder.encode("admin"));
		u1.setRole(Role.ADMIN.getNome());
		
		Usuario u2 = new Usuario("user", passwordEncoder.encode("user"));
		
		usuarioRepo.save(u1);
		usuarioRepo.save(u2); */
	}
}
