package com.holandavini.desafiodeprojetodio.service

import com.holandavini.desafiodeprojetodio.entity.ConteudoEducacional
import com.holandavini.desafiodeprojetodio.entity.Usuario
import com.holandavini.desafiodeprojetodio.repository.ConteudoEducacionalRepository

class ConteudoEducacionalService(private val ConteudoEducacionalRepository: ConteudoEducacionalRepository) {
    fun getAllConteudos(): List<ConteudoEducacional> {
        return ConteudoEducacionalRepository.findAll()
    }
    fun getConteudoById(id: Long): ConteudoEducacional?{
        return  ConteudoEducacionalRepository.findById(id).orElse(null)
    }
    fun saveConteudo(conteudoEducacional: ConteudoEducacional): ConteudoEducacional {
        return ConteudoEducacionalRepository.save(conteudoEducacional)
    }
    fun updateConteudo(conteudoEducacional: ConteudoEducacional): ConteudoEducacional {
        return ConteudoEducacionalRepository.save(conteudoEducacional)
    }
    fun deleteConteudo(id: Long){
        return ConteudoEducacionalRepository.deleteById(id)
    }
}