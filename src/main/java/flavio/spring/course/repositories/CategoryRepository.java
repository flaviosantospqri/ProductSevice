package flavio.spring.course.repositories;

import flavio.spring.course.entities.Category;
import flavio.spring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
