package zhupff.viewdsl

import android.content.Context
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.IdRes

inline fun ImageView(
    context: Context,
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(wrapContent(), wrapContent()),
    block: (@ViewDsl ImageView).() -> Unit = {}
): ImageView = ImageView(context)._init(id, layoutParams).also(block)

inline fun ViewGroup.ImageView(
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(wrapContent(), wrapContent()),
    block: (@ViewDsl ImageView).() -> Unit = {}
): ImageView = ImageView(context)._init(this, id, layoutParams).also(block)