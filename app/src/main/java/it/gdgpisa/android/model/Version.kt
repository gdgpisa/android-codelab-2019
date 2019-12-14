package it.gdgpisa.android.model


import com.squareup.moshi.Json

data class Version(
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "url")
    val url: String? = null
)