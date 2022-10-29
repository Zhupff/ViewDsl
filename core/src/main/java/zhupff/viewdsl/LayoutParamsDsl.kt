package zhupff.viewdsl

import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.constraintlayout.widget.ConstraintLayout

inline fun layoutParams(
    width: Int,
    height: Int,
    block: (@ViewDsl ViewGroup.LayoutParams).() -> Unit = {}
): ViewGroup.LayoutParams = ViewGroup.LayoutParams(width, height).also(block)

inline fun marginLayoutParams(
    width: Int,
    height: Int,
    block: (@ViewDsl ViewGroup.MarginLayoutParams).() -> Unit = {}
): ViewGroup.MarginLayoutParams = ViewGroup.MarginLayoutParams(width, height).also(block)

inline fun frameLayoutParams(
    width: Int,
    height: Int,
    block: (@ViewDsl FrameLayout.LayoutParams).() -> Unit = {}
): FrameLayout.LayoutParams = FrameLayout.LayoutParams(width, height).also(block)

inline fun linearLayoutParams(
    width: Int,
    height: Int,
    block: (@ViewDsl LinearLayout.LayoutParams).() -> Unit = {}
): LinearLayout.LayoutParams = LinearLayout.LayoutParams(width, height).also(block)

inline fun relativeLayoutParams(
    width: Int,
    height: Int,
    block: (@ViewDsl RelativeLayout.LayoutParams).() -> Unit = {}
): RelativeLayout.LayoutParams = RelativeLayout.LayoutParams(width, height).also(block)

inline fun constraintLayoutParams(
    width: Int,
    height: Int,
    block: (@ViewDsl ConstraintLayout.LayoutParams).() -> Unit = {}
): ConstraintLayout.LayoutParams = ConstraintLayout.LayoutParams(width, height).also(block)



inline fun <reified T : ViewGroup.LayoutParams> View.layoutParamsAs(
    block: (@ViewDsl T).() -> Unit = {}
) { (layoutParams as T).also(block) }

inline fun View.layoutParams(
    block: (@ViewDsl ViewGroup.LayoutParams).() -> Unit = {}
) { layoutParamsAs<ViewGroup.LayoutParams>(block) }

inline fun View.marginLayoutParams(
    block: (@ViewDsl ViewGroup.MarginLayoutParams).() -> Unit = {}
) { layoutParamsAs<ViewGroup.MarginLayoutParams>(block) }

inline fun View.frameLayoutParams(
    block: (@ViewDsl FrameLayout.LayoutParams).() -> Unit = {}
) { layoutParamsAs<FrameLayout.LayoutParams>(block) }

inline fun View.linearLayoutParams(
    block: (@ViewDsl LinearLayout.LayoutParams).() -> Unit = {}
) { layoutParamsAs<LinearLayout.LayoutParams>(block) }

inline fun View.relativeLayoutParams(
    block: (@ViewDsl RelativeLayout.LayoutParams).() -> Unit = {}
) { layoutParamsAs<RelativeLayout.LayoutParams>(block) }

inline fun View.constraintLayoutParams(
    block: (@ViewDsl ConstraintLayout.LayoutParams).() -> Unit = {}
) { layoutParamsAs<ConstraintLayout.LayoutParams>(block) }



fun matchParent(): Int = ViewGroup.LayoutParams.MATCH_PARENT
fun wrapContent(): Int = ViewGroup.LayoutParams.WRAP_CONTENT