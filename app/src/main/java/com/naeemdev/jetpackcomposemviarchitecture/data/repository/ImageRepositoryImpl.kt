package com.naeemdev.jetpackcomposemviarchitecture.data.repository

import com.naeemdev.jetpackcomposemviarchitecture.core.util.Resources
import com.naeemdev.jetpackcomposemviarchitecture.data.remote.ImageAPi
import com.naeemdev.jetpackcomposemviarchitecture.data.remote.mapper.toImage
import com.naeemdev.jetpackcomposemviarchitecture.domain.model.Image
import com.naeemdev.jetpackcomposemviarchitecture.domain.repository.ImageRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

import javax.inject.Singleton

@Singleton
class ImageRepositoryImpl @Inject constructor(
    private val imageAPi: ImageAPi
):ImageRepository{
    override fun getImages(text: String): Flow<Resources<List<Image>>> {
        return flow {


            emit(Resources.Loading(true))

            val remoteList = try {
                imageAPi.getImages(text)
            } catch (e: IOException) {
                e.printStackTrace()
                emit(Resources.Error("Could not load data"))
                null
            } catch (e: HttpException) {
                e.printStackTrace()
                emit(Resources.Error("Could not load data"))
                null
            }

            if (remoteList == null) {
                emit(Resources.Loading(false))
            }

            remoteList.let { listing ->
                emit(Resources.Success(data = listing?.images?.map { it.toImage() }))
                emit(Resources.Loading(false))
            }
        }
    }
}