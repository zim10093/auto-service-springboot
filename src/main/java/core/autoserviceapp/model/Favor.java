package core.autoserviceapp.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "favors")
public class Favor {
    @Id
    @GeneratedValue(generator = "favors_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "favors_id_seq", sequenceName = "favors_id_seq",
            allocationSize = 1)
    private Long id;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Workman workman;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private FavorStatus favorStatus;
}
