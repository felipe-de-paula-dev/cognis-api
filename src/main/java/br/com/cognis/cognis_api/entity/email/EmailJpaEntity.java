package br.com.cognis.cognis_api.entity.email;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "email")
@Getter
@Setter
public class EmailJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nomeUsuario;
    private String dominio;
    private String terminacao;
}
