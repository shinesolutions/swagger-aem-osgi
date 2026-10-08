package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties
 */

@JsonTypeName("comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {

  private ConfigNodePropertyString path;

  private ConfigNodePropertyDropDown tokenRequiredAttr;

  private ConfigNodePropertyString tokenAlternateUrl;

  private ConfigNodePropertyBoolean tokenEncapsulated;

  private ConfigNodePropertyArray skipTokenRefresh;

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @Valid 
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenRequiredAttr(ConfigNodePropertyDropDown tokenRequiredAttr) {
    this.tokenRequiredAttr = tokenRequiredAttr;
    return this;
  }

  /**
   * Get tokenRequiredAttr
   * @return tokenRequiredAttr
   */
  @Valid 
  @Schema(name = "token.required.attr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token.required.attr")
  public ConfigNodePropertyDropDown getTokenRequiredAttr() {
    return tokenRequiredAttr;
  }

  public void setTokenRequiredAttr(ConfigNodePropertyDropDown tokenRequiredAttr) {
    this.tokenRequiredAttr = tokenRequiredAttr;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenAlternateUrl(ConfigNodePropertyString tokenAlternateUrl) {
    this.tokenAlternateUrl = tokenAlternateUrl;
    return this;
  }

  /**
   * Get tokenAlternateUrl
   * @return tokenAlternateUrl
   */
  @Valid 
  @Schema(name = "token.alternate.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token.alternate.url")
  public ConfigNodePropertyString getTokenAlternateUrl() {
    return tokenAlternateUrl;
  }

  public void setTokenAlternateUrl(ConfigNodePropertyString tokenAlternateUrl) {
    this.tokenAlternateUrl = tokenAlternateUrl;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenEncapsulated(ConfigNodePropertyBoolean tokenEncapsulated) {
    this.tokenEncapsulated = tokenEncapsulated;
    return this;
  }

  /**
   * Get tokenEncapsulated
   * @return tokenEncapsulated
   */
  @Valid 
  @Schema(name = "token.encapsulated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token.encapsulated")
  public ConfigNodePropertyBoolean getTokenEncapsulated() {
    return tokenEncapsulated;
  }

  public void setTokenEncapsulated(ConfigNodePropertyBoolean tokenEncapsulated) {
    this.tokenEncapsulated = tokenEncapsulated;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties skipTokenRefresh(ConfigNodePropertyArray skipTokenRefresh) {
    this.skipTokenRefresh = skipTokenRefresh;
    return this;
  }

  /**
   * Get skipTokenRefresh
   * @return skipTokenRefresh
   */
  @Valid 
  @Schema(name = "skip.token.refresh", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skip.token.refresh")
  public ConfigNodePropertyArray getSkipTokenRefresh() {
    return skipTokenRefresh;
  }

  public void setSkipTokenRefresh(ConfigNodePropertyArray skipTokenRefresh) {
    this.skipTokenRefresh = skipTokenRefresh;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties = (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties) o;
    return Objects.equals(this.path, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.path) &&
        Objects.equals(this.tokenRequiredAttr, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenRequiredAttr) &&
        Objects.equals(this.tokenAlternateUrl, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenAlternateUrl) &&
        Objects.equals(this.tokenEncapsulated, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenEncapsulated) &&
        Objects.equals(this.skipTokenRefresh, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.skipTokenRefresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, tokenRequiredAttr, tokenAlternateUrl, tokenEncapsulated, skipTokenRefresh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    tokenRequiredAttr: ").append(toIndentedString(tokenRequiredAttr)).append("\n");
    sb.append("    tokenAlternateUrl: ").append(toIndentedString(tokenAlternateUrl)).append("\n");
    sb.append("    tokenEncapsulated: ").append(toIndentedString(tokenEncapsulated)).append("\n");
    sb.append("    skipTokenRefresh: ").append(toIndentedString(skipTokenRefresh)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

