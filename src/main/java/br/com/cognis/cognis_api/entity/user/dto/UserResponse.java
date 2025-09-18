package br.com.cognis.cognis_api.entity.user.dto;


import br.com.cognis.cognis_api.entity.address.AddressJpaEntity;
import br.com.cognis.cognis_api.entity.email.EmailJpaEntity;
import br.com.cognis.cognis_api.entity.plan.UserPlanJpaEntity;
import br.com.cognis.cognis_api.entity.plan.dto.UserPlanRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserResponse{
    private UUID id;
    private String name;
    private String cpf;
    private EmailJpaEntity email;
    private AddressJpaEntity address;
    private UserPlanJpaEntity plan;
    private String login;
    private String password;
}