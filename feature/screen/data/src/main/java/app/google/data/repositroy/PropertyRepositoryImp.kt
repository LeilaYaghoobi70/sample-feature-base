package app.google.data.repositroy

import app.google.data.dataSource.remote.RemoteDataSource
import app.sample.domain.model.PropertyModel
import app.sample.domain.repository.PropertyRepository
import javax.inject.Inject

class PropertyRepositoryImp
    @Inject constructor(
        private val removeDataSource: RemoteDataSource,
    ): PropertyRepository {

    override suspend fun getPropertyList(): List<PropertyModel> {
        return removeDataSource.getPropertyList().map {

        }
    }
}