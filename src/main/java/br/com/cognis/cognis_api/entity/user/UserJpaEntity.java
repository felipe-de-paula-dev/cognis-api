package br.com.cognis.cognis_api.entity.user;

import br.com.cognis.cognis_api.entity.address.AddressJpaEntity;
import br.com.cognis.cognis_api.entity.email.EmailJpaEntity;
import br.com.cognis.cognis_api.entity.plan.UserPlanJpaEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.UUID;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UserJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    @CPF
    @Column(unique = true)
    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "email_id", unique = true)
    private EmailJpaEntity email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private AddressJpaEntity address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plan_id", unique = true)
    private UserPlanJpaEntity plan;

    private String login;
    private String password;
}

