package core.autoserviceapp.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(generator = "orders_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "orders_id_seq", sequenceName = "orders_id_seq", allocationSize = 1)
    private Long id;
    @ManyToOne
    private Car car;
    private String problem;
    private LocalDate acceptedDate;
    @OneToMany
    @JoinColumn(name = "order_id")
    private List<Service> includedServices;
    @OneToMany
    @JoinColumn(name = "order_id")
    private List<Goods> includedGoods;
    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private OrderStatus orderStatus;
    private BigDecimal totalCost;
    private LocalDate finishDate;
}
