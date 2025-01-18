package app.sample.domain.usacase

import app.sample.domain.model.PropertyModel
import app.sample.domain.repository.PropertyRepository
import javax.inject.Inject

class GetProperty @Inject constructor(
    private val propertyRepository: PropertyRepository
) {

    suspend fun invoke(): List<PropertyModel> = propertyRepository.getPropertyList()
}