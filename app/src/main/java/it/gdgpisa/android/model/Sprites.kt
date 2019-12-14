package it.gdgpisa.android.model


import com.squareup.moshi.Json

data class Sprites(
    @Json(name = "back_default")
    val backDefault: String? = null,
    @Json(name = "back_female")
    val backFemale: Any? = null,
    @Json(name = "back_shiny")
    val backShiny: String? = null,
    @Json(name = "back_shiny_female")
    val backShinyFemale: Any? = null,
    @Json(name = "front_default")
    val frontDefault: String? = null,
    @Json(name = "front_female")
    val frontFemale: Any? = null,
    @Json(name = "front_shiny")
    val frontShiny: String? = null,
    @Json(name = "front_shiny_female")
    val frontShinyFemale: Any? = null
)