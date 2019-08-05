package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties   {
  
  private ConfigNodePropertyArray userMapping = null;
  private ConfigNodePropertyString userDefault = null;
  private ConfigNodePropertyBoolean userEnableDefaultMapping = null;
  private ConfigNodePropertyBoolean requireValidation = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("user.mapping")
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
  public ConfigNodePropertyBoolean getRequireValidation() {
    return requireValidation;
  }
  public void setRequireValidation(ConfigNodePropertyBoolean requireValidation) {
    this.requireValidation = requireValidation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

