package com.fobid.sdui.ui.widgets

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import com.fobid.sdui.R

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class BasicRow @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val titleView: TextView

    init {
        inflate(context, R.layout.baskc_row, this)

        titleView = findViewById(R.id.title)
    }

    @TextProp
    fun setTitle(title: CharSequence) {
        titleView.text = title
    }
}