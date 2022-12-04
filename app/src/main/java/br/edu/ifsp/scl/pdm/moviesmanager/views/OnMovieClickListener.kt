package br.edu.ifsp.scl.pdm.moviesmanager.views

interface OnMovieClickListener {

    fun onMovieClick(position: Int)
    fun onMovieRemove(position: Int)
}