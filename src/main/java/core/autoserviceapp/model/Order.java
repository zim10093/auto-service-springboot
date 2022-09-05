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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Car car;
    private String problem;
    private LocalDate acceptedDate;
    @OneToMany
    private List<Service>  includedServices;
    @OneToMany
    private List<Goods> includedGoods;
    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private OrderStatus orderStatus;
    private BigDecimal totalCost;
    private LocalDate finishDate;
}
