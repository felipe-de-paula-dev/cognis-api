package br.com.cognis.cognis_api.entity.user.dto;

import br.com.cognis.cognis_api.entity.address.AddressJpaEntity;
import br.com.cognis.cognis_api.entity.address.dto.AddressRequest;
import br.com.cognis.cognis_api.entity.email.EmailJpaEntity;
import br.com.cognis.cognis_api.entity.email.dto.EmailRequest;
import br.com.cognis.cognis_api.entity.plan.UserPlanJpaEntity;
import br.com.cognis.cognis_api.entity.plan.dto.UserPlanRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequest {
    private String name;
    private String cpf;
    private EmailRequest email;
    private AddressRequest address;
    private UserPlanRequest plan;
    private String login;
    private String password;
}
