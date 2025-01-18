package app.sample.domain.repository

import app.sample.domain.model.PropertyModel

interface PropertyRepository {
    suspend fun getPropertyList(): List<PropertyModel>
}