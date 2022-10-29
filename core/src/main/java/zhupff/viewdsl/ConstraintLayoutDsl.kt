package zhupff.viewdsl

import android.content.Context
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.constraintlayout.widget.ConstraintLayout

inline fun ConstraintLayout(
    context: Context,
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(matchParent(), matchParent()),
    block: (@ViewDsl ConstraintLayout).() -> Unit = {}
): ConstraintLayout = ConstraintLayout(context)._init(id, layoutParams).also(block)

inline fun ViewGroup.ConstraintLayout(
    @IdRes id: Int = noId(),
    layoutParams: ViewGroup.LayoutParams = layoutParams(matchParent(), matchParent()),
    block: (@ViewDsl ConstraintLayout).() -> Unit = {}
): ConstraintLayout = ConstraintLayout(context)._init(this, id, layoutParams).also(block)