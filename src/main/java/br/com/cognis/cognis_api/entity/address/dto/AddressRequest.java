package br.com.cognis.cognis_api.entity.address.dto;

import br.com.cognis.cognis_api.entity.address.enuns.TypeStreet;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressRequest {
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
