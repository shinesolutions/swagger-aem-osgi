package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties
 */

@JsonTypeName("comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean damShowexpired;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean damShowhidden;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean tagTitleSearch;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString guessTotal;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString damExpiryProperty;

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damShowexpired(@Nullable ConfigNodePropertyBoolean damShowexpired) {
    this.damShowexpired = damShowexpired;
    return this;
  }

  /**
   * Get damShowexpired
   * @return damShowexpired
   */
  @Valid 
  @Schema(name = "dam.showexpired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dam.showexpired")
  public @Nullable ConfigNodePropertyBoolean getDamShowexpired() {
    return damShowexpired;
  }

  @JsonProperty("dam.showexpired")
  public void setDamShowexpired(@Nullable ConfigNodePropertyBoolean damShowexpired) {
    this.damShowexpired = damShowexpired;
  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damShowhidden(@Nullable ConfigNodePropertyBoolean damShowhidden) {
    this.damShowhidden = damShowhidden;
    return this;
  }

  /**
   * Get damShowhidden
   * @return damShowhidden
   */
  @Valid 
  @Schema(name = "dam.showhidden", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dam.showhidden")
  public @Nullable ConfigNodePropertyBoolean getDamShowhidden() {
    return damShowhidden;
  }

  @JsonProperty("dam.showhidden")
  public void setDamShowhidden(@Nullable ConfigNodePropertyBoolean damShowhidden) {
    this.damShowhidden = damShowhidden;
  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties tagTitleSearch(@Nullable ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
    return this;
  }

  /**
   * Get tagTitleSearch
   * @return tagTitleSearch
   */
  @Valid 
  @Schema(name = "tagTitleSearch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tagTitleSearch")
  public @Nullable ConfigNodePropertyBoolean getTagTitleSearch() {
    return tagTitleSearch;
  }

  @JsonProperty("tagTitleSearch")
  public void setTagTitleSearch(@Nullable ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties guessTotal(@Nullable ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
    return this;
  }

  /**
   * Get guessTotal
   * @return guessTotal
   */
  @Valid 
  @Schema(name = "guessTotal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guessTotal")
  public @Nullable ConfigNodePropertyString getGuessTotal() {
    return guessTotal;
  }

  @JsonProperty("guessTotal")
  public void setGuessTotal(@Nullable ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
  }

  public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties damExpiryProperty(@Nullable ConfigNodePropertyString damExpiryProperty) {
    this.damExpiryProperty = damExpiryProperty;
    return this;
  }

  /**
   * Get damExpiryProperty
   * @return damExpiryProperty
   */
  @Valid 
  @Schema(name = "dam.expiryProperty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dam.expiryProperty")
  public @Nullable ConfigNodePropertyString getDamExpiryProperty() {
    return damExpiryProperty;
  }

  @JsonProperty("dam.expiryProperty")
  public void setDamExpiryProperty(@Nullable ConfigNodePropertyString damExpiryProperty) {
    this.damExpiryProperty = damExpiryProperty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties = (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties) o;
    return Objects.equals(this.damShowexpired, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.damShowexpired) &&
        Objects.equals(this.damShowhidden, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.damShowhidden) &&
        Objects.equals(this.tagTitleSearch, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.tagTitleSearch) &&
        Objects.equals(this.guessTotal, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.guessTotal) &&
        Objects.equals(this.damExpiryProperty, comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.damExpiryProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(damShowexpired, damShowhidden, tagTitleSearch, guessTotal, damExpiryProperty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties {\n");
    sb.append("    damShowexpired: ").append(toIndentedString(damShowexpired)).append("\n");
    sb.append("    damShowhidden: ").append(toIndentedString(damShowhidden)).append("\n");
    sb.append("    tagTitleSearch: ").append(toIndentedString(tagTitleSearch)).append("\n");
    sb.append("    guessTotal: ").append(toIndentedString(guessTotal)).append("\n");
    sb.append("    damExpiryProperty: ").append(toIndentedString(damExpiryProperty)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

