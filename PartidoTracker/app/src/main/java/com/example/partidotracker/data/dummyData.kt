package com.example.partidotracker.data

import com.example.partidotracker.data.model.PartidoModel
//Creating burned data to be able to test the functionalities
val name = "FMLN"
val ideology = "Left"

val name2 = "Arena"
val ideology2 = "Rigth"

var partidos = mutableListOf(
    PartidoModel(name, ideology),
    PartidoModel(name2, ideology2)
)

