package it.gdgpisa.android

import it.gdgpisa.android.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApiInterface {

    @GET("pokemon/{name}")
    fun searchPokemon(@Path("name") name : String) : Call<Pokemon>
}