package me.thiagoleite.exerciciossb.model.repositories;

import me.thiagoleite.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
