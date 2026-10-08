package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheFelixSystemreadyImplServicesCheckProperties
 */

@JsonTypeName("orgApacheFelixSystemreadyImplServicesCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixSystemreadyImplServicesCheckProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray servicesList;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown type;

  public OrgApacheFelixSystemreadyImplServicesCheckProperties servicesList(@Nullable ConfigNodePropertyArray servicesList) {
    this.servicesList = servicesList;
    return this;
  }

  /**
   * Get servicesList
   * @return servicesList
   */
  @Valid 
  @Schema(name = "services.list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("services.list")
  public @Nullable ConfigNodePropertyArray getServicesList() {
    return servicesList;
  }

  @JsonProperty("services.list")
  public void setServicesList(@Nullable ConfigNodePropertyArray servicesList) {
    this.servicesList = servicesList;
  }

  public OrgApacheFelixSystemreadyImplServicesCheckProperties type(@Nullable ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable ConfigNodePropertyDropDown getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable ConfigNodePropertyDropDown type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixSystemreadyImplServicesCheckProperties orgApacheFelixSystemreadyImplServicesCheckProperties = (OrgApacheFelixSystemreadyImplServicesCheckProperties) o;
    return Objects.equals(this.servicesList, orgApacheFelixSystemreadyImplServicesCheckProperties.servicesList) &&
        Objects.equals(this.type, orgApacheFelixSystemreadyImplServicesCheckProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicesList, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadyImplServicesCheckProperties {\n");
    sb.append("    servicesList: ").append(toIndentedString(servicesList)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

