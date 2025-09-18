package br.com.cognis.cognis_api.entity.address.mapper;

import br.com.cognis.cognis_api.entity.address.AddressJpaEntity;
import br.com.cognis.cognis_api.entity.address.dto.AddressRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressJpaEntity toEntity(AddressRequest request);
    AddressRequest toDto(AddressJpaEntity entity);
}
