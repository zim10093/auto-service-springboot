package core.autoserviceapp.repository;

import core.autoserviceapp.model.Favor;
import core.autoserviceapp.model.FavorStatus;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavorRepository extends JpaRepository<Favor, Long> {
    List<Favor> getFavorsByIdIn(List<Long> ids);

    List<Favor> getFavorsByWorkmanIdAndFavorStatus(Long id, FavorStatus status);
}
