package app.sample.domain.repository

import app.sample.domain.model.ImageDomainModel

interface ImageRepository {
    suspend fun getImage(imageId: String): ImageDomainModel
}