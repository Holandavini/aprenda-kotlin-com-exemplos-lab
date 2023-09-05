package com.holandavini.desafiodeprojetodio.controller

import com.holandavini.desafiodeprojetodio.entity.Usuario
import com.holandavini.desafiodeprojetodio.service.UsuarioService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuarios")
class UsuarioController(private val usuarioService: UsuarioService){

    @GetMapping
    fun getAllUsuarios(): List<Usuario> {
        return usuarioService.getAllUsuarios()
    }
    @GetMapping("/{id}")
    fun getUsuarioById(@PathVariable id: Long): Usuario? {
        return usuarioService.getUsuarioById(id)
    }
    fun addUsuario(@RequestBody usuario: Usuario): Usuario?{
        return usuarioService.saveUsuario(usuario)
    }
    @PutMapping("/{id}")
    fun updateUsuario(@PathVariable id: Long, @RequestBody usuarioAtualizado: Usuario): Usuario{
        val usuarioExistente = usuarioService.getUsuarioById(id) ?: throw RuntimeException("Usuário não encontrado")
        val usuario = usuarioExistente.copy(nome = usuarioAtualizado.nome, nivel = usuarioAtualizado.nivel, cpf = usuarioAtualizado.cpf)
        return usuarioService.updateUsuario(usuario)
    }
    @DeleteMapping("/{id}")
    fun deleteUsuario(@PathVariable id: Long) {
        return usuarioService.deleteUsuario(id)
    }
}