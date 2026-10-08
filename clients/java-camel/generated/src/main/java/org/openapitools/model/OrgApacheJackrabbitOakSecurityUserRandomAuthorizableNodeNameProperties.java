package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {

  private ConfigNodePropertyInteger length;

  public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties length(ConfigNodePropertyInteger length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
   */
  @Valid 
  @Schema(name = "length", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("length")
  public ConfigNodePropertyInteger getLength() {
    return length;
  }

  public void setLength(ConfigNodePropertyInteger length) {
    this.length = length;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties = (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties) o;
    return Objects.equals(this.length, orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

