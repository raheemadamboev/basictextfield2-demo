package xyz.teamgravity.basictextfield2demo

import androidx.compose.foundation.text2.input.TextFieldState
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val text: TextFieldState = TextFieldState()

    val secureText: TextFieldState = TextFieldState()
}