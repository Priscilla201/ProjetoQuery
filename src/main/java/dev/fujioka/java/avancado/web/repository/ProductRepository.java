package dev.fujioka.java.avancado.web.repository;

import dev.fujioka.java.avancado.web.domain.Product;

import org.aspectj.weaver.Lint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface ProductRepository
     extends JpaRepository<Product, Long> {
	
	@Query("SELECT p from Product p where p.name = :name")
	public List<Product> buscarProductByName(@Param ("name")String name);
	
	@Query("SELECT p from Product p where p.description like '%String%'")
	public List<Product> acharProductByDescription(String description);
	
	@Query("SELECT p FROM Product p WHERE p.id = :id")
	public List<Product> acharProductById(Long id);
	
	
	

}
