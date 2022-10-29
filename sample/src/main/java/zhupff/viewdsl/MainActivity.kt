package zhupff.viewdsl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            view(FrameLayout(this)) {
                TextView(
                    layoutParams = frameLayoutParams(wrapContent(), wrapContent()) {
                        gravity = Gravity.CENTER
                    }
                ) {
                    text = "Welcome to G-ViewDsl!"
                }
            }
        )
    }
}