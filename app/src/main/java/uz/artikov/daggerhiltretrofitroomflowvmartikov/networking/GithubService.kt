package uz.artikov.daggerhiltretrofitroomflowvmartikov.networking

import retrofit2.http.GET
import uz.artikov.daggerhiltretrofitroomflowvmartikov.models.github.GithubUser

interface GithubService {

    @GET("users")
    suspend fun getGithubUsers(): List<GithubUser>

}