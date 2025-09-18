package br.com.cognis.cognis_api.entity.email.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailRequest {
    private String nomeUsuario;
    private String dominio;
    private String terminacao;
}
