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
 * ComDayCqDamCoreImplServletResourceCollectionServletProperties
 */

@JsonTypeName("comDayCqDamCoreImplServletResourceCollectionServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletResourceCollectionServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray slingServletResourceTypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingServletMethods;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingServletSelectors;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString downloadConfig;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString viewSelector;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean sendEmail;

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletResourceTypes(@Nullable ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

  /**
   * Get slingServletResourceTypes
   * @return slingServletResourceTypes
   */
  @Valid 
  @Schema(name = "sling.servlet.resourceTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.resourceTypes")
  public @Nullable ConfigNodePropertyArray getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  @JsonProperty("sling.servlet.resourceTypes")
  public void setSlingServletResourceTypes(@Nullable ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletMethods(@Nullable ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

  /**
   * Get slingServletMethods
   * @return slingServletMethods
   */
  @Valid 
  @Schema(name = "sling.servlet.methods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.methods")
  public @Nullable ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  @JsonProperty("sling.servlet.methods")
  public void setSlingServletMethods(@Nullable ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletSelectors(@Nullable ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

  /**
   * Get slingServletSelectors
   * @return slingServletSelectors
   */
  @Valid 
  @Schema(name = "sling.servlet.selectors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.selectors")
  public @Nullable ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  @JsonProperty("sling.servlet.selectors")
  public void setSlingServletSelectors(@Nullable ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties downloadConfig(@Nullable ConfigNodePropertyString downloadConfig) {
    this.downloadConfig = downloadConfig;
    return this;
  }

  /**
   * Get downloadConfig
   * @return downloadConfig
   */
  @Valid 
  @Schema(name = "download.config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("download.config")
  public @Nullable ConfigNodePropertyString getDownloadConfig() {
    return downloadConfig;
  }

  @JsonProperty("download.config")
  public void setDownloadConfig(@Nullable ConfigNodePropertyString downloadConfig) {
    this.downloadConfig = downloadConfig;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties viewSelector(@Nullable ConfigNodePropertyString viewSelector) {
    this.viewSelector = viewSelector;
    return this;
  }

  /**
   * Get viewSelector
   * @return viewSelector
   */
  @Valid 
  @Schema(name = "view.selector", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view.selector")
  public @Nullable ConfigNodePropertyString getViewSelector() {
    return viewSelector;
  }

  @JsonProperty("view.selector")
  public void setViewSelector(@Nullable ConfigNodePropertyString viewSelector) {
    this.viewSelector = viewSelector;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties sendEmail(@Nullable ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
    return this;
  }

  /**
   * Get sendEmail
   * @return sendEmail
   */
  @Valid 
  @Schema(name = "send_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("send_email")
  public @Nullable ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }

  @JsonProperty("send_email")
  public void setSendEmail(@Nullable ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletResourceCollectionServletProperties comDayCqDamCoreImplServletResourceCollectionServletProperties = (ComDayCqDamCoreImplServletResourceCollectionServletProperties) o;
    return Objects.equals(this.slingServletResourceTypes, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletResourceTypes) &&
        Objects.equals(this.slingServletMethods, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletMethods) &&
        Objects.equals(this.slingServletSelectors, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletSelectors) &&
        Objects.equals(this.downloadConfig, comDayCqDamCoreImplServletResourceCollectionServletProperties.downloadConfig) &&
        Objects.equals(this.viewSelector, comDayCqDamCoreImplServletResourceCollectionServletProperties.viewSelector) &&
        Objects.equals(this.sendEmail, comDayCqDamCoreImplServletResourceCollectionServletProperties.sendEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletResourceTypes, slingServletMethods, slingServletSelectors, downloadConfig, viewSelector, sendEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletResourceCollectionServletProperties {\n");
    sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    downloadConfig: ").append(toIndentedString(downloadConfig)).append("\n");
    sb.append("    viewSelector: ").append(toIndentedString(viewSelector)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
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

