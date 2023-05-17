package flavio.spring.course.repositories;

import flavio.spring.course.entities.Category;
import flavio.spring.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
