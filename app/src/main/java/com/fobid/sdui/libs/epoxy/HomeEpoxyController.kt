package com.fobid.sdui.libs.epoxy

import com.airbnb.epoxy.TypedEpoxyController
import com.fobid.sdui.models.BannersRowDataModel
import com.fobid.sdui.models.CurationRowDataModel
import com.fobid.sdui.models.Home
import com.fobid.sdui.ui.widgets.basicRow

class HomeEpoxyController : TypedEpoxyController<Home>() {

    override fun buildModels(data: Home?) {
        for (row in data!!.rows()) {
            when (row) {
                is BannersRowDataModel -> {
                    row.buildModel()
                }
                is CurationRowDataModel -> {
                    row.buildModel()
                }
            }
        }
    }

    private fun BannersRowDataModel.buildModel() = basicRow {
        id("this is banner id")
        title(desc())
    }

    private fun CurationRowDataModel.buildModel() = basicRow {
        id("this is curation id")
        title(title())
    }
}