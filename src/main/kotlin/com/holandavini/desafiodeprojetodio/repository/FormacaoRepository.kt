package com.holandavini.desafiodeprojetodio.repository

import com.holandavini.desafiodeprojetodio.entity.Formacao
import org.springframework.data.jpa.repository.JpaRepository

interface FormacaoRepository: JpaRepository<Formacao, Long> {
}