package com.learning.daggerHiltPractice.data.repository

import android.app.Application
import android.content.Context
import com.learning.daggerHiltPractice.data.remote.MyApi
import com.learning.daggerHiltPractice.domain.repository.MyRepository
import com.learning.daggerHiltPractice.MyApp
import com.learning.daggerHiltPractice.R
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
  private val myApi : MyApi,
  private val appContext  : Application
) : MyRepository{
  
  init {
    val appName = appContext.getString(R.string.app_name)
    println("Hello from the repository. The app name is $appName")
  }
  
  override suspend fun doNetworkCall() {
  
  }
}