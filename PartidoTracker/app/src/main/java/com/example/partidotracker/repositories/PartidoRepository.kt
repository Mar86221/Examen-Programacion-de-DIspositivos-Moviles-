package com.example.partidotracker.repositories

import com.example.partidotracker.data.model.PartidoModel
//Creating repository model which will carry the functions that will be done like get and add
class PartidoRepository (private val partidos: MutableList<PartidoModel>){
    fun getPartidos() = partidos

    fun addPartidos(partido: PartidoModel) = partidos.add(partido)
}