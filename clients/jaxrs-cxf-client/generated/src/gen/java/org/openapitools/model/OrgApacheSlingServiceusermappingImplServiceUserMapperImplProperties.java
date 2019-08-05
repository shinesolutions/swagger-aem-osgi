package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray userMapping = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString userDefault = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean userEnableDefaultMapping = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean requireValidation = null;
 /**
   * Get userMapping
   * @return userMapping
  **/
  @JsonProperty("user.mapping")
  public ConfigNodePropertyArray getUserMapping() {
    return userMapping;
  }

  public void setUserMapping(ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
  }

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties userMapping(ConfigNodePropertyArray userMapping) {
    this.userMapping = userMapping;
    return this;
  }

 /**
   * Get userDefault
   * @return userDefault
  **/
  @JsonProperty("user.default")
  public ConfigNodePropertyString getUserDefault() {
    return userDefault;
  }

  public void setUserDefault(ConfigNodePropertyString userDefault) {
    this.userDefault = userDefault;
  }

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties userDefault(ConfigNodePropertyString userDefault) {
    this.userDefault = userDefault;
    return this;
  }

 /**
   * Get userEnableDefaultMapping
   * @return userEnableDefaultMapping
  **/
  @JsonProperty("user.enable.default.mapping")
  public ConfigNodePropertyBoolean getUserEnableDefaultMapping() {
    return userEnableDefaultMapping;
  }

  public void setUserEnableDefaultMapping(ConfigNodePropertyBoolean userEnableDefaultMapping) {
    this.userEnableDefaultMapping = userEnableDefaultMapping;
  }

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties userEnableDefaultMapping(ConfigNodePropertyBoolean userEnableDefaultMapping) {
    this.userEnableDefaultMapping = userEnableDefaultMapping;
    return this;
  }

 /**
   * Get requireValidation
   * @return requireValidation
  **/
  @JsonProperty("require.validation")
  public ConfigNodePropertyBoolean getRequireValidation() {
    return requireValidation;
  }

  public void setRequireValidation(ConfigNodePropertyBoolean requireValidation) {
    this.requireValidation = requireValidation;
  }

  public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties requireValidation(ConfigNodePropertyBoolean requireValidation) {
    this.requireValidation = requireValidation;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

