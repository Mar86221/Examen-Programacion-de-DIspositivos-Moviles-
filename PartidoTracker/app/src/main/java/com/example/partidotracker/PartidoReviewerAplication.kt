package com.example.partidotracker
import android.app.Application
import com.example.partidotracker.data.partidos
import com.example.partidotracker.repositories.PartidoRepository
//Creating ModelReviewerApplication which postpones the creation of the repository until it is used
class PartidoReviewerAplication {
    val partidoRepository: PartidoRepository by lazy {
        PartidoRepository(partidos)
    }
}