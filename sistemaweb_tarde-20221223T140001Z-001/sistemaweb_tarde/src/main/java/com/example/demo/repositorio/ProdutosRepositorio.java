package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Produtos;
@Repository
public interface ProdutosRepositorio extends JpaRepository<Produtos, Long> {

}
