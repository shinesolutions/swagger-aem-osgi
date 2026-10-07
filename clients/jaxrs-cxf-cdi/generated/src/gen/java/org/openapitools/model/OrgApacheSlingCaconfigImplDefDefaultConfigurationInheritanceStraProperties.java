package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties   {
  
  private ConfigNodePropertyBoolean enabled;

  private ConfigNodePropertyArray configPropertyInheritancePropertyNames;

  /**
   **/
  public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  /**
   **/
  public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties configPropertyInheritancePropertyNames(ConfigNodePropertyArray configPropertyInheritancePropertyNames) {
    this.configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configPropertyInheritancePropertyNames")
  public ConfigNodePropertyArray getConfigPropertyInheritancePropertyNames() {
    return configPropertyInheritancePropertyNames;
  }
  public void setConfigPropertyInheritancePropertyNames(ConfigNodePropertyArray configPropertyInheritancePropertyNames) {
    this.configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties = (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties) o;
    return Objects.equals(this.enabled, orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.enabled) &&
        Objects.equals(this.configPropertyInheritancePropertyNames, orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.configPropertyInheritancePropertyNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, configPropertyInheritancePropertyNames);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

