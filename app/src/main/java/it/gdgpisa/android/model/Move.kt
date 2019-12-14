package it.gdgpisa.android.model


import com.squareup.moshi.Json

data class Move(
    @Json(name = "move")
    val move: MoveX? = null,
    @Json(name = "version_group_details")
    val versionGroupDetails: List<VersionGroupDetail?>? = null
)