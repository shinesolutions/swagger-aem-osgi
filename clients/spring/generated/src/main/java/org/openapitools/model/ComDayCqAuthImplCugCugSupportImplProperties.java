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
 * ComDayCqAuthImplCugCugSupportImplProperties
 */

@JsonTypeName("comDayCqAuthImplCugCugSupportImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAuthImplCugCugSupportImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cugExemptedPrincipals;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cugEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cugPrincipalsRegex;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cugPrincipalsReplacement;

  public ComDayCqAuthImplCugCugSupportImplProperties cugExemptedPrincipals(@Nullable ConfigNodePropertyArray cugExemptedPrincipals) {
    this.cugExemptedPrincipals = cugExemptedPrincipals;
    return this;
  }

  /**
   * Get cugExemptedPrincipals
   * @return cugExemptedPrincipals
   */
  @Valid 
  @Schema(name = "cug.exempted.principals", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cug.exempted.principals")
  public @Nullable ConfigNodePropertyArray getCugExemptedPrincipals() {
    return cugExemptedPrincipals;
  }

  @JsonProperty("cug.exempted.principals")
  public void setCugExemptedPrincipals(@Nullable ConfigNodePropertyArray cugExemptedPrincipals) {
    this.cugExemptedPrincipals = cugExemptedPrincipals;
  }

  public ComDayCqAuthImplCugCugSupportImplProperties cugEnabled(@Nullable ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
    return this;
  }

  /**
   * Get cugEnabled
   * @return cugEnabled
   */
  @Valid 
  @Schema(name = "cug.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cug.enabled")
  public @Nullable ConfigNodePropertyBoolean getCugEnabled() {
    return cugEnabled;
  }

  @JsonProperty("cug.enabled")
  public void setCugEnabled(@Nullable ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
  }

  public ComDayCqAuthImplCugCugSupportImplProperties cugPrincipalsRegex(@Nullable ConfigNodePropertyString cugPrincipalsRegex) {
    this.cugPrincipalsRegex = cugPrincipalsRegex;
    return this;
  }

  /**
   * Get cugPrincipalsRegex
   * @return cugPrincipalsRegex
   */
  @Valid 
  @Schema(name = "cug.principals.regex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cug.principals.regex")
  public @Nullable ConfigNodePropertyString getCugPrincipalsRegex() {
    return cugPrincipalsRegex;
  }

  @JsonProperty("cug.principals.regex")
  public void setCugPrincipalsRegex(@Nullable ConfigNodePropertyString cugPrincipalsRegex) {
    this.cugPrincipalsRegex = cugPrincipalsRegex;
  }

  public ComDayCqAuthImplCugCugSupportImplProperties cugPrincipalsReplacement(@Nullable ConfigNodePropertyString cugPrincipalsReplacement) {
    this.cugPrincipalsReplacement = cugPrincipalsReplacement;
    return this;
  }

  /**
   * Get cugPrincipalsReplacement
   * @return cugPrincipalsReplacement
   */
  @Valid 
  @Schema(name = "cug.principals.replacement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cug.principals.replacement")
  public @Nullable ConfigNodePropertyString getCugPrincipalsReplacement() {
    return cugPrincipalsReplacement;
  }

  @JsonProperty("cug.principals.replacement")
  public void setCugPrincipalsReplacement(@Nullable ConfigNodePropertyString cugPrincipalsReplacement) {
    this.cugPrincipalsReplacement = cugPrincipalsReplacement;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAuthImplCugCugSupportImplProperties comDayCqAuthImplCugCugSupportImplProperties = (ComDayCqAuthImplCugCugSupportImplProperties) o;
    return Objects.equals(this.cugExemptedPrincipals, comDayCqAuthImplCugCugSupportImplProperties.cugExemptedPrincipals) &&
        Objects.equals(this.cugEnabled, comDayCqAuthImplCugCugSupportImplProperties.cugEnabled) &&
        Objects.equals(this.cugPrincipalsRegex, comDayCqAuthImplCugCugSupportImplProperties.cugPrincipalsRegex) &&
        Objects.equals(this.cugPrincipalsReplacement, comDayCqAuthImplCugCugSupportImplProperties.cugPrincipalsReplacement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cugExemptedPrincipals, cugEnabled, cugPrincipalsRegex, cugPrincipalsReplacement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAuthImplCugCugSupportImplProperties {\n");
    sb.append("    cugExemptedPrincipals: ").append(toIndentedString(cugExemptedPrincipals)).append("\n");
    sb.append("    cugEnabled: ").append(toIndentedString(cugEnabled)).append("\n");
    sb.append("    cugPrincipalsRegex: ").append(toIndentedString(cugPrincipalsRegex)).append("\n");
    sb.append("    cugPrincipalsReplacement: ").append(toIndentedString(cugPrincipalsReplacement)).append("\n");
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

