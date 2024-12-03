package com.dicoding.snapp_smartnutritionapp.ui.Navigation.ui.bookmark

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BookmarkViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Bookmark Fragment"
    }
    val text: LiveData<String> = _text
}