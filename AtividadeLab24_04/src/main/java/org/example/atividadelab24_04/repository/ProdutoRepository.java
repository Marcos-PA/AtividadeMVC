package org.example.atividadelab24_04.repository;


import org.example.atividadelab24_04.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
