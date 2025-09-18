package br.com.cognis.cognis_api.entity.plan;

import br.com.cognis.cognis_api.entity.plan.enuns.PlanType;
import br.com.cognis.cognis_api.entity.user.UserJpaEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "plan")
@Getter
@Setter
public class UserPlanJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private int remainingDays;

    private LocalDate lastRenewalDate;

    @Enumerated(EnumType.STRING)
    private PlanType planType;
}
