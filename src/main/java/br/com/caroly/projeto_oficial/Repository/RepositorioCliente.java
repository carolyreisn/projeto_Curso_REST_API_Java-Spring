package br.com.caroly.projeto_oficial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caroly.projeto_oficial.Entity.Cliente;

public interface RepositorioCliente extends JpaRepository<Cliente, Long> {
    
}
