package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeAemTransactionCoreImplTransactionRecorderProperties
 */

@JsonTypeName("comAdobeAemTransactionCoreImplTransactionRecorderProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeAemTransactionCoreImplTransactionRecorderProperties {

  private ConfigNodePropertyBoolean isTransactionRecordingEnabled;

  public ComAdobeAemTransactionCoreImplTransactionRecorderProperties isTransactionRecordingEnabled(ConfigNodePropertyBoolean isTransactionRecordingEnabled) {
    this.isTransactionRecordingEnabled = isTransactionRecordingEnabled;
    return this;
  }

  /**
   * Get isTransactionRecordingEnabled
   * @return isTransactionRecordingEnabled
   */
  @Valid 
  @Schema(name = "isTransactionRecordingEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isTransactionRecordingEnabled")
  public ConfigNodePropertyBoolean getIsTransactionRecordingEnabled() {
    return isTransactionRecordingEnabled;
  }

  public void setIsTransactionRecordingEnabled(ConfigNodePropertyBoolean isTransactionRecordingEnabled) {
    this.isTransactionRecordingEnabled = isTransactionRecordingEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemTransactionCoreImplTransactionRecorderProperties comAdobeAemTransactionCoreImplTransactionRecorderProperties = (ComAdobeAemTransactionCoreImplTransactionRecorderProperties) o;
    return Objects.equals(this.isTransactionRecordingEnabled, comAdobeAemTransactionCoreImplTransactionRecorderProperties.isTransactionRecordingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTransactionRecordingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemTransactionCoreImplTransactionRecorderProperties {\n");
    sb.append("    isTransactionRecordingEnabled: ").append(toIndentedString(isTransactionRecordingEnabled)).append("\n");
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

