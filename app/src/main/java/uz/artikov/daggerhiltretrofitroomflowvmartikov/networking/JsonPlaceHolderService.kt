package uz.artikov.daggerhiltretrofitroomflowvmartikov.networking

import retrofit2.http.GET
import uz.artikov.daggerhiltretrofitroomflowvmartikov.models.jsonplaceholder.JsonPlaceHolderUser

interface JsonPlaceHolderService {

    @GET("users")
    suspend fun getJsonPlaceHolderUsers():List<JsonPlaceHolderUser>

}