package app.sample.domain.model

data class PropertyModel(
    val id: Int,
    val name: String,
    val address1: String,
    val address2: String,
    val distance: DistanceModel,
    val facilities: List<FacilitiesModel>,
    val freeCancellationAvailable: Boolean,
    val imagesGallery: List<ImagesGalleryModel>,
    val isFeatured: Boolean,
    val isNew: Boolean,
    val latitude: Double,
    val longitude: Double,
    val lowestPricePerNight: PricePerNightModel,
    val overallRating: OverallRatingModel,
    val overview: String,
    val type: String,
)