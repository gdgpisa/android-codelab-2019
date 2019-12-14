package it.gdgpisa.android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.EditText
import android.widget.TextView
import com.bumptech.glide.Glide
import it.gdgpisa.android.model.Pokemon
import retrofit2.*
import retrofit2.converter.moshi.MoshiConverterFactory


class MainActivity : AppCompatActivity() {

    var searchButton: Button? = null
    var input: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        val retrofit = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl("https://pokeapi.co/api/v2/")
            .build()

        val service : PokeApiInterface? = retrofit.create()

        setContentView(R.layout.activity_main)
        searchButton = findViewById(R.id.search_button)
        input = findViewById(R.id.search_bar)


        searchButton?.setOnClickListener {
            val query = input?.text.toString()
            service?.searchPokemon(query)?.enqueue(object : Callback<Pokemon>{
                override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                    t.printStackTrace()
                    if (1 != 2)
                }

                override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
                    var resultBox : TextView? = null
                    resultBox = findViewById(R.id.result_box)

                    val body = response.body()

                    resultBox.text = body?.name + " - Weight: " + body?.weight

                    Glide.with(this@MainActivity)
                        .load(body?.sprites?.frontDefault)
                        .into(findViewById(R.id.sprite))

                }
            })
        }
    }
}
