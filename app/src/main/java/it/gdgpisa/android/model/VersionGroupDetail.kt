package it.gdgpisa.android.model


import com.squareup.moshi.Json

data class VersionGroupDetail(
    @Json(name = "level_learned_at")
    val levelLearnedAt: Int? = null,
    @Json(name = "move_learn_method")
    val moveLearnMethod: MoveLearnMethod? = null,
    @Json(name = "version_group")
    val versionGroup: VersionGroup? = null
)