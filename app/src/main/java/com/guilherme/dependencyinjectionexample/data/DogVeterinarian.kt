package com.guilherme.dependencyinjectionexample.data


import com.guilherme.dependencyinjectionexample.model.Animal
import com.guilherme.dependencyinjectionexample.model.Veterinarian
import javax.inject.Inject
import javax.inject.Named

class DogVeterinarian @Inject constructor(
    @Named("dog") private val dog: Animal
) : Veterinarian {
    override fun treat() {
        dog.receiveTreatment()
    }
}