package com.rayandroid.jetpack.whatsapp.screen.main.view.call

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rayandroid.jetpack.whatsapp.data.local.calls
import com.rayandroid.jetpack.whatsapp.util.colorLightGreen

@Composable
fun CallsView() {
    LazyColumnFor(calls, modifier = Modifier.background(color = colorLightGreen())) { call ->
        CallItem(call)
        Divider()
    }
}