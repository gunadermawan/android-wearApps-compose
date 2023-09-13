package com.gunder.wearcompose.presentation.components.circularprogress

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.CircularProgressIndicator
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import com.gunder.wearcompose.R

@Composable
fun MainCircularProgress(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = modifier.padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_running),
                contentDescription = null,
                modifier = modifier
                    .size(64.dp)
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = "Selamat, Guna", fontSize = 14.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = "Hari pertama dari Minggu 1 olahraga rutin telah tercapai!",
                fontSize = 12.sp,
                overflow = TextOverflow.Clip,
                textAlign = TextAlign.Center
            )
        }
        CircularProgressIndicator(
            modifier = modifier
                .fillMaxSize(),
            startAngle = 0f,
            endAngle = 360f,
            progress = 1f,
            strokeWidth = 3.dp,
            indicatorColor = Color.Green,
            trackColor = Color.Green
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainCircularProgressPreview() {
    MainCircularProgress()
}