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
 * OrgApacheFelixSystemreadyImplComponentsCheckProperties
 */

@JsonTypeName("orgApacheFelixSystemreadyImplComponentsCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixSystemreadyImplComponentsCheckProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray componentsList;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown type;

  public OrgApacheFelixSystemreadyImplComponentsCheckProperties componentsList(@Nullable ConfigNodePropertyArray componentsList) {
    this.componentsList = componentsList;
    return this;
  }

  /**
   * Get componentsList
   * @return componentsList
   */
  @Valid 
  @Schema(name = "components.list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("components.list")
  public @Nullable ConfigNodePropertyArray getComponentsList() {
    return componentsList;
  }

  @JsonProperty("components.list")
  public void setComponentsList(@Nullable ConfigNodePropertyArray componentsList) {
    this.componentsList = componentsList;
  }

  public OrgApacheFelixSystemreadyImplComponentsCheckProperties type(@Nullable ConfigNodePropertyDropDown type) {
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
    OrgApacheFelixSystemreadyImplComponentsCheckProperties orgApacheFelixSystemreadyImplComponentsCheckProperties = (OrgApacheFelixSystemreadyImplComponentsCheckProperties) o;
    return Objects.equals(this.componentsList, orgApacheFelixSystemreadyImplComponentsCheckProperties.componentsList) &&
        Objects.equals(this.type, orgApacheFelixSystemreadyImplComponentsCheckProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentsList, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadyImplComponentsCheckProperties {\n");
    sb.append("    componentsList: ").append(toIndentedString(componentsList)).append("\n");
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

