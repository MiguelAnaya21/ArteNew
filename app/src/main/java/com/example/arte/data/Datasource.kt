package com.example.arte.data

import com.example.arte.R
import com.example.arte.model.Obras
class Datasource(){
    fun loadObras(): List<Obras> {
        return listOf<Obras>(
            Obras(R.string.titulo1, R.string.obra1, R.drawable.la_mona_lisa),
            Obras(R.string.titulo2, R.string.obra2, R.drawable.la_noche_estrellada),
            Obras(R.string.titulo3, R.string.obra3, R.drawable.la_persistencia_de_la_memoria),
            Obras(R.string.titulo4, R.string.obra4, R.drawable.la_escuela_de_atenas),
            Obras(R.string.titulo5, R.string.obra5, R.drawable.guernica),
            Obras(R.string.titulo6, R.string.obra6, R.drawable.el_grito),
            Obras(R.string.titulo7, R.string.obra7, R.drawable.la_ultima_cena),
            Obras(R.string.titulo8, R.string.obra8, R.drawable.la_creacion_de_adan),
            Obras(R.string.titulo9, R.string.obra9, R.drawable.las_meninas),
            Obras(R.string.titulo10, R.string.obra10, R.drawable.la_venus_de_milo))
    }
}