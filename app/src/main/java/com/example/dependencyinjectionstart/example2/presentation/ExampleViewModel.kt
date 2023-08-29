package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    private val id: String // представим, что эта штука передается из activity
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this, $id")
    }
}
