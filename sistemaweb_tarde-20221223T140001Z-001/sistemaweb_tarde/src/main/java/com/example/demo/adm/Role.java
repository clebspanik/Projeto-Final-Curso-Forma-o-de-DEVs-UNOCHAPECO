package com.example.demo.adm;

import java.util.ArrayList;
import java.util.List;

public enum Role {
	ADMIN("ADMIN"),
	USER("USER");
	
	private String nome;
	
	private Role (String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return getNome();
	}
	
	public static List<String>getRoles(){
		List<String> roles = new ArrayList<String>();
		for (Role role : values()) {
			roles.add(role.getNome());
		}
		return roles;
	}
	
}
