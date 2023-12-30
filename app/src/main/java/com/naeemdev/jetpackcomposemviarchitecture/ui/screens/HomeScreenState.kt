package com.naeemdev.jetpackcomposemviarchitecture.ui.screens

import com.naeemdev.jetpackcomposemviarchitecture.domain.model.Image


data class HomeScreenState(
    val images: List<Image> = emptyList(),
    val isLoading: Boolean = false,
    val text : String = ""
)