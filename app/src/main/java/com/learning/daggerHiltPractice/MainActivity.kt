package com.learning.daggerHiltPractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.learning.daggerHiltPractice.ui.theme.DaggerhiltpracticeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  
  override fun onCreate(savedInstanceState : Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      DaggerhiltpracticeTheme {
        // repository singleton will be injected into the MyViewModel
        // while the myApi will be injected into the repository
        val viewModel = hiltViewModel<MyViewModel>()
      }
    }
  }
}
