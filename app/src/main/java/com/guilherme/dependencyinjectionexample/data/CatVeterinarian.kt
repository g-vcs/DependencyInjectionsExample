package com.guilherme.dependencyinjectionexample.data

import com.guilherme.dependencyinjectionexample.model.Animal
import com.guilherme.dependencyinjectionexample.model.Veterinarian
import javax.inject.Inject
import javax.inject.Named

class CatVeterinarian @Inject constructor(
    @Named("cat") private val cat: Animal
) : Veterinarian {
    override fun treat() {
        cat.receiveTreatment()
    }
}
