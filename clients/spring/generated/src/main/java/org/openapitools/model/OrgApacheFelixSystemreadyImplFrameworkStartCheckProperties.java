package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties
 */

@JsonTypeName("orgApacheFelixSystemreadyImplFrameworkStartCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger timeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger targetStartLevel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString targetStartLevelPropName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown type;

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties timeout(@Nullable ConfigNodePropertyInteger timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Get timeout
   * @return timeout
   */
  @Valid 
  @Schema(name = "timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeout")
  public @Nullable ConfigNodePropertyInteger getTimeout() {
    return timeout;
  }

  @JsonProperty("timeout")
  public void setTimeout(@Nullable ConfigNodePropertyInteger timeout) {
    this.timeout = timeout;
  }

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties targetStartLevel(@Nullable ConfigNodePropertyInteger targetStartLevel) {
    this.targetStartLevel = targetStartLevel;
    return this;
  }

  /**
   * Get targetStartLevel
   * @return targetStartLevel
   */
  @Valid 
  @Schema(name = "target.start.level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target.start.level")
  public @Nullable ConfigNodePropertyInteger getTargetStartLevel() {
    return targetStartLevel;
  }

  @JsonProperty("target.start.level")
  public void setTargetStartLevel(@Nullable ConfigNodePropertyInteger targetStartLevel) {
    this.targetStartLevel = targetStartLevel;
  }

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties targetStartLevelPropName(@Nullable ConfigNodePropertyString targetStartLevelPropName) {
    this.targetStartLevelPropName = targetStartLevelPropName;
    return this;
  }

  /**
   * Get targetStartLevelPropName
   * @return targetStartLevelPropName
   */
  @Valid 
  @Schema(name = "target.start.level.prop.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target.start.level.prop.name")
  public @Nullable ConfigNodePropertyString getTargetStartLevelPropName() {
    return targetStartLevelPropName;
  }

  @JsonProperty("target.start.level.prop.name")
  public void setTargetStartLevelPropName(@Nullable ConfigNodePropertyString targetStartLevelPropName) {
    this.targetStartLevelPropName = targetStartLevelPropName;
  }

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties type(@Nullable ConfigNodePropertyDropDown type) {
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
    OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties orgApacheFelixSystemreadyImplFrameworkStartCheckProperties = (OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties) o;
    return Objects.equals(this.timeout, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.timeout) &&
        Objects.equals(this.targetStartLevel, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.targetStartLevel) &&
        Objects.equals(this.targetStartLevelPropName, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.targetStartLevelPropName) &&
        Objects.equals(this.type, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeout, targetStartLevel, targetStartLevelPropName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties {\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    targetStartLevel: ").append(toIndentedString(targetStartLevel)).append("\n");
    sb.append("    targetStartLevelPropName: ").append(toIndentedString(targetStartLevelPropName)).append("\n");
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

