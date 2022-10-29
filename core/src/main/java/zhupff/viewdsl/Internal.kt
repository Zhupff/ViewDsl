package zhupff.viewdsl

import android.view.View
import android.view.ViewGroup

@PublishedApi
internal fun noId(): Int = View.NO_ID

@PublishedApi
internal fun <T : View> T._init(
    id: Int,
    layoutParams: ViewGroup.LayoutParams?
) = apply {
    if (id != noId()) {
        this.id = id
    }
    if (layoutParams != null) this.layoutParams = layoutParams
}

@PublishedApi
internal fun <T : View> T._init(
    parent: ViewGroup,
    id: Int,
    layoutParams: ViewGroup.LayoutParams?
) = apply {
    if (id != noId()) {
        this.id = id
    }
    if (layoutParams != null) {
        parent.addView(this, layoutParams)
    } else {
        parent.addView(this)
    }
}