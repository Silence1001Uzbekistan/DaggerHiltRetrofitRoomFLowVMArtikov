package uz.artikov.daggerhiltretrofitroomflowvmartikov.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.artikov.daggerhiltretrofitroomflowvmartikov.database.AppDatabase
import uz.artikov.daggerhiltretrofitroomflowvmartikov.database.dao.JsonUserDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {

        return Room.databaseBuilder(context, AppDatabase::class.java, "Artikov_db")
            .fallbackToDestructiveMigration().build()

    }


    @Provides
    @Singleton
    fun provideJsonUserDao(appDatabase: AppDatabase):JsonUserDao{

        return appDatabase.getJsonUSerDao()

    }

}