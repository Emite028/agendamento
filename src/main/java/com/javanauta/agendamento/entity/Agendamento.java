package com.javanauta.agendamento.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "agendamento")

public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String produto;
    private LocalDateTime DataHoraAgendamento;
    private String cliente;
    private LocalDateTime DataInsercao = LocalDateTime.now();
    private String TelefoneCliente;
    private String servico;



}
