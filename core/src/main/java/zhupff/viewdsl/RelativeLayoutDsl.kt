package zhupff.viewdsl

import android.content.Context
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.annotation.IdRes

inline fun RelativeLayout(
    context: Context,
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(matchParent(), matchParent()),
    block: (@ViewDsl RelativeLayout).() -> Unit = {}
): RelativeLayout = RelativeLayout(context)._init(id, layoutParams).also(block)

inline fun ViewGroup.RelativeLayout(
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(matchParent(), matchParent()),
    block: (@ViewDsl RelativeLayout).() -> Unit = {}
): RelativeLayout = RelativeLayout(context)._init(this, id, layoutParams).also(block)