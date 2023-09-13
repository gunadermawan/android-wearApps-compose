package com.gunder.wearcompose.presentation.components.stepper

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Card
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.InlineSliderDefaults
import androidx.wear.compose.material.Stepper
import androidx.wear.compose.material.Text
import com.gunder.wearcompose.R

@Composable
fun MainStepper(modifier: Modifier = Modifier) {
    var value by remember {
        mutableIntStateOf(5)
    }
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Stepper(
            value = value,
            onValueChange = { value = it },
            valueProgression = IntProgression.fromClosedRange(10, 100, 10),
            decreaseIcon = {
                Icon(
                    imageVector = InlineSliderDefaults.Decrease,
                    contentDescription = null
                )
            },
            increaseIcon = {
                Icon(
                    imageVector = InlineSliderDefaults.Increase,
                    contentDescription = null
                )
            }) {

            Card(
                onClick = { }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Row(
                    modifier
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_headphones),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(text = "Headphones $value %")
                }
            }
        }
    }
}

@Preview
@Composable
fun MainStepperPreview() {
    MainStepper()
}