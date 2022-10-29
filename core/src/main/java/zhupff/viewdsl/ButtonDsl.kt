package zhupff.viewdsl

import android.content.Context
import android.view.ViewGroup
import android.widget.Button
import androidx.annotation.IdRes

inline fun Button(
    context: Context,
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(wrapContent(), wrapContent()),
    block: (@ViewDsl Button).() -> Unit = {}
): Button = Button(context)._init(id, layoutParams).also(block)

inline fun ViewGroup.Button(
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(wrapContent(), wrapContent()),
    block: (@ViewDsl Button).() -> Unit = {}
): Button = Button(context)._init(this, id, layoutParams).also(block)