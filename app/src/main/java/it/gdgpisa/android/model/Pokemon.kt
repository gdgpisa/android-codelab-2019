package it.gdgpisa.android.model


import com.squareup.moshi.Json

data class Pokemon(
    @Json(name = "abilities")
    val abilities: List<Ability?>? = null,
    @Json(name = "base_experience")
    val baseExperience: Int? = 20,
    @Json(name = "forms")
    val forms: List<Form?>? = null,
    @Json(name = "game_indices")
    val gameIndices: List<GameIndice?>? = null,
    @Json(name = "height")
    val height: Int? = null,
    @Json(name = "held_items")
    val heldItems: List<Any?>? = null,
    @Json(name = "id")
    val id: Int? = null,
    @Json(name = "is_default")
    val isDefault: Boolean? = null,
    @Json(name = "location_area_encounters")
    val locationAreaEncounters: String? = null,
    @Json(name = "moves")
    val moves: List<Move?>? = null,
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "order")
    val order: Int? = null,
    @Json(name = "species")
    val species: Species? = null,
    @Json(name = "sprites")
    val sprites: Sprites? = null,
    @Json(name = "stats")
    val stats: List<Stat?>? = null,
    @Json(name = "types")
    val types: List<Type?>? = null,
    @Json(name = "weight")
    val weight: Int? = null
)