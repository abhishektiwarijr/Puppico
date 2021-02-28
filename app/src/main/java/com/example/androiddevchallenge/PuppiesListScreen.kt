package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.transform.CircleCropTransformation
import com.example.androiddevchallenge.data.Puppy
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PuppiesListScreen(puppies: List<Puppy>, navigateToPuppyDetails: (Puppy) -> Unit) {
    Surface(color = MaterialTheme.colors.background) {
        Column {
            Row(modifier = Modifier.padding(16.dp)) {
                Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center) {
                    Text(text = "Welcome mate...!", style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    ))
                    Text(text = "A friend in need is a friend indeed.", style = TextStyle(
                        fontSize = 20.sp,
                    ))
                }
                Image(
                    painter = painterResource(id = R.drawable.captain_snowball),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .clip(CircleShape)
                )
            }
            LazyColumnScrollableComponent(puppies, navigateToPuppyDetails)
        }
    }
}

@Composable
fun LazyColumnScrollableComponent(dogList: List<Puppy>, navigateToPuppyDetails: (Puppy) -> Unit) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp),
    ) {
        items(dogList) { item ->
            Card(
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable {
                        navigateToPuppyDetails(item)
                    },
                elevation = 4.dp,
                backgroundColor = Color(Color.White.value),
//            backgroundColor = Color(red = 230, green = 230, blue = 250)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(modifier = Modifier.padding(16.dp)) {
                        CoilImage(
                            data = item.image,
                            contentDescription = null,
                            modifier = Modifier
                                .width(90.dp)
                                .height(90.dp),
                            loading = {
                                Box(Modifier.matchParentSize()) {
                                    CircularProgressIndicator(Modifier.align(Alignment.Center))
                                }
                            },
                            error = {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_error),
                                    contentDescription = ""
                                )
                            },
                            fadeIn = true,
                            requestBuilder = {
                                transformations(CircleCropTransformation())
                            }
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Column {
                            Text(
                                text = item.name,
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                            )
                            Text(
                                text = "${item.breed}, ${item.gender}\n${item.age} months old, ${item.kms} kms away",
                                color = Color.Black,
                            )
                        }
                    }
                }
            }
        }
    }
}