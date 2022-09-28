package br.com.caroly.projeto_oficial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caroly.projeto_oficial.Entity.Cliente;
import br.com.caroly.projeto_oficial.Repository.RepositorioCliente;

@RestController
@RequestMapping("/clientes")
public class ClienteREST {

    @Autowired
    private RepositorioCliente repositorio;

    @GetMapping
    public List<Cliente> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Cliente cliente){
        repositorio.save(cliente);
    }

    @PutMapping
    public void alterar(@RequestBody Cliente cliente){
        if(cliente.getId()>0)
            repositorio.save(cliente);
    }

    @DeleteMapping
    public void excluir(@RequestBody Cliente cliente){
        repositorio.delete(cliente);
    }
    
}
