package com.holandavini.desafiodeprojetodio.entity

import jakarta.persistence.*

@Entity
@Table(name = "formacao")
class Formacao(
    val nome: String,
    @Enumerated(EnumType.STRING)
    val nivel: Nivel,
    val conteudoEducacional: List<ConteudoEducacional>) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}