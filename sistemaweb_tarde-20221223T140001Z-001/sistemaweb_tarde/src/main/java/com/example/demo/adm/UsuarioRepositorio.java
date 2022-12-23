package com.example.demo.adm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	Usuario findByUsername(String username);
}
