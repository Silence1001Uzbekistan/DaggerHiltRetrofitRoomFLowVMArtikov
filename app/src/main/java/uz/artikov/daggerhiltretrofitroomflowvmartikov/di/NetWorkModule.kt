package uz.artikov.daggerhiltretrofitroomflowvmartikov.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.artikov.daggerhiltretrofitroomflowvmartikov.networking.JsonPlaceHolderService
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetWorkModule {

    @Provides
    @Singleton
    fun provideBaseUrl(): String = "https://jsonplaceholder.typicode.com/"

    @Provides
    @Singleton
    fun provideRetrofit(baseUrl: String): Retrofit {

        return Retrofit.Builder().baseUrl(baseUrl).client(OkHttpClient.Builder().build())
            .addConverterFactory(GsonConverterFactory.create()).build()

    }

    @Provides
    @Singleton
    fun provideJsonPlaceHolder(retrofit: Retrofit): JsonPlaceHolderService {

        return retrofit.create(JsonPlaceHolderService::class.java)

    }

}