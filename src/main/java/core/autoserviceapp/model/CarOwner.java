package core.autoserviceapp.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "car_owners")
public class CarOwner {
    @Id
    @GeneratedValue(generator = "car_owners_id_seq", strategy =  GenerationType.SEQUENCE)
    @SequenceGenerator(name = "car_owners_id_seq", sequenceName = "car_owners_id_seq", allocationSize = 1)
    private Long id;
    @OneToMany
    @JoinColumn(name = "car_owner_id")
    private List<Car> car;
    @OneToMany
    @JoinColumn(name = "car_owner_id")
    private List<Order> orderList;
}
