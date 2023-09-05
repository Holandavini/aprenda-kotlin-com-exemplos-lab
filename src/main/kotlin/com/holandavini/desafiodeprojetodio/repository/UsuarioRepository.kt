package com.holandavini.desafiodeprojetodio.repository

import com.holandavini.desafiodeprojetodio.entity.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository: JpaRepository<Usuario, Long> {
}