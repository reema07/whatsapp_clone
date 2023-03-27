package com.rayandroid.jetpack.whatsapp.screen.chat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.rayandroid.jetpack.whatsapp.data.local.addChat
import com.rayandroid.jetpack.whatsapp.data.model.User
import com.rayandroid.jetpack.whatsapp.screen.chat.ui.ChatScreenView
import com.rayandroid.jetpack.whatsapp.ui.WhatsAppTheme

@ExperimentalFoundationApi
class ChatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val userName = arguments?.getString("userName") ?: ""
        val userImage = arguments?.getString("userImage") ?: ""

        return ComposeView(requireContext()).apply {
            setContent {
                WhatsAppTheme {
                    ChatScreenView(User(2, userName, userImage), {
                        requireActivity().onBackPressed()
                    }) { message ->
                        if (message.isNotEmpty()) {
                            addChat(message)
                        }
                    }
                }
            }
        }
    }
}