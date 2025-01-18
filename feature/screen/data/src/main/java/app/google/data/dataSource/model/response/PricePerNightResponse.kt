package app.google.data.dataSource.model.response

import com.google.gson.annotations.SerializedName

data class PricePerNightResponse(
    @SerializedName("currency")
    val currency: String,
    @SerializedName("value")
    val value: String
)