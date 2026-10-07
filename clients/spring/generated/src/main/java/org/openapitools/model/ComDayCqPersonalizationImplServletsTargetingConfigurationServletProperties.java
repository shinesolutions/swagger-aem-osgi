package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties
 */

@JsonTypeName("comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean forcelocation;

  public ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties forcelocation(@Nullable ConfigNodePropertyBoolean forcelocation) {
    this.forcelocation = forcelocation;
    return this;
  }

  /**
   * Get forcelocation
   * @return forcelocation
   */
  @Valid 
  @Schema(name = "forcelocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forcelocation")
  public @Nullable ConfigNodePropertyBoolean getForcelocation() {
    return forcelocation;
  }

  @JsonProperty("forcelocation")
  public void setForcelocation(@Nullable ConfigNodePropertyBoolean forcelocation) {
    this.forcelocation = forcelocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties = (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties) o;
    return Objects.equals(this.forcelocation, comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.forcelocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forcelocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties {\n");
    sb.append("    forcelocation: ").append(toIndentedString(forcelocation)).append("\n");
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

