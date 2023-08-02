package uz.artikov.daggerhiltretrofitroomflowvmartikov.models

import uz.artikov.daggerhiltretrofitroomflowvmartikov.models.github.GithubUser
import uz.artikov.daggerhiltretrofitroomflowvmartikov.models.jsonplaceholder.JsonPlaceHolderUser


//ikkita api un,birlashtiruvchi class
data class MainUser(
    val jsonPlaceHolderUser: List<JsonPlaceHolderUser>,
    val githubUser: List<GithubUser>
)