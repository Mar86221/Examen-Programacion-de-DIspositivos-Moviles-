package com.example.partidotracker.data

import com.example.partidotracker.data.model.PartidoModel

val name = "FMLN"
val ideology = "Left"

val name2 = "Arena"
val ideology2 = "Rigth"

var partidos = mutableListOf(
    PartidoModel(name, ideology),
    PartidoModel(name2, ideology2)
)

