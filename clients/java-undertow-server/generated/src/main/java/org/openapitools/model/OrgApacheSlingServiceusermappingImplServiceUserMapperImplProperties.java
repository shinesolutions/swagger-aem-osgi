/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties   {
  
  private ConfigNodePropertyArray userMapping;
  private ConfigNodePropertyString userDefault;
  private ConfigNodePropertyBoolean userEnableDefaultMapping;
  private ConfigNodePropertyBoolean requireValidation;

  /**
   */
  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties userMapping(ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.mapping")
  public ConfigNodePropertyArray getUserMapping() {
    return userMapping;
  }
  public void setUserMapping(ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
  }

  /**
   */
  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties userDefault(ConfigNodePropertyString userDefault) {
    this.userDefault = userDefault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.default")
  public ConfigNodePropertyString getUserDefault() {
    return userDefault;
  }
  public void setUserDefault(ConfigNodePropertyString userDefault) {
    this.userDefault = userDefault;
  }

  /**
   */
  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties userEnableDefaultMapping(ConfigNodePropertyBoolean userEnableDefaultMapping) {
    this.userEnableDefaultMapping = userEnableDefaultMapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.enable.default.mapping")
  public ConfigNodePropertyBoolean getUserEnableDefaultMapping() {
    return userEnableDefaultMapping;
  }
  public void setUserEnableDefaultMapping(ConfigNodePropertyBoolean userEnableDefaultMapping) {
    this.userEnableDefaultMapping = userEnableDefaultMapping;
  }

  /**
   */
  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties requireValidation(ConfigNodePropertyBoolean requireValidation) {
    this.requireValidation = requireValidation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("require.validation")
  public ConfigNodePropertyBoolean getRequireValidation() {
    return requireValidation;
  }
  public void setRequireValidation(ConfigNodePropertyBoolean requireValidation) {
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
    return Objects.equals(userMapping, orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.userMapping) &&
        Objects.equals(userDefault, orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.userDefault) &&
        Objects.equals(userEnableDefaultMapping, orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.userEnableDefaultMapping) &&
        Objects.equals(requireValidation, orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.requireValidation);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

