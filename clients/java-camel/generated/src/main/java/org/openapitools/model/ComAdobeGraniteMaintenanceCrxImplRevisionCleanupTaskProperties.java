package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties
 */

@JsonTypeName("comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties {

  private ConfigNodePropertyArray fullGcDays;

  public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties fullGcDays(ConfigNodePropertyArray fullGcDays) {
    this.fullGcDays = fullGcDays;
    return this;
  }

  /**
   * Get fullGcDays
   * @return fullGcDays
   */
  @Valid 
  @Schema(name = "full.gc.days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("full.gc.days")
  public ConfigNodePropertyArray getFullGcDays() {
    return fullGcDays;
  }

  public void setFullGcDays(ConfigNodePropertyArray fullGcDays) {
    this.fullGcDays = fullGcDays;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties = (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties) o;
    return Objects.equals(this.fullGcDays, comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.fullGcDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullGcDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties {\n");
    sb.append("    fullGcDays: ").append(toIndentedString(fullGcDays)).append("\n");
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

