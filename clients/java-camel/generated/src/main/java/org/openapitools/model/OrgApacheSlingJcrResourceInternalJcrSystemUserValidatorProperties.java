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
 * OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties
 */

@JsonTypeName("orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties {

  private ConfigNodePropertyBoolean allowOnlySystemUser;

  public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties allowOnlySystemUser(ConfigNodePropertyBoolean allowOnlySystemUser) {
    this.allowOnlySystemUser = allowOnlySystemUser;
    return this;
  }

  /**
   * Get allowOnlySystemUser
   * @return allowOnlySystemUser
   */
  @Valid 
  @Schema(name = "allow.only.system.user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow.only.system.user")
  public ConfigNodePropertyBoolean getAllowOnlySystemUser() {
    return allowOnlySystemUser;
  }

  public void setAllowOnlySystemUser(ConfigNodePropertyBoolean allowOnlySystemUser) {
    this.allowOnlySystemUser = allowOnlySystemUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties = (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties) o;
    return Objects.equals(this.allowOnlySystemUser, orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.allowOnlySystemUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOnlySystemUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties {\n");
    sb.append("    allowOnlySystemUser: ").append(toIndentedString(allowOnlySystemUser)).append("\n");
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

