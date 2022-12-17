package com.upao.msmatriculas.domain.repositories;

import com.upao.msmatriculas.domain.entities.Mensaje;

import java.util.List;

public interface MensajeRepository {
    boolean Registrar(Mensaje mensaje);
    List<Mensaje> ListarTodos();

    List<Mensaje> ListarxRemitente(String remitente);

    boolean Eliminar(Mensaje mensaje);
}
