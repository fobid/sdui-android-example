package com.fobid.sdui;

import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

import java.util.ArrayList;

@AutoValue
@JsonDeserialize(builder = AutoValue_Home.Builder.class)
public abstract class Home implements Parcelable {

    @JsonProperty
    public abstract long idx();

    @JsonProperty
    public abstract String type();

    @JsonProperty
    public abstract ArrayList<RowDataModel> rows();

    @AutoValue.Builder
    abstract static class Builder {

        @JsonProperty
        abstract Builder idx(long idx);

        @JsonProperty
        abstract Builder type(String type);

        @JsonProperty
        abstract Builder rows(ArrayList<RowDataModel> rows);

        abstract Home build();

        @JsonCreator
        public static Builder builder() {
            return new AutoValue_Home.Builder();
        }
    }
}
