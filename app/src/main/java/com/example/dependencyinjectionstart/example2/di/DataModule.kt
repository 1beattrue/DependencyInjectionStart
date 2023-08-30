package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.TestExampleRemoteDataSourceImpl
import com.example.dependencyinjectionstart.example2.di.qualifiers.ExampleRemoteDataSourceQualifier
import com.example.dependencyinjectionstart.example2.di.qualifiers.TestExampleRemoteDataSourceQualifier
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck
@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ExampleRemoteDataSourceQualifier
    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestExampleRemoteDataSourceQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(impl: TestExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}
