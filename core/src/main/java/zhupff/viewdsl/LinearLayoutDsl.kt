package zhupff.viewdsl

import android.content.Context
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.IdRes

inline fun LinearLayout(
    context: Context,
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(matchParent(), matchParent()),
    block: (@ViewDsl LinearLayout).() -> Unit = {}
): LinearLayout = LinearLayout(context)._init(id, layoutParams).also(block)

inline fun ViewGroup.LinearLayout(
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(matchParent(), matchParent()),
    block: (@ViewDsl LinearLayout).() -> Unit = {}
): LinearLayout = LinearLayout(context)._init(this, id, layoutParams).also(block)