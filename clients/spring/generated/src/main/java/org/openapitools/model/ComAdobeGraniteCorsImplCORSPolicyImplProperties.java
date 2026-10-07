package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeGraniteCorsImplCORSPolicyImplProperties
 */

@JsonTypeName("comAdobeGraniteCorsImplCORSPolicyImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteCorsImplCORSPolicyImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray alloworigin;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray alloworiginregexp;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray allowedpaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray exposedheaders;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray supportedheaders;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray supportedmethods;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean supportscredentials;

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties alloworigin(@Nullable ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
    return this;
  }

  /**
   * Get alloworigin
   * @return alloworigin
   */
  @Valid 
  @Schema(name = "alloworigin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alloworigin")
  public @Nullable ConfigNodePropertyArray getAlloworigin() {
    return alloworigin;
  }

  @JsonProperty("alloworigin")
  public void setAlloworigin(@Nullable ConfigNodePropertyArray alloworigin) {
    this.alloworigin = alloworigin;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties alloworiginregexp(@Nullable ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
    return this;
  }

  /**
   * Get alloworiginregexp
   * @return alloworiginregexp
   */
  @Valid 
  @Schema(name = "alloworiginregexp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alloworiginregexp")
  public @Nullable ConfigNodePropertyArray getAlloworiginregexp() {
    return alloworiginregexp;
  }

  @JsonProperty("alloworiginregexp")
  public void setAlloworiginregexp(@Nullable ConfigNodePropertyArray alloworiginregexp) {
    this.alloworiginregexp = alloworiginregexp;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties allowedpaths(@Nullable ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
    return this;
  }

  /**
   * Get allowedpaths
   * @return allowedpaths
   */
  @Valid 
  @Schema(name = "allowedpaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedpaths")
  public @Nullable ConfigNodePropertyArray getAllowedpaths() {
    return allowedpaths;
  }

  @JsonProperty("allowedpaths")
  public void setAllowedpaths(@Nullable ConfigNodePropertyArray allowedpaths) {
    this.allowedpaths = allowedpaths;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties exposedheaders(@Nullable ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
    return this;
  }

  /**
   * Get exposedheaders
   * @return exposedheaders
   */
  @Valid 
  @Schema(name = "exposedheaders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exposedheaders")
  public @Nullable ConfigNodePropertyArray getExposedheaders() {
    return exposedheaders;
  }

  @JsonProperty("exposedheaders")
  public void setExposedheaders(@Nullable ConfigNodePropertyArray exposedheaders) {
    this.exposedheaders = exposedheaders;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties maxage(@Nullable ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
    return this;
  }

  /**
   * Get maxage
   * @return maxage
   */
  @Valid 
  @Schema(name = "maxage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxage")
  public @Nullable ConfigNodePropertyInteger getMaxage() {
    return maxage;
  }

  @JsonProperty("maxage")
  public void setMaxage(@Nullable ConfigNodePropertyInteger maxage) {
    this.maxage = maxage;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportedheaders(@Nullable ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
    return this;
  }

  /**
   * Get supportedheaders
   * @return supportedheaders
   */
  @Valid 
  @Schema(name = "supportedheaders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportedheaders")
  public @Nullable ConfigNodePropertyArray getSupportedheaders() {
    return supportedheaders;
  }

  @JsonProperty("supportedheaders")
  public void setSupportedheaders(@Nullable ConfigNodePropertyArray supportedheaders) {
    this.supportedheaders = supportedheaders;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportedmethods(@Nullable ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
    return this;
  }

  /**
   * Get supportedmethods
   * @return supportedmethods
   */
  @Valid 
  @Schema(name = "supportedmethods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportedmethods")
  public @Nullable ConfigNodePropertyArray getSupportedmethods() {
    return supportedmethods;
  }

  @JsonProperty("supportedmethods")
  public void setSupportedmethods(@Nullable ConfigNodePropertyArray supportedmethods) {
    this.supportedmethods = supportedmethods;
  }

  public ComAdobeGraniteCorsImplCORSPolicyImplProperties supportscredentials(@Nullable ConfigNodePropertyBoolean supportscredentials) {
    this.supportscredentials = supportscredentials;
    return this;
  }

  /**
   * Get supportscredentials
   * @return supportscredentials
   */
  @Valid 
  @Schema(name = "supportscredentials", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportscredentials")
  public @Nullable ConfigNodePropertyBoolean getSupportscredentials() {
    return supportscredentials;
  }

  @JsonProperty("supportscredentials")
  public void setSupportscredentials(@Nullable ConfigNodePropertyBoolean supportscredentials) {
    this.supportscredentials = supportscredentials;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCorsImplCORSPolicyImplProperties comAdobeGraniteCorsImplCORSPolicyImplProperties = (ComAdobeGraniteCorsImplCORSPolicyImplProperties) o;
    return Objects.equals(this.alloworigin, comAdobeGraniteCorsImplCORSPolicyImplProperties.alloworigin) &&
        Objects.equals(this.alloworiginregexp, comAdobeGraniteCorsImplCORSPolicyImplProperties.alloworiginregexp) &&
        Objects.equals(this.allowedpaths, comAdobeGraniteCorsImplCORSPolicyImplProperties.allowedpaths) &&
        Objects.equals(this.exposedheaders, comAdobeGraniteCorsImplCORSPolicyImplProperties.exposedheaders) &&
        Objects.equals(this.maxage, comAdobeGraniteCorsImplCORSPolicyImplProperties.maxage) &&
        Objects.equals(this.supportedheaders, comAdobeGraniteCorsImplCORSPolicyImplProperties.supportedheaders) &&
        Objects.equals(this.supportedmethods, comAdobeGraniteCorsImplCORSPolicyImplProperties.supportedmethods) &&
        Objects.equals(this.supportscredentials, comAdobeGraniteCorsImplCORSPolicyImplProperties.supportscredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alloworigin, alloworiginregexp, allowedpaths, exposedheaders, maxage, supportedheaders, supportedmethods, supportscredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCorsImplCORSPolicyImplProperties {\n");
    sb.append("    alloworigin: ").append(toIndentedString(alloworigin)).append("\n");
    sb.append("    alloworiginregexp: ").append(toIndentedString(alloworiginregexp)).append("\n");
    sb.append("    allowedpaths: ").append(toIndentedString(allowedpaths)).append("\n");
    sb.append("    exposedheaders: ").append(toIndentedString(exposedheaders)).append("\n");
    sb.append("    maxage: ").append(toIndentedString(maxage)).append("\n");
    sb.append("    supportedheaders: ").append(toIndentedString(supportedheaders)).append("\n");
    sb.append("    supportedmethods: ").append(toIndentedString(supportedmethods)).append("\n");
    sb.append("    supportscredentials: ").append(toIndentedString(supportscredentials)).append("\n");
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

