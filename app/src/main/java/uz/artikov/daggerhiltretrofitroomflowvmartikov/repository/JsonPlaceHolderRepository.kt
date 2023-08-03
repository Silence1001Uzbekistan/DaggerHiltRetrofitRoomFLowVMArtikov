package uz.artikov.daggerhiltretrofitroomflowvmartikov.repository

import kotlinx.coroutines.flow.flow
import uz.artikov.daggerhiltretrofitroomflowvmartikov.database.dao.JsonUserDao
import uz.artikov.daggerhiltretrofitroomflowvmartikov.networking.JsonPlaceHolderService
import javax.inject.Inject

class JsonPlaceHolderRepository @Inject constructor(
    private val jsonPlaceHolderService: JsonPlaceHolderService,
    private val githubUserDao: JsonUserDao
) {


    fun getJsonPlaceHolderUsers() = flow { emit(jsonPlaceHolderService.getJsonPlaceHolderUsers()) }


}