import androidx.compose.ui.window.ComposeUIViewController
import com.yshmgrt.voxmachinae.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
