import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.yshmgrt.voxmachinae.App
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    println("Hello, World!")
    val body = document.body ?: return
    ComposeViewport(body) {
        App()
    }
}
