package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties
 */

@JsonTypeName("comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString linkExpiredPrefix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean linkExpiredRemove;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString linkExpiredSuffix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString linkInvalidPrefix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean linkInvalidRemove;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString linkInvalidSuffix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString linkPredatedPrefix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean linkPredatedRemove;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString linkPredatedSuffix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray linkWcmmodes;

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredPrefix(@Nullable ConfigNodePropertyString linkExpiredPrefix) {
    this.linkExpiredPrefix = linkExpiredPrefix;
    return this;
  }

  /**
   * Get linkExpiredPrefix
   * @return linkExpiredPrefix
   */
  @Valid 
  @Schema(name = "link.expired.prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link.expired.prefix")
  public @Nullable ConfigNodePropertyString getLinkExpiredPrefix() {
    return linkExpiredPrefix;
  }

  @JsonProperty("link.expired.prefix")
  public void setLinkExpiredPrefix(@Nullable ConfigNodePropertyString linkExpiredPrefix) {
    this.linkExpiredPrefix = linkExpiredPrefix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredRemove(@Nullable ConfigNodePropertyBoolean linkExpiredRemove) {
    this.linkExpiredRemove = linkExpiredRemove;
    return this;
  }

  /**
   * Get linkExpiredRemove
   * @return linkExpiredRemove
   */
  @Valid 
  @Schema(name = "link.expired.remove", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link.expired.remove")
  public @Nullable ConfigNodePropertyBoolean getLinkExpiredRemove() {
    return linkExpiredRemove;
  }

  @JsonProperty("link.expired.remove")
  public void setLinkExpiredRemove(@Nullable ConfigNodePropertyBoolean linkExpiredRemove) {
    this.linkExpiredRemove = linkExpiredRemove;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredSuffix(@Nullable ConfigNodePropertyString linkExpiredSuffix) {
    this.linkExpiredSuffix = linkExpiredSuffix;
    return this;
  }

  /**
   * Get linkExpiredSuffix
   * @return linkExpiredSuffix
   */
  @Valid 
  @Schema(name = "link.expired.suffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link.expired.suffix")
  public @Nullable ConfigNodePropertyString getLinkExpiredSuffix() {
    return linkExpiredSuffix;
  }

  @JsonProperty("link.expired.suffix")
  public void setLinkExpiredSuffix(@Nullable ConfigNodePropertyString linkExpiredSuffix) {
    this.linkExpiredSuffix = linkExpiredSuffix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidPrefix(@Nullable ConfigNodePropertyString linkInvalidPrefix) {
    this.linkInvalidPrefix = linkInvalidPrefix;
    return this;
  }

  /**
   * Get linkInvalidPrefix
   * @return linkInvalidPrefix
   */
  @Valid 
  @Schema(name = "link.invalid.prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link.invalid.prefix")
  public @Nullable ConfigNodePropertyString getLinkInvalidPrefix() {
    return linkInvalidPrefix;
  }

  @JsonProperty("link.invalid.prefix")
  public void setLinkInvalidPrefix(@Nullable ConfigNodePropertyString linkInvalidPrefix) {
    this.linkInvalidPrefix = linkInvalidPrefix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidRemove(@Nullable ConfigNodePropertyBoolean linkInvalidRemove) {
    this.linkInvalidRemove = linkInvalidRemove;
    return this;
  }

  /**
   * Get linkInvalidRemove
   * @return linkInvalidRemove
   */
  @Valid 
  @Schema(name = "link.invalid.remove", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link.invalid.remove")
  public @Nullable ConfigNodePropertyBoolean getLinkInvalidRemove() {
    return linkInvalidRemove;
  }

  @JsonProperty("link.invalid.remove")
  public void setLinkInvalidRemove(@Nullable ConfigNodePropertyBoolean linkInvalidRemove) {
    this.linkInvalidRemove = linkInvalidRemove;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidSuffix(@Nullable ConfigNodePropertyString linkInvalidSuffix) {
    this.linkInvalidSuffix = linkInvalidSuffix;
    return this;
  }

  /**
   * Get linkInvalidSuffix
   * @return linkInvalidSuffix
   */
  @Valid 
  @Schema(name = "link.invalid.suffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link.invalid.suffix")
  public @Nullable ConfigNodePropertyString getLinkInvalidSuffix() {
    return linkInvalidSuffix;
  }

  @JsonProperty("link.invalid.suffix")
  public void setLinkInvalidSuffix(@Nullable ConfigNodePropertyString linkInvalidSuffix) {
    this.linkInvalidSuffix = linkInvalidSuffix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedPrefix(@Nullable ConfigNodePropertyString linkPredatedPrefix) {
    this.linkPredatedPrefix = linkPredatedPrefix;
    return this;
  }

  /**
   * Get linkPredatedPrefix
   * @return linkPredatedPrefix
   */
  @Valid 
  @Schema(name = "link.predated.prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link.predated.prefix")
  public @Nullable ConfigNodePropertyString getLinkPredatedPrefix() {
    return linkPredatedPrefix;
  }

  @JsonProperty("link.predated.prefix")
  public void setLinkPredatedPrefix(@Nullable ConfigNodePropertyString linkPredatedPrefix) {
    this.linkPredatedPrefix = linkPredatedPrefix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedRemove(@Nullable ConfigNodePropertyBoolean linkPredatedRemove) {
    this.linkPredatedRemove = linkPredatedRemove;
    return this;
  }

  /**
   * Get linkPredatedRemove
   * @return linkPredatedRemove
   */
  @Valid 
  @Schema(name = "link.predated.remove", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link.predated.remove")
  public @Nullable ConfigNodePropertyBoolean getLinkPredatedRemove() {
    return linkPredatedRemove;
  }

  @JsonProperty("link.predated.remove")
  public void setLinkPredatedRemove(@Nullable ConfigNodePropertyBoolean linkPredatedRemove) {
    this.linkPredatedRemove = linkPredatedRemove;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedSuffix(@Nullable ConfigNodePropertyString linkPredatedSuffix) {
    this.linkPredatedSuffix = linkPredatedSuffix;
    return this;
  }

  /**
   * Get linkPredatedSuffix
   * @return linkPredatedSuffix
   */
  @Valid 
  @Schema(name = "link.predated.suffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link.predated.suffix")
  public @Nullable ConfigNodePropertyString getLinkPredatedSuffix() {
    return linkPredatedSuffix;
  }

  @JsonProperty("link.predated.suffix")
  public void setLinkPredatedSuffix(@Nullable ConfigNodePropertyString linkPredatedSuffix) {
    this.linkPredatedSuffix = linkPredatedSuffix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkWcmmodes(@Nullable ConfigNodePropertyArray linkWcmmodes) {
    this.linkWcmmodes = linkWcmmodes;
    return this;
  }

  /**
   * Get linkWcmmodes
   * @return linkWcmmodes
   */
  @Valid 
  @Schema(name = "link.wcmmodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link.wcmmodes")
  public @Nullable ConfigNodePropertyArray getLinkWcmmodes() {
    return linkWcmmodes;
  }

  @JsonProperty("link.wcmmodes")
  public void setLinkWcmmodes(@Nullable ConfigNodePropertyArray linkWcmmodes) {
    this.linkWcmmodes = linkWcmmodes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties = (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties) o;
    return Objects.equals(this.linkExpiredPrefix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkExpiredPrefix) &&
        Objects.equals(this.linkExpiredRemove, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkExpiredRemove) &&
        Objects.equals(this.linkExpiredSuffix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkExpiredSuffix) &&
        Objects.equals(this.linkInvalidPrefix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkInvalidPrefix) &&
        Objects.equals(this.linkInvalidRemove, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkInvalidRemove) &&
        Objects.equals(this.linkInvalidSuffix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkInvalidSuffix) &&
        Objects.equals(this.linkPredatedPrefix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkPredatedPrefix) &&
        Objects.equals(this.linkPredatedRemove, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkPredatedRemove) &&
        Objects.equals(this.linkPredatedSuffix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkPredatedSuffix) &&
        Objects.equals(this.linkWcmmodes, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkWcmmodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkExpiredPrefix, linkExpiredRemove, linkExpiredSuffix, linkInvalidPrefix, linkInvalidRemove, linkInvalidSuffix, linkPredatedPrefix, linkPredatedRemove, linkPredatedSuffix, linkWcmmodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {\n");
    sb.append("    linkExpiredPrefix: ").append(toIndentedString(linkExpiredPrefix)).append("\n");
    sb.append("    linkExpiredRemove: ").append(toIndentedString(linkExpiredRemove)).append("\n");
    sb.append("    linkExpiredSuffix: ").append(toIndentedString(linkExpiredSuffix)).append("\n");
    sb.append("    linkInvalidPrefix: ").append(toIndentedString(linkInvalidPrefix)).append("\n");
    sb.append("    linkInvalidRemove: ").append(toIndentedString(linkInvalidRemove)).append("\n");
    sb.append("    linkInvalidSuffix: ").append(toIndentedString(linkInvalidSuffix)).append("\n");
    sb.append("    linkPredatedPrefix: ").append(toIndentedString(linkPredatedPrefix)).append("\n");
    sb.append("    linkPredatedRemove: ").append(toIndentedString(linkPredatedRemove)).append("\n");
    sb.append("    linkPredatedSuffix: ").append(toIndentedString(linkPredatedSuffix)).append("\n");
    sb.append("    linkWcmmodes: ").append(toIndentedString(linkWcmmodes)).append("\n");
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

