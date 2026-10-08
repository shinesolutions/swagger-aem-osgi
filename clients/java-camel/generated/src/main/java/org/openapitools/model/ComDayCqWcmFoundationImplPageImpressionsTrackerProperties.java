package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmFoundationImplPageImpressionsTrackerProperties
 */

@JsonTypeName("comDayCqWcmFoundationImplPageImpressionsTrackerProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties {

  private ConfigNodePropertyString slingAuthRequirements;

  public ComDayCqWcmFoundationImplPageImpressionsTrackerProperties slingAuthRequirements(ConfigNodePropertyString slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
    return this;
  }

  /**
   * Get slingAuthRequirements
   * @return slingAuthRequirements
   */
  @Valid 
  @Schema(name = "sling.auth.requirements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.auth.requirements")
  public ConfigNodePropertyString getSlingAuthRequirements() {
    return slingAuthRequirements;
  }

  public void setSlingAuthRequirements(ConfigNodePropertyString slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationImplPageImpressionsTrackerProperties comDayCqWcmFoundationImplPageImpressionsTrackerProperties = (ComDayCqWcmFoundationImplPageImpressionsTrackerProperties) o;
    return Objects.equals(this.slingAuthRequirements, comDayCqWcmFoundationImplPageImpressionsTrackerProperties.slingAuthRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingAuthRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties {\n");
    sb.append("    slingAuthRequirements: ").append(toIndentedString(slingAuthRequirements)).append("\n");
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

