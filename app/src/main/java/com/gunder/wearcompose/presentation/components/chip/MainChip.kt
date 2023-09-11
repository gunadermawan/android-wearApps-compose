package com.gunder.wearcompose.presentation.components.chip

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import com.gunder.wearcompose.R

@Composable
fun MainChip(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(4.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "To do hari ini", fontSize = 14.sp, fontFamily = FontFamily.SansSerif)
        Spacer(modifier = Modifier.size(8.dp))
        Chip(
            label = {
                Text(
                    text = "chat ayang",
                    fontSize = 12.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Clip
                )
            },
            secondaryLabel = { Text(text = "nyobain cafe baru", fontSize = 10.sp) },
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_checked),
                    contentDescription = null
                )
            })
        Spacer(modifier = Modifier.size(4.dp))
        Chip(
            label = {
                Text(
                    text = "ngoding lagi",
                    fontSize = 12.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Clip
                )
            },
            secondaryLabel = { Text(text = "update android 14", fontSize = 10.sp) },
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_check),
                    contentDescription = null
                )
            })

    }
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.WEAR_OS_SMALL_ROUND)
@Composable
fun MainChipPreview() {
    MainChip()
}