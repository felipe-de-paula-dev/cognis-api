package br.com.cognis.cognis_api.entity.plan.mapper;

import br.com.cognis.cognis_api.entity.address.mapper.AddressMapper;
import br.com.cognis.cognis_api.entity.email.mapper.EmailMapper;
import br.com.cognis.cognis_api.entity.plan.UserPlanJpaEntity;
import br.com.cognis.cognis_api.entity.plan.dto.UserPlanRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AddressMapper.class, EmailMapper.class, UserPlanMapper.class})
public interface UserPlanMapper {
    UserPlanJpaEntity toEntity(UserPlanRequest request);
    UserPlanRequest toDtop(UserPlanJpaEntity entity);
}
