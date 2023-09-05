package com.holandavini.desafiodeprojetodio.repository

import com.holandavini.desafiodeprojetodio.entity.ConteudoEducacional
import org.springframework.data.jpa.repository.JpaRepository

interface ConteudoEducacionalRepository: JpaRepository<ConteudoEducacional, Long> {
}