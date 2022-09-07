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
@Table(name = "workmans")
public class Workman {
    @Id
    @GeneratedValue(generator = "workmans_id_seq", strategy =  GenerationType.SEQUENCE)
    @SequenceGenerator(name = "workmans_id_seq", sequenceName = "workmans_id_seq", allocationSize = 1)
    private Long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "workman_id")
    private List<Order> completedOrders;
}
