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
 * ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
 */

@JsonTypeName("comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean nuiEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString nuiServiceUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString nuiApiKey;

  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiEnabled(@Nullable ConfigNodePropertyBoolean nuiEnabled) {
    this.nuiEnabled = nuiEnabled;
    return this;
  }

  /**
   * Get nuiEnabled
   * @return nuiEnabled
   */
  @Valid 
  @Schema(name = "nuiEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nuiEnabled")
  public @Nullable ConfigNodePropertyBoolean getNuiEnabled() {
    return nuiEnabled;
  }

  @JsonProperty("nuiEnabled")
  public void setNuiEnabled(@Nullable ConfigNodePropertyBoolean nuiEnabled) {
    this.nuiEnabled = nuiEnabled;
  }

  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiServiceUrl(@Nullable ConfigNodePropertyString nuiServiceUrl) {
    this.nuiServiceUrl = nuiServiceUrl;
    return this;
  }

  /**
   * Get nuiServiceUrl
   * @return nuiServiceUrl
   */
  @Valid 
  @Schema(name = "nuiServiceUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nuiServiceUrl")
  public @Nullable ConfigNodePropertyString getNuiServiceUrl() {
    return nuiServiceUrl;
  }

  @JsonProperty("nuiServiceUrl")
  public void setNuiServiceUrl(@Nullable ConfigNodePropertyString nuiServiceUrl) {
    this.nuiServiceUrl = nuiServiceUrl;
  }

  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiApiKey(@Nullable ConfigNodePropertyString nuiApiKey) {
    this.nuiApiKey = nuiApiKey;
    return this;
  }

  /**
   * Get nuiApiKey
   * @return nuiApiKey
   */
  @Valid 
  @Schema(name = "nuiApiKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nuiApiKey")
  public @Nullable ConfigNodePropertyString getNuiApiKey() {
    return nuiApiKey;
  }

  @JsonProperty("nuiApiKey")
  public void setNuiApiKey(@Nullable ConfigNodePropertyString nuiApiKey) {
    this.nuiApiKey = nuiApiKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties = (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties) o;
    return Objects.equals(this.nuiEnabled, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiEnabled) &&
        Objects.equals(this.nuiServiceUrl, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiServiceUrl) &&
        Objects.equals(this.nuiApiKey, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiApiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nuiEnabled, nuiServiceUrl, nuiApiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {\n");
    sb.append("    nuiEnabled: ").append(toIndentedString(nuiEnabled)).append("\n");
    sb.append("    nuiServiceUrl: ").append(toIndentedString(nuiServiceUrl)).append("\n");
    sb.append("    nuiApiKey: ").append(toIndentedString(nuiApiKey)).append("\n");
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

