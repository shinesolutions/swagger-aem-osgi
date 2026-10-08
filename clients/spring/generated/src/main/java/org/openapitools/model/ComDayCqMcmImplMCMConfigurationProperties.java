package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqMcmImplMCMConfigurationProperties
 */

@JsonTypeName("comDayCqMcmImplMCMConfigurationProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMcmImplMCMConfigurationProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray experienceIndirection;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray touchpointIndirection;

  public ComDayCqMcmImplMCMConfigurationProperties experienceIndirection(@Nullable ConfigNodePropertyArray experienceIndirection) {
    this.experienceIndirection = experienceIndirection;
    return this;
  }

  /**
   * Get experienceIndirection
   * @return experienceIndirection
   */
  @Valid 
  @Schema(name = "experience.indirection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("experience.indirection")
  public @Nullable ConfigNodePropertyArray getExperienceIndirection() {
    return experienceIndirection;
  }

  @JsonProperty("experience.indirection")
  public void setExperienceIndirection(@Nullable ConfigNodePropertyArray experienceIndirection) {
    this.experienceIndirection = experienceIndirection;
  }

  public ComDayCqMcmImplMCMConfigurationProperties touchpointIndirection(@Nullable ConfigNodePropertyArray touchpointIndirection) {
    this.touchpointIndirection = touchpointIndirection;
    return this;
  }

  /**
   * Get touchpointIndirection
   * @return touchpointIndirection
   */
  @Valid 
  @Schema(name = "touchpoint.indirection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("touchpoint.indirection")
  public @Nullable ConfigNodePropertyArray getTouchpointIndirection() {
    return touchpointIndirection;
  }

  @JsonProperty("touchpoint.indirection")
  public void setTouchpointIndirection(@Nullable ConfigNodePropertyArray touchpointIndirection) {
    this.touchpointIndirection = touchpointIndirection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMcmImplMCMConfigurationProperties comDayCqMcmImplMCMConfigurationProperties = (ComDayCqMcmImplMCMConfigurationProperties) o;
    return Objects.equals(this.experienceIndirection, comDayCqMcmImplMCMConfigurationProperties.experienceIndirection) &&
        Objects.equals(this.touchpointIndirection, comDayCqMcmImplMCMConfigurationProperties.touchpointIndirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experienceIndirection, touchpointIndirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmImplMCMConfigurationProperties {\n");
    sb.append("    experienceIndirection: ").append(toIndentedString(experienceIndirection)).append("\n");
    sb.append("    touchpointIndirection: ").append(toIndentedString(touchpointIndirection)).append("\n");
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

