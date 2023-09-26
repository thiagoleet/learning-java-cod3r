package me.thiagoleite.exerciciossb.model.repositories;

import me.thiagoleite.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto, Integer> {
}
