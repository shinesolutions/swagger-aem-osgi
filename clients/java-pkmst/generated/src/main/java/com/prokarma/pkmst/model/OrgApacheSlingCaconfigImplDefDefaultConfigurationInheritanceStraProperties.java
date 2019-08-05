package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties   {
  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("configPropertyInheritancePropertyNames")
  private ConfigNodePropertyArray configPropertyInheritancePropertyNames = null;

  public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties configPropertyInheritancePropertyNames(ConfigNodePropertyArray configPropertyInheritancePropertyNames) {
    this.configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
    return this;
  }

   /**
   * Get configPropertyInheritancePropertyNames
   * @return configPropertyInheritancePropertyNames
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getConfigPropertyInheritancePropertyNames() {
    return configPropertyInheritancePropertyNames;
  }

  public void setConfigPropertyInheritancePropertyNames(ConfigNodePropertyArray configPropertyInheritancePropertyNames) {
    this.configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

