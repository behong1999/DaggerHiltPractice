package com.learning.daggerHiltPractice.domain.repository

interface MyRepository {
  suspend fun doNetworkCall()
}