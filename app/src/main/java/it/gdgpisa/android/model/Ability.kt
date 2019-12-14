package it.gdgpisa.android.model


import com.squareup.moshi.Json

data class Ability(
    @Json(name = "ability")
    val ability: AbilityX? = null,
    @Json(name = "is_hidden")
    val isHidden: Boolean? = null,
    @Json(name = "slot")
    val slot: Int? = null
)