package com.example.dependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val useCase: ExampleUseCase,
    private val repository: ExampleRepository
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass == ExampleViewModel::class.java) {
            return ExampleViewModel(useCase) as T
        }
        if (modelClass == ExampleViewModel2::class.java) {
            return ExampleViewModel2(repository) as T
        }
        throw RuntimeException("Unknown ViewModel class: $modelClass")
    }
}