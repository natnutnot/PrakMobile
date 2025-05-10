package com.example.gracemanhwa_picks

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(navController: NavController) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Grz's Manhwa Picks",
                        style = MaterialTheme.typography.titleSmall
                    )
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(8.dp)
        ) {
            items(manhwaList) { item ->
                Card(
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Image(
                            painter = painterResource(id = item.imageRes),
                            contentDescription = item.title,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp)
                                .clip(RoundedCornerShape(16.dp))
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            item.title,
                            style = MaterialTheme.typography.titleLarge
                        )
                        Text(
                            "By ${item.author}",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Button(onClick = {
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(item.url))
                                context.startActivity(intent)
                            }) {
                                Text("Baca")
                            }
                            Button(onClick = {
                                navController.navigate("detail/${item.id}")
                            }) {
                                Text("Detail")
                            }
                        }
                    }
                }
            }
        }
    }
}