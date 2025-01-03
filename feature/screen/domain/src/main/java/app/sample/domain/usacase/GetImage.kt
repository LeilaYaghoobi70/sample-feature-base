package app.sample.domain.usacase

import app.sample.domain.model.ImageDomainModel
import app.sample.domain.repository.ImageRepository
import javax.inject.Inject

class GetImage @Inject constructor(
    private val imageRepository: ImageRepository
) {

    suspend fun getImage(imageId: String): ImageDomainModel =
        imageRepository.getImage(imageId = imageId)
}