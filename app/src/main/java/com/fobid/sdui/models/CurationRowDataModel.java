package com.fobid.sdui.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

import java.util.List;

@AutoValue
@JsonDeserialize(builder = AutoValue_CurationRowDataModel.Builder.class)
@JsonTypeName("row:curation")
public abstract class CurationRowDataModel implements RowDataModel {

    @JsonProperty
    public abstract String desc();

    @JsonProperty
    public abstract String title();

    @JsonProperty
    public abstract String description();

    @JsonProperty
    public abstract List<Restaurant> restaurants();

    @AutoValue.Builder
    abstract static class Builder {

        @JsonProperty
        abstract Builder desc(String desc);

        @JsonProperty
        abstract Builder title(String title);

        @JsonProperty
        abstract Builder description(String description);

        @JsonProperty
        abstract Builder restaurants(List<Restaurant> restaurants);

        abstract CurationRowDataModel build();

        @JsonCreator
        public static CurationRowDataModel.Builder builder() {
            return new AutoValue_CurationRowDataModel.Builder();
        }
    }
}
