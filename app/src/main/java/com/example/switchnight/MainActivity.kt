package com.example.switchnight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.switchnight.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // State to track whether dark mode is enabled
            var isDarkMode by remember { mutableStateOf(false) }

            // Apply the theme based on the isDarkMode state
            AppTheme(darkTheme = isDarkMode) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Switch to ${if (isDarkMode) "Light" else "Dark"} Mode")
                        Spacer(modifier = Modifier.height(16.dp)) // Spacer for spacing

                        // Switch to toggle between light and dark modes
                        Switch(
                            checked = isDarkMode,
                            onCheckedChange = { isDarkMode = it },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = MaterialTheme.colorScheme.primary,
                                checkedTrackColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
                            ),
                            thumbContent = {
                                // Icon for the switch thumb
                                Image(
                                    painter = if (isDarkMode) painterResource(R.drawable.moon) else painterResource(R.drawable.sun),
                                    contentDescription = if (isDarkMode) "Dark Mode" else "Light Mode",
                                    modifier = Modifier.fillMaxSize() // Fill the size of the thumb
                                )
                            },
                            modifier = Modifier.scale(2f) // Increase the scale to make the switch bigger
                        )
                    }
                }
            }
        }
    }
}