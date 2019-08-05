package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray configPropertyInheritancePropertyNames = null;
 /**
   * Get enabled
   * @return enabled
  **/
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
   * Get configPropertyInheritancePropertyNames
   * @return configPropertyInheritancePropertyNames
  **/
  @JsonProperty("configPropertyInheritancePropertyNames")
  public ConfigNodePropertyArray getConfigPropertyInheritancePropertyNames() {
    return configPropertyInheritancePropertyNames;
  }

  public void setConfigPropertyInheritancePropertyNames(ConfigNodePropertyArray configPropertyInheritancePropertyNames) {
    this.configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
  }

  public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties configPropertyInheritancePropertyNames(ConfigNodePropertyArray configPropertyInheritancePropertyNames) {
    this.configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    configPropertyInheritancePropertyNames: ").append(toIndentedString(configPropertyInheritancePropertyNames)).append("\n");
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

