package com.gunder.wearcompose.presentation.components.utils

import android.text.format.DateFormat
import androidx.compose.runtime.Composable
import androidx.wear.compose.material.TimeTextDefaults
import java.util.Locale

@Composable
fun TimeText() {
    androidx.wear.compose.material.TimeText(
        timeSource = TimeTextDefaults.timeSource(
            DateFormat.getBestDateTimePattern(Locale.getDefault(), "hh:mm")
        )
    )

}