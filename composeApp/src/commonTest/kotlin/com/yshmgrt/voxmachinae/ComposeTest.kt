package com.yshmgrt.voxmachinae

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
class ComposeTest {
    @Test
    fun helloWorldTextIsDisplayed() {
        runComposeUiTest {
            setContent {
                App()
            }
            onNodeWithText("Hello, World!").assertIsDisplayed()
        }
    }
}
