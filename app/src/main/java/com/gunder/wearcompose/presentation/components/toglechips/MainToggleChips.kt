package com.gunder.wearcompose.presentation.components.toglechips

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Switch
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.ToggleChip
import com.gunder.wearcompose.R

@Composable
fun MainToggleChips(modifier: Modifier = Modifier) {
    var checked by remember { mutableStateOf(true) }

    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ToggleChip(
            checked = checked,
            onCheckedChange = { checked = it },
            label = { Text(text = "04:30", maxLines = 1, overflow = TextOverflow.Clip) },
            secondaryLabel = {
                Text(
                    text = "EveryDay",
                    maxLines = 1,
                    overflow = TextOverflow.Clip
                )
            },
            toggleControl = {
                Switch(
                    checked = checked,
                    enabled = true,
                    modifier = Modifier.semantics {
                        this.contentDescription =
                            if (checked) "On" else "Off"
                    }
                )
            },
            appIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_alarm),
                    contentDescription = null
                )
            }
        )
        Spacer(modifier = Modifier.size(16.dp))
        Button(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = null
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun MainToggleChipsPreview() {
    MainToggleChips()
}