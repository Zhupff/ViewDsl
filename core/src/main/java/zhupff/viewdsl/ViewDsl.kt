package zhupff.viewdsl

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes

@DslMarker
@Target(AnnotationTarget.TYPE)
annotation class ViewDsl


inline fun View(
    context: Context,
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(wrapContent(), wrapContent()),
    block: (@ViewDsl View).() -> Unit = {}
): View = View(context)._init(id, layoutParams).also(block)

inline fun ViewGroup.View(
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(wrapContent(), wrapContent()),
    block: (@ViewDsl View).() -> Unit = {}
): View = View(context)._init(this, id, layoutParams).also(block)

inline fun <T : View> view(
    view: T,
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams? = null,
    block: (@ViewDsl T).() -> Unit = {}
): T = view._init(id, layoutParams).also(block)

inline fun <T : View> ViewGroup.view(
    view: T,
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams? = null,
    block: (@ViewDsl T).() -> Unit = {}
): T = view._init(this, id, layoutParams).also(block)