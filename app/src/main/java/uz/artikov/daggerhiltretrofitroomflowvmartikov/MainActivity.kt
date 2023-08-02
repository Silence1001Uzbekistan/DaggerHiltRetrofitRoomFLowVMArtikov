package uz.artikov.daggerhiltretrofitroomflowvmartikov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import uz.artikov.daggerhiltretrofitroomflowvmartikov.databinding.ActivityMainBinding
import uz.artikov.daggerhiltretrofitroomflowvmartikov.vm.MainViewModel
import uz.artikov.daggerhiltretrofitroomflowvmartikov.vm.Resource

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //permission internet


    private val mainViewModel: MainViewModel by viewModels()

    private val TAG = "MainActivity"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtId.text = "Artikov"

        lifecycleScope.launch {

            mainViewModel.flow.collect {

                when (it) {
                    is Resource.Failure -> {

                        binding.txtId.text = "Failure"

                    }

                    is Resource.Loading -> {

                        binding.txtId.text = "Loading"


                    }

                    is Resource.Success -> {


                        //BItta holat uchun
                        Log.d(TAG, "onCreate: ${it.data}")
                        binding.txtId.text = "${it.data}"


                    }
                }

            }

        }


    }
}