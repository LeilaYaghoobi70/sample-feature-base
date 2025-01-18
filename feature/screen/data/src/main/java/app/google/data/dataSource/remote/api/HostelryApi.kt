package app.google.data.dataSource.remote.api

import app.google.data.dataSource.model.response.PropertyResponse

interface HostelryApi {
    suspend fun getPropertyList(): List<PropertyResponse>
}