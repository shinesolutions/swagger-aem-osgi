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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString path;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown tokenRequiredAttr;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString tokenAlternateUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean tokenEncapsulated;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray skipTokenRefresh;

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties path(@Nullable ConfigNodePropertyString path) {
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
  public @Nullable ConfigNodePropertyString getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(@Nullable ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenRequiredAttr(@Nullable ConfigNodePropertyDropDown tokenRequiredAttr) {
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
  public @Nullable ConfigNodePropertyDropDown getTokenRequiredAttr() {
    return tokenRequiredAttr;
  }

  @JsonProperty("token.required.attr")
  public void setTokenRequiredAttr(@Nullable ConfigNodePropertyDropDown tokenRequiredAttr) {
    this.tokenRequiredAttr = tokenRequiredAttr;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenAlternateUrl(@Nullable ConfigNodePropertyString tokenAlternateUrl) {
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
  public @Nullable ConfigNodePropertyString getTokenAlternateUrl() {
    return tokenAlternateUrl;
  }

  @JsonProperty("token.alternate.url")
  public void setTokenAlternateUrl(@Nullable ConfigNodePropertyString tokenAlternateUrl) {
    this.tokenAlternateUrl = tokenAlternateUrl;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenEncapsulated(@Nullable ConfigNodePropertyBoolean tokenEncapsulated) {
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
  public @Nullable ConfigNodePropertyBoolean getTokenEncapsulated() {
    return tokenEncapsulated;
  }

  @JsonProperty("token.encapsulated")
  public void setTokenEncapsulated(@Nullable ConfigNodePropertyBoolean tokenEncapsulated) {
    this.tokenEncapsulated = tokenEncapsulated;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties skipTokenRefresh(@Nullable ConfigNodePropertyArray skipTokenRefresh) {
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
  public @Nullable ConfigNodePropertyArray getSkipTokenRefresh() {
    return skipTokenRefresh;
  }

  @JsonProperty("skip.token.refresh")
  public void setSkipTokenRefresh(@Nullable ConfigNodePropertyArray skipTokenRefresh) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

