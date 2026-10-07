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
 * ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties
 */

@JsonTypeName("comAdobeCqExperiencelogImplExperienceLogConfigServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray disabledForGroups;

  public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Valid 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties disabledForGroups(@Nullable ConfigNodePropertyArray disabledForGroups) {
    this.disabledForGroups = disabledForGroups;
    return this;
  }

  /**
   * Get disabledForGroups
   * @return disabledForGroups
   */
  @Valid 
  @Schema(name = "disabledForGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabledForGroups")
  public @Nullable ConfigNodePropertyArray getDisabledForGroups() {
    return disabledForGroups;
  }

  @JsonProperty("disabledForGroups")
  public void setDisabledForGroups(@Nullable ConfigNodePropertyArray disabledForGroups) {
    this.disabledForGroups = disabledForGroups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties comAdobeCqExperiencelogImplExperienceLogConfigServletProperties = (ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties) o;
    return Objects.equals(this.enabled, comAdobeCqExperiencelogImplExperienceLogConfigServletProperties.enabled) &&
        Objects.equals(this.disabledForGroups, comAdobeCqExperiencelogImplExperienceLogConfigServletProperties.disabledForGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, disabledForGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    disabledForGroups: ").append(toIndentedString(disabledForGroups)).append("\n");
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

