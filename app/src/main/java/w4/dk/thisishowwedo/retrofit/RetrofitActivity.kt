package w4.dk.thisishowwedo.retrofit

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_retrofit.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import w4.dk.thisishowwedo.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitActivity : AppCompatActivity() {

    private val baseUrl = "https://pokeapi.co/api/v2/"
    val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()

    val pokemonService = retrofit.create(PokemonSerivce::class.java)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)

        btnGetPokemon.setOnClickListener {
            val id = etPokemonID.text.toString()
            val result = pokemonService.getPokemons(id)
            result.enqueue(object : Callback<Pokemon> {
                override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                    // TODO: Error handling...
                }

                override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
                    tvRetrofitDisplay.text = response.body()?.name
                }

            })
        }

    }

    companion object {
        fun newInstance(context: Context): Intent {
            return Intent(context, RetrofitActivity::class.java)
        }
    }

}
