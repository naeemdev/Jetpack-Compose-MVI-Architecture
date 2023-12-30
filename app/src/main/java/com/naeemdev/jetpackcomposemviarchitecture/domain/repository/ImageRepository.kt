package com.naeemdev.jetpackcomposemviarchitecture.domain.repository

import com.naeemdev.jetpackcomposemviarchitecture.core.util.Resources
import com.naeemdev.jetpackcomposemviarchitecture.domain.model.Image
import kotlinx.coroutines.flow.Flow

interface ImageRepository {
    fun getImages(
        text: String
    ): Flow<Resources<List<Image>>>
}