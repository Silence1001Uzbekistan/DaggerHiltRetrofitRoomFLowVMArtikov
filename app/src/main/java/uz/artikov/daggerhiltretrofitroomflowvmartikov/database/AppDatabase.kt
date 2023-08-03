package uz.artikov.daggerhiltretrofitroomflowvmartikov.database

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.artikov.daggerhiltretrofitroomflowvmartikov.database.dao.JsonUserDao
import uz.artikov.daggerhiltretrofitroomflowvmartikov.database.entity.JsonUserEntity

@Database(entities = [JsonUserEntity::class], version = 1)
abstract class AppDatabase:RoomDatabase() {

    abstract fun getJsonUSerDao():JsonUserDao

}