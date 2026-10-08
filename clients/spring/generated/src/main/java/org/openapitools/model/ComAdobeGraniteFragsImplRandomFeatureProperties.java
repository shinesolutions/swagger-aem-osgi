package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * ComAdobeGraniteFragsImplRandomFeatureProperties
 */

@JsonTypeName("comAdobeGraniteFragsImplRandomFeatureProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteFragsImplRandomFeatureProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString featureName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString featureDescription;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString activePercentage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cookieName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cookieMaxAge;

  public ComAdobeGraniteFragsImplRandomFeatureProperties featureName(@Nullable ConfigNodePropertyString featureName) {
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

  public ComAdobeGraniteFragsImplRandomFeatureProperties featureDescription(@Nullable ConfigNodePropertyString featureDescription) {
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

  public ComAdobeGraniteFragsImplRandomFeatureProperties activePercentage(@Nullable ConfigNodePropertyString activePercentage) {
    this.activePercentage = activePercentage;
    return this;
  }

  /**
   * Get activePercentage
   * @return activePercentage
   */
  @Valid 
  @Schema(name = "active.percentage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active.percentage")
  public @Nullable ConfigNodePropertyString getActivePercentage() {
    return activePercentage;
  }

  @JsonProperty("active.percentage")
  public void setActivePercentage(@Nullable ConfigNodePropertyString activePercentage) {
    this.activePercentage = activePercentage;
  }

  public ComAdobeGraniteFragsImplRandomFeatureProperties cookieName(@Nullable ConfigNodePropertyString cookieName) {
    this.cookieName = cookieName;
    return this;
  }

  /**
   * Get cookieName
   * @return cookieName
   */
  @Valid 
  @Schema(name = "cookie.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cookie.name")
  public @Nullable ConfigNodePropertyString getCookieName() {
    return cookieName;
  }

  @JsonProperty("cookie.name")
  public void setCookieName(@Nullable ConfigNodePropertyString cookieName) {
    this.cookieName = cookieName;
  }

  public ComAdobeGraniteFragsImplRandomFeatureProperties cookieMaxAge(@Nullable ConfigNodePropertyInteger cookieMaxAge) {
    this.cookieMaxAge = cookieMaxAge;
    return this;
  }

  /**
   * Get cookieMaxAge
   * @return cookieMaxAge
   */
  @Valid 
  @Schema(name = "cookie.maxAge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cookie.maxAge")
  public @Nullable ConfigNodePropertyInteger getCookieMaxAge() {
    return cookieMaxAge;
  }

  @JsonProperty("cookie.maxAge")
  public void setCookieMaxAge(@Nullable ConfigNodePropertyInteger cookieMaxAge) {
    this.cookieMaxAge = cookieMaxAge;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteFragsImplRandomFeatureProperties comAdobeGraniteFragsImplRandomFeatureProperties = (ComAdobeGraniteFragsImplRandomFeatureProperties) o;
    return Objects.equals(this.featureName, comAdobeGraniteFragsImplRandomFeatureProperties.featureName) &&
        Objects.equals(this.featureDescription, comAdobeGraniteFragsImplRandomFeatureProperties.featureDescription) &&
        Objects.equals(this.activePercentage, comAdobeGraniteFragsImplRandomFeatureProperties.activePercentage) &&
        Objects.equals(this.cookieName, comAdobeGraniteFragsImplRandomFeatureProperties.cookieName) &&
        Objects.equals(this.cookieMaxAge, comAdobeGraniteFragsImplRandomFeatureProperties.cookieMaxAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, featureDescription, activePercentage, cookieName, cookieMaxAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteFragsImplRandomFeatureProperties {\n");
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    featureDescription: ").append(toIndentedString(featureDescription)).append("\n");
    sb.append("    activePercentage: ").append(toIndentedString(activePercentage)).append("\n");
    sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
    sb.append("    cookieMaxAge: ").append(toIndentedString(cookieMaxAge)).append("\n");
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

