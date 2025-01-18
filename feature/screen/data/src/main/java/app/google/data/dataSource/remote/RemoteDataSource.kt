package app.google.data.dataSource.remote

import app.google.data.dataSource.model.response.PropertyResponse
import app.google.data.dataSource.remote.api.HostelryApi
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val hostelryApi: HostelryApi
) {
    suspend fun getPropertyList(): List<PropertyResponse> = hostelryApi.getPropertyList()
}