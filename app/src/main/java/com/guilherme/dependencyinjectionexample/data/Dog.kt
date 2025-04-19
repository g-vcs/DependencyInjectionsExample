package com.guilherme.dependencyinjectionexample.data

import android.util.Log
import com.guilherme.dependencyinjectionexample.model.Animal

class Dog : Animal {
    override fun receiveTreatment() {
        Log.d("Animal", "Dog receiving treatment")
    }
}
