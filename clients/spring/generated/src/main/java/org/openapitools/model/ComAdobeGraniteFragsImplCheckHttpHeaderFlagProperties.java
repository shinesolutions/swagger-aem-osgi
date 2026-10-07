package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties
 */

@JsonTypeName("comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString featureName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString featureDescription;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString httpHeaderName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString httpHeaderValuepattern;

  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties featureName(@Nullable ConfigNodePropertyString featureName) {
    this.featureName = featureName;
    return this;
  }

  /**
   * Get featureName
   * @return featureName
   */
  @Valid 
  @Schema(name = "feature.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feature.name")
  public @Nullable ConfigNodePropertyString getFeatureName() {
    return featureName;
  }

  @JsonProperty("feature.name")
  public void setFeatureName(@Nullable ConfigNodePropertyString featureName) {
    this.featureName = featureName;
  }

  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties featureDescription(@Nullable ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
    return this;
  }

  /**
   * Get featureDescription
   * @return featureDescription
   */
  @Valid 
  @Schema(name = "feature.description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feature.description")
  public @Nullable ConfigNodePropertyString getFeatureDescription() {
    return featureDescription;
  }

  @JsonProperty("feature.description")
  public void setFeatureDescription(@Nullable ConfigNodePropertyString featureDescription) {
    this.featureDescription = featureDescription;
  }

  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties httpHeaderName(@Nullable ConfigNodePropertyString httpHeaderName) {
    this.httpHeaderName = httpHeaderName;
    return this;
  }

  /**
   * Get httpHeaderName
   * @return httpHeaderName
   */
  @Valid 
  @Schema(name = "http.header.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("http.header.name")
  public @Nullable ConfigNodePropertyString getHttpHeaderName() {
    return httpHeaderName;
  }

  @JsonProperty("http.header.name")
  public void setHttpHeaderName(@Nullable ConfigNodePropertyString httpHeaderName) {
    this.httpHeaderName = httpHeaderName;
  }

  public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties httpHeaderValuepattern(@Nullable ConfigNodePropertyString httpHeaderValuepattern) {
    this.httpHeaderValuepattern = httpHeaderValuepattern;
    return this;
  }

  /**
   * Get httpHeaderValuepattern
   * @return httpHeaderValuepattern
   */
  @Valid 
  @Schema(name = "http.header.valuepattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("http.header.valuepattern")
  public @Nullable ConfigNodePropertyString getHttpHeaderValuepattern() {
    return httpHeaderValuepattern;
  }

  @JsonProperty("http.header.valuepattern")
  public void setHttpHeaderValuepattern(@Nullable ConfigNodePropertyString httpHeaderValuepattern) {
    this.httpHeaderValuepattern = httpHeaderValuepattern;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties = (ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties) o;
    return Objects.equals(this.featureName, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.featureName) &&
        Objects.equals(this.featureDescription, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.featureDescription) &&
        Objects.equals(this.httpHeaderName, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.httpHeaderName) &&
        Objects.equals(this.httpHeaderValuepattern, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.httpHeaderValuepattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, featureDescription, httpHeaderName, httpHeaderValuepattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {\n");
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    featureDescription: ").append(toIndentedString(featureDescription)).append("\n");
    sb.append("    httpHeaderName: ").append(toIndentedString(httpHeaderName)).append("\n");
    sb.append("    httpHeaderValuepattern: ").append(toIndentedString(httpHeaderValuepattern)).append("\n");
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

