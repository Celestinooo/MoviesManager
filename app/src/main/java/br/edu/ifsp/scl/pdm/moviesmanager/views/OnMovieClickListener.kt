package br.edu.ifsp.scl.pdm.moviesmanager.views

import br.edu.ifsp.scl.pdm.moviesmanager.models.Filme

interface OnMovieClickListener {

    fun onMovieClick(filme: Filme)
    fun onMovieRemove(filme: Filme)
}