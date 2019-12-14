package it.gdgpisa.android.model


import com.squareup.moshi.Json

data class AbilityX(
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "url")
    val url: String? = null
)