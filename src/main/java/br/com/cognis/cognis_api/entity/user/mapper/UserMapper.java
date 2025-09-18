package br.com.cognis.cognis_api.entity.user.mapper;

import br.com.cognis.cognis_api.entity.plan.mapper.UserPlanMapper;
import br.com.cognis.cognis_api.entity.user.UserJpaEntity;
import br.com.cognis.cognis_api.entity.user.dto.UserCreateRequest;
import br.com.cognis.cognis_api.entity.user.dto.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = UserPlanMapper.class)
public interface UserMapper {
    UserJpaEntity toEntity(UserCreateRequest request);
    UserResponse toDto(UserJpaEntity entity);
}
