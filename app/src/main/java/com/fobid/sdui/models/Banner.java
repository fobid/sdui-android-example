package com.fobid.sdui.models;

import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

@AutoValue
@JsonDeserialize(builder = AutoValue_Banner.Builder.class)
public abstract class Banner implements Parcelable {

    @JsonProperty
    public abstract String image();

    @JsonProperty
    public abstract String action();

    @AutoValue.Builder
    public abstract static class Builder {

        @JsonProperty
        abstract Builder image(String image);

        @JsonProperty
        abstract Builder action(String action);

        abstract Banner build();

        @JsonCreator
        public static Builder builder() {
            return new AutoValue_Banner.Builder();
        }
    }
}
