package com.riveong.kawand.ui.activities.onBoarding

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.riveong.kawand.R
import com.riveong.kawand.ui.theme.Primary

@Composable
fun WelcomeScreen3() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(R.drawable.on3), // Replace with your image resource
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
                text = "Your Preferences Matter",
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = stringResource(R.string.on3),
                fontSize = 16.sp,

            )
            Spacer(modifier = Modifier.height(14.dp))
            OutlinedButton(onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(40.dp)
                    .align(Alignment.End),  //avoid the oval shape
                shape = CircleShape,
                border = BorderStroke(1.dp, Primary),
                contentPadding = PaddingValues(0.dp),  //avoid the little icon
                colors = ButtonDefaults.outlinedButtonColors(),

            ) {
                Icon(
                    Icons.Default.KeyboardArrowDown, contentDescription = "next",
                    Modifier.size(20.dp)

                )
            }
        }
    }
}

