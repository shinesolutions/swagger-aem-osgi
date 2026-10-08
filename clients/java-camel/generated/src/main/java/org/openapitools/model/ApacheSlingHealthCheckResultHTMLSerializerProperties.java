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
 * ApacheSlingHealthCheckResultHTMLSerializerProperties
 */

@JsonTypeName("apacheSlingHealthCheckResultHTMLSerializerProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ApacheSlingHealthCheckResultHTMLSerializerProperties {

  private ConfigNodePropertyString styleString;

  public ApacheSlingHealthCheckResultHTMLSerializerProperties styleString(ConfigNodePropertyString styleString) {
    this.styleString = styleString;
    return this;
  }

  /**
   * Get styleString
   * @return styleString
   */
  @Valid 
  @Schema(name = "styleString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("styleString")
  public ConfigNodePropertyString getStyleString() {
    return styleString;
  }

  public void setStyleString(ConfigNodePropertyString styleString) {
    this.styleString = styleString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApacheSlingHealthCheckResultHTMLSerializerProperties apacheSlingHealthCheckResultHTMLSerializerProperties = (ApacheSlingHealthCheckResultHTMLSerializerProperties) o;
    return Objects.equals(this.styleString, apacheSlingHealthCheckResultHTMLSerializerProperties.styleString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(styleString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApacheSlingHealthCheckResultHTMLSerializerProperties {\n");
    sb.append("    styleString: ").append(toIndentedString(styleString)).append("\n");
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

