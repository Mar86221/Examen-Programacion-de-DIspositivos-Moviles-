package com.example.partidotracker.ui.partido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.partidotracker.PartidoReviewerAplication
import com.example.partidotracker.R
import com.example.partidotracker.data.model.PartidoModel
import com.example.partidotracker.repositories.PartidoRepository

//Creating the fragments that will be used in the project

class PartidoViewModel(private val repository: PartidoRepository) : ViewModel()  {
    //We create MutableLiveData to be able to apply LiveData and DataBinding
    var name = MutableLiveData("")
    var ideology = MutableLiveData("")
    var status = MutableLiveData("")

    fun getPartidos() =  repository.getPartidos()

    fun addPartidos(partido: PartidoModel) = repository.addPartidos(partido)
    //Creating the Create function that checks if the data is empty or null
    fun createPartidos(){
        if (!validateData()){
            status.value = WRONG_INFORMATION
            return
        }

        val modelo = PartidoModel(
            name.value!!,
            ideology.value!!,
        )

        addPartidos(modelo)
        clearData()

        status.value = MODELO_CREATED
    }
    //This function is the one that validates if the information is correct which is used by the Create function
    private fun validateData(): Boolean {
        when{
            name.value.isNullOrEmpty() -> return false
            ideology.value.isNullOrEmpty() -> return false
        }
        return true
    }
    //This function clears the variables to their original state
    fun clearData(){
        name.value = ""
        ideology.value = ""
    }
    //This, like cleardata, clears the status back to its original state
    fun clearStatus(){
        status.value = INACTIVE
    }
    //Initializing the ViewModel
    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as PartidoReviewerAplication
                PartidoViewModel(app.partidoRepository)

            }
        }
        const val MODELO_CREATED = "Partido created"
        const val WRONG_INFORMATION = "Wrong information"
        const val INACTIVE = ""
    }

}