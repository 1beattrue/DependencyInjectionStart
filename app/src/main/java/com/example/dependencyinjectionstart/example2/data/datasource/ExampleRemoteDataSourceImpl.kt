package com.example.dependencyinjectionstart.example2.data.datasource

import android.util.Log
import com.example.dependencyinjectionstart.example2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        Log.d("ExampleRemoteDataSource", "Original")
        apiService.method()
    }
}

// типа тестовый репозиторий
class TestExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        Log.d("ExampleRemoteDataSource", "Test")
        apiService.method()
    }
}
