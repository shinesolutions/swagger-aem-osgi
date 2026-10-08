package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties
 */

@JsonTypeName("comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean redirectEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean redirectStatsEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray redirectExtensions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray redirectPaths;

  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectEnabled(@Nullable ConfigNodePropertyBoolean redirectEnabled) {
    this.redirectEnabled = redirectEnabled;
    return this;
  }

  /**
   * Get redirectEnabled
   * @return redirectEnabled
   */
  @Valid 
  @Schema(name = "redirect.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redirect.enabled")
  public @Nullable ConfigNodePropertyBoolean getRedirectEnabled() {
    return redirectEnabled;
  }

  @JsonProperty("redirect.enabled")
  public void setRedirectEnabled(@Nullable ConfigNodePropertyBoolean redirectEnabled) {
    this.redirectEnabled = redirectEnabled;
  }

  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectStatsEnabled(@Nullable ConfigNodePropertyBoolean redirectStatsEnabled) {
    this.redirectStatsEnabled = redirectStatsEnabled;
    return this;
  }

  /**
   * Get redirectStatsEnabled
   * @return redirectStatsEnabled
   */
  @Valid 
  @Schema(name = "redirect.stats.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redirect.stats.enabled")
  public @Nullable ConfigNodePropertyBoolean getRedirectStatsEnabled() {
    return redirectStatsEnabled;
  }

  @JsonProperty("redirect.stats.enabled")
  public void setRedirectStatsEnabled(@Nullable ConfigNodePropertyBoolean redirectStatsEnabled) {
    this.redirectStatsEnabled = redirectStatsEnabled;
  }

  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectExtensions(@Nullable ConfigNodePropertyArray redirectExtensions) {
    this.redirectExtensions = redirectExtensions;
    return this;
  }

  /**
   * Get redirectExtensions
   * @return redirectExtensions
   */
  @Valid 
  @Schema(name = "redirect.extensions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redirect.extensions")
  public @Nullable ConfigNodePropertyArray getRedirectExtensions() {
    return redirectExtensions;
  }

  @JsonProperty("redirect.extensions")
  public void setRedirectExtensions(@Nullable ConfigNodePropertyArray redirectExtensions) {
    this.redirectExtensions = redirectExtensions;
  }

  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectPaths(@Nullable ConfigNodePropertyArray redirectPaths) {
    this.redirectPaths = redirectPaths;
    return this;
  }

  /**
   * Get redirectPaths
   * @return redirectPaths
   */
  @Valid 
  @Schema(name = "redirect.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redirect.paths")
  public @Nullable ConfigNodePropertyArray getRedirectPaths() {
    return redirectPaths;
  }

  @JsonProperty("redirect.paths")
  public void setRedirectPaths(@Nullable ConfigNodePropertyArray redirectPaths) {
    this.redirectPaths = redirectPaths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties = (ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties) o;
    return Objects.equals(this.redirectEnabled, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectEnabled) &&
        Objects.equals(this.redirectStatsEnabled, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectStatsEnabled) &&
        Objects.equals(this.redirectExtensions, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectExtensions) &&
        Objects.equals(this.redirectPaths, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectEnabled, redirectStatsEnabled, redirectExtensions, redirectPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {\n");
    sb.append("    redirectEnabled: ").append(toIndentedString(redirectEnabled)).append("\n");
    sb.append("    redirectStatsEnabled: ").append(toIndentedString(redirectStatsEnabled)).append("\n");
    sb.append("    redirectExtensions: ").append(toIndentedString(redirectExtensions)).append("\n");
    sb.append("    redirectPaths: ").append(toIndentedString(redirectPaths)).append("\n");
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

