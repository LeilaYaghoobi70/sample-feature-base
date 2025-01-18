package app.google.data.dataSource.model.response

import com.google.gson.annotations.SerializedName

data class FacilityResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)