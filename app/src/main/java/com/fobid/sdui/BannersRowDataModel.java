package com.fobid.sdui;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;

import java.util.List;

@AutoValue
@JsonDeserialize(builder = AutoValue_BannersRowDataModel.Builder.class)
@JsonTypeName("row:banners")
public abstract class BannersRowDataModel implements RowDataModel {

    @JsonProperty
    public abstract String desc();

    @JsonProperty
    public abstract List<BannerModel> banners();

    @AutoValue.Builder
    abstract static class Builder {

        @JsonProperty
        abstract Builder desc(String desc);

        @JsonProperty
        abstract Builder banners(List<BannerModel> banners);

        abstract BannersRowDataModel build();

        @JsonCreator
        public static Builder builder() {
            return new AutoValue_BannersRowDataModel.Builder();
        }
    }
}
