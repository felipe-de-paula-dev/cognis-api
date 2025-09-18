package br.com.cognis.cognis_api.entity.plan.dto;

import br.com.cognis.cognis_api.entity.plan.enuns.PlanType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserPlanRequest {
    private int remainingDays;
    private LocalDate lastRenewalDate;
    private PlanType planType;
}