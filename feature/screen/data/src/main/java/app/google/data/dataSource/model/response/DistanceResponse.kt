package app.google.data.dataSource.model.response

import com.google.gson.annotations.SerializedName

data class DistanceResponse(
    @SerializedName("units")
    val units: String,
    @SerializedName("value")
    val value: Double
)