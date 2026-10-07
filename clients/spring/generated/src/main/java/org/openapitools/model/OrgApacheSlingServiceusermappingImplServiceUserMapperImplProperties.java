package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties
 */

@JsonTypeName("orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray userMapping;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString userDefault;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean userEnableDefaultMapping;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean requireValidation;

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties userMapping(@Nullable ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
    return this;
  }

  /**
   * Get userMapping
   * @return userMapping
   */
  @Valid 
  @Schema(name = "user.mapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.mapping")
  public @Nullable ConfigNodePropertyArray getUserMapping() {
    return userMapping;
  }

  @JsonProperty("user.mapping")
  public void setUserMapping(@Nullable ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
  }

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties userDefault(@Nullable ConfigNodePropertyString userDefault) {
    this.userDefault = userDefault;
    return this;
  }

  /**
   * Get userDefault
   * @return userDefault
   */
  @Valid 
  @Schema(name = "user.default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.default")
  public @Nullable ConfigNodePropertyString getUserDefault() {
    return userDefault;
  }

  @JsonProperty("user.default")
  public void setUserDefault(@Nullable ConfigNodePropertyString userDefault) {
    this.userDefault = userDefault;
  }

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties userEnableDefaultMapping(@Nullable ConfigNodePropertyBoolean userEnableDefaultMapping) {
    this.userEnableDefaultMapping = userEnableDefaultMapping;
    return this;
  }

  /**
   * Get userEnableDefaultMapping
   * @return userEnableDefaultMapping
   */
  @Valid 
  @Schema(name = "user.enable.default.mapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.enable.default.mapping")
  public @Nullable ConfigNodePropertyBoolean getUserEnableDefaultMapping() {
    return userEnableDefaultMapping;
  }

  @JsonProperty("user.enable.default.mapping")
  public void setUserEnableDefaultMapping(@Nullable ConfigNodePropertyBoolean userEnableDefaultMapping) {
    this.userEnableDefaultMapping = userEnableDefaultMapping;
  }

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties requireValidation(@Nullable ConfigNodePropertyBoolean requireValidation) {
    this.requireValidation = requireValidation;
    return this;
  }

  /**
   * Get requireValidation
   * @return requireValidation
   */
  @Valid 
  @Schema(name = "require.validation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("require.validation")
  public @Nullable ConfigNodePropertyBoolean getRequireValidation() {
    return requireValidation;
  }

  @JsonProperty("require.validation")
  public void setRequireValidation(@Nullable ConfigNodePropertyBoolean requireValidation) {
    this.requireValidation = requireValidation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties = (OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties) o;
    return Objects.equals(this.userMapping, orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.userMapping) &&
        Objects.equals(this.userDefault, orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.userDefault) &&
        Objects.equals(this.userEnableDefaultMapping, orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.userEnableDefaultMapping) &&
        Objects.equals(this.requireValidation, orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.requireValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userMapping, userDefault, userEnableDefaultMapping, requireValidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties {\n");
    sb.append("    userMapping: ").append(toIndentedString(userMapping)).append("\n");
    sb.append("    userDefault: ").append(toIndentedString(userDefault)).append("\n");
    sb.append("    userEnableDefaultMapping: ").append(toIndentedString(userEnableDefaultMapping)).append("\n");
    sb.append("    requireValidation: ").append(toIndentedString(requireValidation)).append("\n");
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

