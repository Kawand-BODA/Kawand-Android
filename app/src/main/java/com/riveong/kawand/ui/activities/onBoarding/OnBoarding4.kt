package com.riveong.kawand.ui.activities.onBoarding

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.riveong.kawand.R
import com.riveong.kawand.ui.theme.Primary

@Composable
fun WelcomeScreen4() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(R.drawable.on1), // Replace with your image resource
            contentDescription = "Onboarding Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .heightIn(440.dp, 470.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomEndPercent = 10, bottomStartPercent = 10))

        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(35.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "But first,",
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
            )
            Spacer(modifier = Modifier.height(25.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(5.dp),
                    contentPadding = PaddingValues(horizontal = 40.dp, vertical = 15.dp)
                ) {
                    Icon(Icons.Default.AccountCircle, contentDescription = "Login button")
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Sign in to continue")
                }
                Spacer(modifier = Modifier.heightIn(15.dp))
                Text(text = "or Register instead")
                Spacer(modifier = Modifier.heightIn(20.dp))
                Text(
                    text = "We care about your data privacy! We do not give your data to a certain 3rd party By continuing, you agree to our Term of Service and Privacy Policy",
                    fontSize = 8.sp,
                    textAlign = TextAlign.Center
                )
            }


        }
    }
}


