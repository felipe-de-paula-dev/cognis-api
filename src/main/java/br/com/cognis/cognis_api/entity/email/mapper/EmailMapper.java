package br.com.cognis.cognis_api.entity.email.mapper;

import br.com.cognis.cognis_api.entity.email.EmailJpaEntity;
import br.com.cognis.cognis_api.entity.email.dto.EmailRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmailMapper {
    EmailJpaEntity toEntity(EmailRequest request);
    EmailRequest toDto(EmailJpaEntity entity);
}
