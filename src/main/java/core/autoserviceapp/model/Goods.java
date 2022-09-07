package core.autoserviceapp.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "goods")
public class Goods {
    @Id
    @GeneratedValue(generator = "goods_id_seq", strategy =  GenerationType.SEQUENCE)
    @SequenceGenerator(name = "goods_id_seq", sequenceName = "goods_id_seq", allocationSize = 1)
    private Long id;
    private String name;
    private BigDecimal price;
}
