package w4.dk.thisishowwedo.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonSerivce {

    @GET("pokemon/{id}/")
    fun getPokemons(@Path("id")id: String): Call<Pokemon>


}

