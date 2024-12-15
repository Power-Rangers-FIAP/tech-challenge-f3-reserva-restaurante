package br.com.fiap.reservarestaurante.application.domain.usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class Usuario {

  private UsuarioId id;
  private String nome;
  private String email;
  private String senha;

  public static Usuario create(String nome, String email, String senha) {

    final var usuarioid = UsuarioId.generate();

    return new Usuario(usuarioid, nome, email, senha);
  }
}
