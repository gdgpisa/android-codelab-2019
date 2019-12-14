package it.gdgpisa.android.model


import com.squareup.moshi.Json

data class GameIndice(
    @Json(name = "game_index")
    val gameIndex: Int? = null,
    @Json(name = "version")
    val version: Version? = null
)