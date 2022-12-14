package br.edu.ifsp.scl.pdm.moviesmanager.controller

import br.edu.ifsp.scl.pdm.moviesmanager.models.Filme

class OrdenadorFilme {

    fun ordenarPorNome(list : MutableList<Filme>): MutableList<Filme> {
        list.sortBy { it.name }
        return list
    }

    fun ordenarPorNota(list : MutableList<Filme>): MutableList<Filme> {
        list.sortBy { it.nota }
        list.reverse()
        return list
    }
}