package app.google.data.dataSource.model.response

import com.google.gson.annotations.SerializedName

data class ImagesGalleryResponse(
    @SerializedName("prefix")
    val prefix: String,
    @SerializedName("suffix")
    val suffix: String
)