package uz.artikov.daggerhiltretrofitroomflowvmartikov.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class JsonUserEntity(
    @PrimaryKey
    val id:String,
    val name:String,
    val phone:String

)