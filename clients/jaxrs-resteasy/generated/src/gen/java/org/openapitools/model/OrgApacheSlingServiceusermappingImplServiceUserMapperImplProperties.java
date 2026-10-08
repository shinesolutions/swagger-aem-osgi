package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties   {
  
  private ConfigNodePropertyArray userMapping;
  private ConfigNodePropertyString userDefault;
  private ConfigNodePropertyBoolean userEnableDefaultMapping;
  private ConfigNodePropertyBoolean requireValidation;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("user.mapping")
  @Valid
  public ConfigNodePropertyArray getUserMapping() {
    return userMapping;
  }
  public void setUserMapping(ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("user.default")
  @Valid
  public ConfigNodePropertyString getUserDefault() {
    return userDefault;
  }
  public void setUserDefault(ConfigNodePropertyString userDefault) {
    this.userDefault = userDefault;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("user.enable.default.mapping")
  @Valid
  public ConfigNodePropertyBoolean getUserEnableDefaultMapping() {
    return userEnableDefaultMapping;
  }
  public void setUserEnableDefaultMapping(ConfigNodePropertyBoolean userEnableDefaultMapping) {
    this.userEnableDefaultMapping = userEnableDefaultMapping;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("require.validation")
  @Valid
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

