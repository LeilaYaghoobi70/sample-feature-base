package app.google.data.dataSource.model.response

import com.google.gson.annotations.SerializedName

data class PropertyListResponse (
    @SerializedName("properties")
    val properties: List<PropertyResponse>,
)