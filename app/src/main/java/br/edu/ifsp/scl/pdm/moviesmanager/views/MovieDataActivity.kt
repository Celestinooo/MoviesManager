package br.edu.ifsp.scl.pdm.moviesmanager.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.ifsp.scl.pdm.moviesmanager.databinding.ActivityMovieDataBinding

class MovieDataActivity : AppCompatActivity() {

    private val amdb: ActivityMovieDataBinding by lazy {
        ActivityMovieDataBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amdb.root)
    }
}