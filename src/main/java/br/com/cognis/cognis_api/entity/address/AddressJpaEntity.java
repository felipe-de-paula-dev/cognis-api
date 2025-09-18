package br.com.cognis.cognis_api.entity.address;

import br.com.cognis.cognis_api.entity.address.enuns.TypeStreet;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "address")
@Getter
@Setter
public class AddressJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Enumerated(EnumType.STRING)
    private TypeStreet typeStreet;
    private String street;
    private Integer number;
    private String complement;
    private String neighborhood;
    private Integer zipCode;
    private String city;
    private String state;
    private String country;
}
