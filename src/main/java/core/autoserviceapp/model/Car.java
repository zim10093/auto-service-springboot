package core.autoserviceapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(generator = "cars_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "cars_id_seq", sequenceName = "cars_id_seq", allocationSize = 1)
    private Long id;
    private String manufacturer;
    private String model;
    private Integer year;
    private String licenseNumber;
    @OneToOne
    private CarOwner carOwner;
}
