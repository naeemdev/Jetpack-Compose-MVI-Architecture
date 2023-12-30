package com.naeemdev.jetpackcomposemviarchitecture.data.remote.mapper

import com.naeemdev.jetpackcomposemviarchitecture.data.remote.dto.ImageDto
import com.naeemdev.jetpackcomposemviarchitecture.domain.model.Image


fun ImageDto.toImage(): Image {
    return Image(
        id = id,
        width = width,
        height = height,
        srcSmall = srcSmall,
        src = src
    )
}