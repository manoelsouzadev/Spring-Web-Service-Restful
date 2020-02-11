package com.eventos.eventosapirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.eventosapirest.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, String> {

}
