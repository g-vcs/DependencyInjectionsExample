package com.guilherme.dependencyinjectionexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.guilherme.dependencyinjectionexample.data.CatVeterinarian
import com.guilherme.dependencyinjectionexample.data.DogVeterinarian
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var catVet: CatVeterinarian

    @Inject
    lateinit var dogVet: DogVeterinarian

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        catVet.treat()

        dogVet.treat()
    }
}