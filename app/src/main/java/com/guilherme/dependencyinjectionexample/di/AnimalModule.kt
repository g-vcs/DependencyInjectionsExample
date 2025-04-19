package com.guilherme.dependencyinjectionexample.di

import com.guilherme.dependencyinjectionexample.data.Cat
import com.guilherme.dependencyinjectionexample.data.Dog
import com.guilherme.dependencyinjectionexample.model.Animal
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object AnimalModule {

    @Provides
    @Named("cat")
    fun provideCat(): Animal {
        return Cat()
    }

    @Provides
    @Named("dog")
    fun provideDog(): Animal {
        return Dog()
    }
}