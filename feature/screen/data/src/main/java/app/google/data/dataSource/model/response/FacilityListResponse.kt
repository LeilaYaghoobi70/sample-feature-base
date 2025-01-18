package app.google.data.dataSource.model.response

import com.google.gson.annotations.SerializedName

data class FacilityListResponse(
    @SerializedName("facilities")
    val facilities: List<FacilityResponse>,
    @SerializedName("name")
    val name: String,
    @SerializedName("id")
    val id: String,
)