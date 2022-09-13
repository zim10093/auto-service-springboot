package core.autoserviceapp.repository;

import core.autoserviceapp.model.Goods;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Long> {
    List<Goods> getGoodsByIdIn(List<Long> ids);
}
