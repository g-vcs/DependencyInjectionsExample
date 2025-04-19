package com.guilherme.dependencyinjectionexample.data

import android.util.Log
import com.guilherme.dependencyinjectionexample.model.Animal

class Cat : Animal {
    override fun receiveTreatment() {
        Log.d("Animal", "Cat receiving treatment")
    }
}
