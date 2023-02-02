package com.sagar.zmusic.data.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.sagar.zmusic.others.Constant.SONG_COLLECTION

class MusicDatabase {

    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)
}