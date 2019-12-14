package it.gdgpisa.android.model


import com.squareup.moshi.Json

data class Stat(
    @Json(name = "base_stat")
    val baseStat: Int? = null,
    @Json(name = "effort")
    val effort: Int? = null,
    @Json(name = "stat")
    val stat: StatX? = null
)