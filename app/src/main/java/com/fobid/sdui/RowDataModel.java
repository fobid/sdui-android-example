package com.fobid.sdui;

import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BannersRowDataModel.class, name = "row:banners"),
        @JsonSubTypes.Type(value = CurationRowDataModel.class, name = "row:curation")
})
public interface RowDataModel extends Parcelable {

}
