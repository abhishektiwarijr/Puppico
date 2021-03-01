/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
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
                    Text(
                        text = "Welcome mate...!",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = "A friend in need is a friend indeed.",
                        style = TextStyle(
                            fontSize = 20.sp,
                        )
                    )
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
