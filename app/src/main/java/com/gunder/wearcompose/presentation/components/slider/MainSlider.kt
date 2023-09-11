package com.gunder.wearcompose.presentation.components.slider

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.InlineSlider
import androidx.wear.compose.material.InlineSliderDefaults
import androidx.wear.compose.material.Text
import com.gunder.wearcompose.R

@Composable
fun MainSlider(modifier: Modifier = Modifier) {
    var value by remember {
        mutableIntStateOf(4)
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_music), contentDescription = null)
            Text(text = "Media Volume", fontSize = 14.sp, fontWeight = FontWeight.Medium)
        }
        Spacer(modifier = Modifier.size(8.dp))
        InlineSlider(
            value = value,
            increaseIcon = {
                Icon(
                    imageVector = InlineSliderDefaults.Increase,
                    contentDescription = null
                )
            },
            onValueChange = { value = it },
            valueProgression = IntProgression.fromClosedRange(10, 100, 10),
            decreaseIcon = {
                Icon(
                    imageVector = InlineSliderDefaults.Decrease,
                    contentDescription = null
                )
            },
            segmented = true
        )

    }
}

@Preview
@Composable
fun MainSliderPreview() {
    MainSlider()
}