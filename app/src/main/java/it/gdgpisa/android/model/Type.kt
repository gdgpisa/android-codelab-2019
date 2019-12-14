package it.gdgpisa.android.model


import com.squareup.moshi.Json

data class Type(
    @Json(name = "slot")
    val slot: Int? = null,
    @Json(name = "type")
    val type: TypeX? = null
)