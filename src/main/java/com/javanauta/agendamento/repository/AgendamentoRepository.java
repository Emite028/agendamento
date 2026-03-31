package com.javanauta.agendamento.repository;


import com.javanauta.agendamento.entity.Agendamento;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

// Ajuste o nome para AgendamentoRepository (A maiúsculo)
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    Agendamento findByServicoAndDataHoraAgendamentoBetween(
            String servico,
            LocalDateTime dataHoraInicio,
            LocalDateTime dataHoraFinal
    );

    @Transactional
    void deleteByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String client);

    Agendamento findByDataHoraAgendamnetoBetween(LocalDateTime dataHoraAgendamento, LocalDateTime dataHoraFinal);

    Agendamento findByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String client);
}