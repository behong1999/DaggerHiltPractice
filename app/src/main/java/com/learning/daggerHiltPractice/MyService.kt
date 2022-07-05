package com.learning.daggerHiltPractice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.learning.daggerHiltPractice.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

// Cannot give a service an injected constructor
@AndroidEntryPoint
class MyService :Service() {
  
  // Field Injection
  @Inject
  lateinit var repository : MyRepository
  
  override fun onCreate() {
    super.onCreate()
//    repository.doNetworkCall()
  }
  
  override fun onBind(intent : Intent?) : IBinder? {
    return null
  }
}