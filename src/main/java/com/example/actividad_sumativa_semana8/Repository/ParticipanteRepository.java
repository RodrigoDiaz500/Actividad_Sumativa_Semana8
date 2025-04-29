package com.example.actividad_sumativa_semana8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.actividad_sumativa_semana8.Model.Participante;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
}
