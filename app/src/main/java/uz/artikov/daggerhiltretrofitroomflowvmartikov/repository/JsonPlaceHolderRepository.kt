package uz.artikov.daggerhiltretrofitroomflowvmartikov.repository

import kotlinx.coroutines.flow.flow
import uz.artikov.daggerhiltretrofitroomflowvmartikov.networking.JsonPlaceHolderService
import javax.inject.Inject

class JsonPlaceHolderRepository @Inject constructor(private val jsonPlaceHolderService: JsonPlaceHolderService) {


    fun getJsonPlaceHolderUsers() = flow { emit(jsonPlaceHolderService.getJsonPlaceHolderUsers()) }


}