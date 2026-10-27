package com.mad.talenttrack.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mad.talenttrack.ui.theme.TalentTrackTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(onGetStartedClick: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Talent Track")
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Track your talents effortlessly!",
                style = MaterialTheme.typography.bodyLarge
            )
            Button(
                onClick = onGetStartedClick,
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("Get Started")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    TalentTrackTheme {
        MainScreen(onGetStartedClick = {})
    }
}