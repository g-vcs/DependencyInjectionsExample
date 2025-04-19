package com.guilherme.dependencyinjectionexample

import android.util.Log
import javax.inject.Inject

class Veterinarian @Inject constructor (private val animal: Animal) {
    fun treat() {
        animal.receiveTreatment()
    }
}

interface Animal {
    fun receiveTreatment()
}

class Cat: Animal {
    override fun receiveTreatment() {
        Log.d("Animal", "Cat receiving treatment")
    }
}

class Dog: Animal {
    override fun receiveTreatment() {
        Log.d("Animal", "Dog receiving treatment")
    }
}
