package core.autoserviceapp.repository;

import core.autoserviceapp.model.Order;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query(value = "SELECT o "
            + "FROM Order o "
            + "JOIN FETCH CarOwner c "
            + "WHERE c.id = :id")
    List<Order> findAllByCarOwnerId(@Param("id") Long id);

    @Query(value = "SELECT o "
            + "FROM Order o "
            + "JOIN FETCH Workman w "
            + "WHERE w.id = :id")
    List<Order> findAllByWorkmanId(@Param("id") Long id);

    @Transactional
    @Query(value = "UPDATE goods "
            + "SET order_id = ?1 "
            + "WHERE id IN ?2", nativeQuery = true)
    Order addGoodsToOrder(Long orderId, Iterable<Long> goodsId);

    @Query(value = "SELECT COUNT(*) "
            + "FROM orders "
            + "WHERE car_owner_id = ?1", nativeQuery = true)
    Long countOrdersByCarOwnerId(Long id);
}
