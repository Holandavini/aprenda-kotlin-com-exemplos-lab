package com.holandavini.desafiodeprojetodio.service

import com.holandavini.desafiodeprojetodio.entity.Formacao
import com.holandavini.desafiodeprojetodio.repository.FormacaoRepository
import org.springframework.stereotype.Service

@Service
class FormacaoService(private val formacaoRepository: FormacaoRepository) {
    fun getAllFormacoes() : List<Formacao> {
        return formacaoRepository.findAll()
    }
    fun getFormacaoById(id: Long): Formacao?{
        return formacaoRepository.findById(id).orElse(null)
    }
    fun saveFormacao(formacao: Formacao): Formacao{
        return formacaoRepository.save(formacao)
    }
    fun updateFormacao(formacao: Formacao): Formacao {
        return formacaoRepository.save(formacao)
    }
    fun deleteFormacao(id: Long){
        formacaoRepository.deleteById(id)
    }

}