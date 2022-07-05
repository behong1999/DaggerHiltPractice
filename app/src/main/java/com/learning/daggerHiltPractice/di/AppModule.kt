package com.learning.daggerHiltPractice.di

import com.learning.daggerHiltPractice.data.remote.MyApi
import com.learning.daggerHiltPractice.data.repository.MyRepositoryImpl
import com.learning.daggerHiltPractice.domain.repository.MyRepository
import com.learning.daggerHiltPractice.MyApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
// decide the lifetime of the dependencies in the app module
@InstallIn(SingletonComponent::class)
object AppModule{
  
  @Provides
  @Singleton // make sure repositories getting the same instance of myAPI
  fun provideMyApi():MyApi{
    return Retrofit.Builder().baseUrl("https://test.com").build().create(MyApi::class.java)
  }
  
//  @Provides
//  @Singleton
//  // Look for MyApi instance as above and pass it as an argument
//  fun provideMyRepository(api : MyApi, app: MyApp,
////                          @Named("hello1") hello1:String
//  )
//  :MyRepository{
//    return MyRepositoryImpl(api,app)
//  }

  @Provides
  @Singleton
  @Named("hello1")
  fun provideString1() = "Hello 1"

  @Provides
  @Singleton
  @Named("hello2")
  fun provideString2() = "Hello 2"
  
}