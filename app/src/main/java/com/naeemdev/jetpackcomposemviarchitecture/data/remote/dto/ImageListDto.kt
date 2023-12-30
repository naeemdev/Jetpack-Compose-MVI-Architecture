package com.naeemdev.jetpackcomposemviarchitecture.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ImageListDto(
    @SerializedName("images")
    var images: ArrayList<ImageDto>,
)
