package uz.artikov.daggerhiltretrofitroomflowvmartikov.repository

import kotlinx.coroutines.flow.flow
import uz.artikov.daggerhiltretrofitroomflowvmartikov.database.dao.JsonUserDao
import uz.artikov.daggerhiltretrofitroomflowvmartikov.networking.GithubService
import javax.inject.Inject

class GithubRepository @Inject constructor(private val githubService: GithubService) {

    fun getGithubUsers() = flow {

        emit(githubService.getGithubUsers())

    }


}