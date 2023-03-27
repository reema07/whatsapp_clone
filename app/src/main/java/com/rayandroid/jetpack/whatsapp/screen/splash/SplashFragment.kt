package com.rayandroid.jetpack.whatsapp.screen.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.rayandroid.jetpack.screen.splash.SplashView
import com.rayandroid.jetpack.whatsapp.R
import com.rayandroid.jetpack.whatsapp.ui.WhatsAppTheme

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                WhatsAppTheme {
                    SplashView {
                        findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
                    }
                }
            }
        }
    }
}