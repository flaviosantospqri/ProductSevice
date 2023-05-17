package flavio.spring.course.repositories;

import flavio.spring.course.entities.Category;
import flavio.spring.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
