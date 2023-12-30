package com.naeemdev.jetpackcomposemviarchitecture.core.di

import com.naeemdev.jetpackcomposemviarchitecture.data.repository.ImageRepositoryImpl
import com.naeemdev.jetpackcomposemviarchitecture.domain.repository.ImageRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindImageRepository(
        imageRepositoryImpl: ImageRepositoryImpl
    ): ImageRepository
}