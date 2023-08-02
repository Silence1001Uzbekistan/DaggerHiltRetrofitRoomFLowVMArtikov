package uz.artikov.daggerhiltretrofitroomflowvmartikov.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import uz.artikov.daggerhiltretrofitroomflowvmartikov.models.jsonplaceholder.JsonPlaceHolderUser
import uz.artikov.daggerhiltretrofitroomflowvmartikov.repository.JsonPlaceHolderRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val jsonPlaceHolderRepository: JsonPlaceHolderRepository
) :
    ViewModel() {

    private val _flow = MutableStateFlow<Resource<List<JsonPlaceHolderUser>>>(Resource.Loading())
    val flow get() = _flow


    init {
        getJsonPlaceHolderUser()
    }

    private fun getJsonPlaceHolderUser() {


        viewModelScope.launch {
            jsonPlaceHolderRepository.getJsonPlaceHolderUsers().catch {

                _flow.emit(Resource.Failure(it))

            }.collect {

                _flow.emit(Resource.Success(it))

            }
        }

    }

}