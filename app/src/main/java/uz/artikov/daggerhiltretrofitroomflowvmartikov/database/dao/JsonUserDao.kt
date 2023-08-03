package uz.artikov.daggerhiltretrofitroomflowvmartikov.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import uz.artikov.daggerhiltretrofitroomflowvmartikov.database.entity.JsonUserEntity

@Dao
interface JsonUserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUsers(list: List<JsonUserEntity>)

    @Query("select * from jsonuserentity")
    fun getJsonUsers():List<JsonUserEntity>

}