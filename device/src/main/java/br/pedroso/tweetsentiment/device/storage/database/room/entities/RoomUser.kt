package br.pedroso.tweetsentiment.device.storage.database.room.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "users")
data class RoomUser(
        @PrimaryKey val id: Long,
        val userName: String,
        val name: String,
        val bannerUrl: String,
        val profilePictureUrl: String)