package com.business.tools.views

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

/**
 * @name Android Business Toos
 * @class name：com.business.tools.views
 * @author 345 QQ:1831712732
 * @time 2020/4/20 21:07
 * @description 圆角的 FrameLayout
 */

class RoundFrameLayout : FrameLayout {
    constructor(context: Context) : this(context, null) {}

    constructor(context: Context, attributeSet: AttributeSet?) : this(context, attributeSet, 0) {}


    constructor(context: Context, attributeSet: AttributeSet?, defStyleAttr: Int) : this(
            context, attributeSet, defStyleAttr, 0
    )

    constructor(
            context: Context, attributeSet: AttributeSet?, defStyleAttr: Int, defStyleRes: Int
    ) : super(
            context, attributeSet, defStyleAttr, defStyleRes
    ) {
        RoundViewHelper.setViewOutLine(this, attributeSet, defStyleAttr, defStyleRes)
    }

    fun setViewOutLine(radius: Int, radiusSize: Int) {
        RoundViewHelper.setViewOutLine(this, radius, radiusSize)
    }
}