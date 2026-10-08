package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamCoreImplProcessTextExtractionProcessProperties
 */

@JsonTypeName("comDayCqDamCoreImplProcessTextExtractionProcessProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplProcessTextExtractionProcessProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray mimeTypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxExtract;

  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties mimeTypes(@Nullable ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

  /**
   * Get mimeTypes
   * @return mimeTypes
   */
  @Valid 
  @Schema(name = "mimeTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mimeTypes")
  public @Nullable ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }

  @JsonProperty("mimeTypes")
  public void setMimeTypes(@Nullable ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties maxExtract(@Nullable ConfigNodePropertyInteger maxExtract) {
    this.maxExtract = maxExtract;
    return this;
  }

  /**
   * Get maxExtract
   * @return maxExtract
   */
  @Valid 
  @Schema(name = "maxExtract", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxExtract")
  public @Nullable ConfigNodePropertyInteger getMaxExtract() {
    return maxExtract;
  }

  @JsonProperty("maxExtract")
  public void setMaxExtract(@Nullable ConfigNodePropertyInteger maxExtract) {
    this.maxExtract = maxExtract;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplProcessTextExtractionProcessProperties comDayCqDamCoreImplProcessTextExtractionProcessProperties = (ComDayCqDamCoreImplProcessTextExtractionProcessProperties) o;
    return Objects.equals(this.mimeTypes, comDayCqDamCoreImplProcessTextExtractionProcessProperties.mimeTypes) &&
        Objects.equals(this.maxExtract, comDayCqDamCoreImplProcessTextExtractionProcessProperties.maxExtract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeTypes, maxExtract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplProcessTextExtractionProcessProperties {\n");
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
    sb.append("    maxExtract: ").append(toIndentedString(maxExtract)).append("\n");
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

