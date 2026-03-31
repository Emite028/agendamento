package com.javanauta.agendamento.services;

import com.javanauta.agendamento.entity.Agendamento;
import com.javanauta.agendamento.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

   private final AgendamentoRepository agendamentoRepository;

   public Agendamento salvarAgendamento(Agendamento agendamento) {

      LocalDateTime horaAgendamento = agendamento.getDataHoraAgendamento();
      LocalDateTime horaFim = agendamento.getDataHoraAgendamento().plusMinutes(1);

      Agendamento agendados = agendamentoRepository.findByServicoAndDataHoraAgendamentoBetween(agendamento.getServico(),
              horaAgendamento, horaFim);

      if (Objects.nonNull(agendados)){
         throw new RuntimeException("Horario indisponivel");

      }else {
         return agendamentoRepository.save(agendamento);
      }
   }
   public void deletarAgendamento(LocalDateTime dataHoraAgendamento, String cliente){
      agendamentoRepository.deleteByDataHoraAgendamentoAndCliente(dataHoraAgendamento, cliente);
   }
   public Agendamento buscarAgendamentosDia(LocalDate data){
      LocalDateTime primeiraHoraDia = data.atStartOfDay();
      LocalDateTime horaFinalDia = data.atTime(23, 59);

      return agendamentoRepository.findByDataHoraAgendamnetoBetween(primeiraHoraDia, horaFinalDia);
   }
   public Agendamento alterarAgendamento(Agendamento agendamento, String cliente, LocalDateTime dataHoraAgendamento){
      Agendamento agenda = agendamentoRepository.findByDataHoraAgendamentoAndCliente(dataHoraAgendamento, cliente);

      if(Objects.isNull(agenda)){
         throw new RuntimeException("horario não esta preenchido");
      }
      agendamento.setId(agenda.getId());
      return agendamentoRepository.save(agendamento);
   }
}

