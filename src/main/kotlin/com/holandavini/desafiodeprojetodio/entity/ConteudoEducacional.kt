package com.holandavini.desafiodeprojetodio.entity

import jakarta.persistence.*

@Entity
@Table(name = "conteudo_educacional")
data class ConteudoEducacional(
    val nome: String,
    val duracao: Long,
    @Enumerated(EnumType.STRING)
    val nivel: Nivel
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}