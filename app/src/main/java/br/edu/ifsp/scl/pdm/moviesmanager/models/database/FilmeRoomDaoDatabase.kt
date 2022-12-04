package br.edu.ifsp.scl.pdm.moviesmanager.models.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.edu.ifsp.scl.pdm.moviesmanager.models.Filme
import br.edu.ifsp.scl.pdm.moviesmanager.models.dao.MovieRoomDao

@Database(entities = [Filme::class], version = 1)
abstract class FilmeRoomDaoDatabase: RoomDatabase() {
    abstract fun getFilmeRoomDao(): MovieRoomDao
}