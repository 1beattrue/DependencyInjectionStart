package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.di.qualifiers.IdQualifier
import com.example.dependencyinjectionstart.example2.di.qualifiers.NameQualifier
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String, // представим, что эта штука передается из activity
    @NameQualifier private val name: String
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this, $id, $name")
    }
}
