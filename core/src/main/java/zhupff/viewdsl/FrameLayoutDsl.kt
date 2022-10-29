package zhupff.viewdsl

import android.content.Context
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.IdRes

inline fun FrameLayout(
    context: Context,
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(matchParent(), matchParent()),
    block: (@ViewDsl FrameLayout).() -> Unit = {}
): FrameLayout = FrameLayout(context)._init(id, layoutParams).also(block)

inline fun ViewGroup.FrameLayout(
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(matchParent(), matchParent()),
    block: (@ViewDsl FrameLayout).() -> Unit = {}
): FrameLayout = FrameLayout(context)._init(this, id, layoutParams).also(block)