package kg.home.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "COUNTRY")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_seq_gen")
    @SequenceGenerator(
            name = "country_seq_gen",
            sequenceName = "COUNTRY_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CODE_COUNTRY", length = 3, nullable = false)
    private String codeCountry;

    @Column(name = "NAME_COUNTRY", length = 100, nullable = false)
    private String nameCountry;

    @Column(name = "ORDER_NUMBER")
    private Integer orderNumber;
}
