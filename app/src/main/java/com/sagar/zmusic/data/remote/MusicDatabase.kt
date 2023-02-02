package com.sagar.zmusic.data.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.sagar.zmusic.data.entities.Song
import com.sagar.zmusic.others.Constant.SONG_COLLECTION
import kotlinx.coroutines.tasks.await

class MusicDatabase {

    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)

    // this fun is suspend bxz we did not want to execute this fun in main thread
    suspend fun getAllSongs(): List<Song> {
        return try {
            songCollection.get().await().toObjects(Song:: class.java)
        } catch (e: Exception) {
            emptyList()
        }
    }
}