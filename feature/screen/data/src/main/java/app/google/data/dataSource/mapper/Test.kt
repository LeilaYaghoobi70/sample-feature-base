package app.google.data.dataSource.mapper

import app.google.data.dataSource.model.response.DistanceResponse
import app.google.data.dataSource.model.response.FacilityListResponse
import app.google.data.dataSource.model.response.FacilityResponse
import app.google.data.dataSource.model.response.ImagesGalleryResponse
import app.google.data.dataSource.model.response.OverallRatingResponse
import app.google.data.dataSource.model.response.PricePerNightResponse
import app.google.data.dataSource.model.response.PropertyListResponse
import app.google.data.dataSource.model.response.PropertyResponse
import app.sample.domain.model.DistanceModel
import app.sample.domain.model.FacilitiesModel
import app.sample.domain.model.FacilityModel
import app.sample.domain.model.ImagesGalleryModel
import app.sample.domain.model.OverallRatingModel
import app.sample.domain.model.PricePerNightModel
import app.sample.domain.model.PropertyModel


internal fun PropertyListResponse.toPropertyEntities(): List<PropertyModel> {
    return this.properties.map { it.toPropertyEntity() }
}

internal fun PropertyResponse.toPropertyEntity(): PropertyModel {
    return PropertyModel(
        address1 = this.address1,
        address2 = this.address2,
        distance = this.distance.toDistanceEntity(),
        facilities = this.facilities.map { it.toFacilityListModel() },
        freeCancellationAvailable = this.freeCancellationAvailable,
        id = this.id,
        imagesGallery = this.imagesGallery.map { it.toImagesGalleryEntity() },
        isFeatured = this.isFeatured,
        isNew = this.isNew,
        latitude = this.latitude,
        longitude = this.longitude,
        lowestPricePerNight = this.lowestPricePerNight.toPricePerNightEntity(),
        name = this.name,
        overallRating = this.overallRating.toOverallRatingEntity(),
        overview = this.overview,
        type = this.type
    )
}

internal fun DistanceResponse.toDistanceEntity(): DistanceModel = DistanceModel(
        units = this.units,
        value = this.value
    )

internal fun FacilityListResponse.toFacilityListModel(): FacilitiesModel = FacilitiesModel(
        facilities = this.facilities.map { it.toFacilityEntity() },
        name = this.name,
        id = this.id
    )

internal fun FacilityResponse.toFacilityEntity(): FacilityModel {
    return FacilityModel(
        id = this.id,
        name = this.name
    )
}

internal fun ImagesGalleryResponse.toImagesGalleryEntity(): ImagesGalleryModel {
    return ImagesGalleryModel(
        prefix = this.prefix,
        suffix = this.suffix
    )
}

internal fun OverallRatingResponse.toOverallRatingEntity(): OverallRatingModel = OverallRatingModel(
        numberOfRatings = this.numberOfRatings,
        overall = this.overall
    )

internal fun PricePerNightResponse.toPricePerNightEntity(): PricePerNightModel = PricePerNightModel(
        currency = this.currency,
        value = this.value
    )