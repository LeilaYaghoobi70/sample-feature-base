package app.google.data.dataSource.remote.api

import app.google.data.dataSource.model.response.PropertyResponse
import retrofit2.http.GET

interface HostelryApi {
    @GET("")
    suspend fun getPropertyList(): List<PropertyResponse>
}