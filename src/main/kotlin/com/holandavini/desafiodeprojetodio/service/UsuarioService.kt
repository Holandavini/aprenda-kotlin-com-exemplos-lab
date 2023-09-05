package com.holandavini.desafiodeprojetodio.service

import com.holandavini.desafiodeprojetodio.entity.Usuario
import com.holandavini.desafiodeprojetodio.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(private val usuarioRepository: UsuarioRepository) {
    fun getAllUsuarios(): List<Usuario> {
        return usuarioRepository.findAll()
    }
    fun getUsuarioById(id: Long): Usuario?{
        return usuarioRepository.findById(id).orElse(null)
    }
    fun saveUsuario(usuario: Usuario): Usuario {
        return usuarioRepository.save(usuario)
    }
    fun updateUsuario(usuario: Usuario): Usuario{
        return usuarioRepository.save(usuario)
    }
    fun deleteUsuario(id: Long){
        return usuarioRepository.deleteById(id)
    }
}