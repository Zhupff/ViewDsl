package zhupff.viewdsl

import android.content.Context
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.IdRes

inline fun TextView(
    context: Context,
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(wrapContent(), wrapContent()),
    block: (@ViewDsl TextView).() -> Unit = {}
): TextView = TextView(context)._init(id, layoutParams).also(block)

inline fun ViewGroup.TextView(
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(wrapContent(), wrapContent()),
    block: (@ViewDsl TextView).() -> Unit = {}
): TextView = TextView(context)._init(this, id, layoutParams).also(block)