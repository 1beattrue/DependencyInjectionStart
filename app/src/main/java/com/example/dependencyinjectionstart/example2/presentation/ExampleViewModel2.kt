package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository,
    @Named("id") private val id: String,
    @Named("name") private val name: String
) : ViewModel() {

    fun method() {
        repository.method()
        Log.d("ExampleViewModel2", "$this, $id, $name")
    }
}
