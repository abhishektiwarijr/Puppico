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

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.theme.purple500
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PuppyDetailsScreen(puppy: Puppy, navigateBack: () -> Unit) {
    Scaffold(
        content = {
            PuppyDetailsContent(
                puppy = puppy,
                navigateBack = navigateBack
            )
        }
    )
}

@Composable
private fun PuppyDetailsContent(
    puppy: Puppy,
    navigateBack: () -> Unit
) {
    val context = LocalContext.current
    val scrollState = rememberScrollState()
    Column(
        Modifier.verticalScroll(scrollState)
    ) {
        Header(
            imageUrl = puppy.image,
            name = puppy.name,
            goBack = navigateBack
        )
        Column(
            Modifier.padding(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = puppy.name,
                    style = MaterialTheme.typography.h4
                )
                Spacer(Modifier.width(16.dp))
                Icon(
                    imageVector = if (puppy.gender == "Male") Icons.Filled.Male else Icons.Filled.Female,
                    contentDescription = "Gender Icon",
                    tint = purple500
                )
            }
            Spacer(Modifier.height(12.dp))
            PuppyDetailsRow(title = "Breed:", text = puppy.breed)
            Spacer(Modifier.height(4.dp))
            PuppyDetailsRow(title = "Age:", text = "${puppy.age} months old")
            Spacer(Modifier.height(4.dp))
            PuppyDetailsRow(title = "Location:", text = "${puppy.address}, ${puppy.kms} kms away")
            Spacer(Modifier.height(8.dp))
            Text(text = "${puppy.name} is a loyal, sweet, courageous and cute doggo. understands common gestures as well.")
            Box(
                modifier = Modifier.padding(16.dp)
            ) {
                Button(
                    modifier = Modifier
                        .fillMaxWidth(),
                    onClick = {
                        Toast.makeText(context, "Thank you for adopting me..!", Toast.LENGTH_SHORT)
                            .show()
                    }
                ) {
                    Text("Adopt Me")
                }
            }
        }
    }
}

@Composable
private fun Header(
    imageUrl: String,
    name: String,
    goBack: () -> Unit
) {
    Box(
        Modifier.fillMaxWidth()
    ) {
        CoilImage(
            data = imageUrl,
            contentDescription = "Image of $name",
            contentScale = ContentScale.Crop,
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
            modifier = Modifier
                .aspectRatio(1f)
                .fillMaxWidth()
        )
        IconButton(
            onClick = goBack,
            modifier = Modifier
                .padding(8.dp)
                .size(36.dp)
                .background(
                    color = Color.Black.copy(0.4f),
                    shape = CircleShape
                )
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Go back",
                tint = Color.White
            )
        }
    }
}

@Composable
private fun PuppyDetailsRow(
    title: String,
    text: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.h6
        )
        Spacer(Modifier.width(4.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.body1
        )
    }
}
