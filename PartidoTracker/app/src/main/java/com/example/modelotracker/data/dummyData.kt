package com.example.modelotracker.data

import android.view.Display.Mode
import com.example.modelotracker.data.model.ModeloModel

//Creating burned data to be able to test the functionalities
val name = "Partido de izquierda"
val category = "Izquierda"

val name2 = "Partido de derecha"
val category2 = "Derecha"

var modelos = mutableListOf(
    ModeloModel(name, category),
    ModeloModel(name2, category2)
)