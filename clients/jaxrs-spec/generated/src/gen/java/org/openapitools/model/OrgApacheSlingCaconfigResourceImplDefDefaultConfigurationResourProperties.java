package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties   {
  
  private @Valid ConfigNodePropertyBoolean enabled = null;
  private @Valid ConfigNodePropertyString configPath = null;
  private @Valid ConfigNodePropertyArray fallbackPaths = null;
  private @Valid ConfigNodePropertyArray configCollectionInheritancePropertyNames = null;

  /**
   **/
  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties enabled(ConfigNodePropertyBoolean enabled) {
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
  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties configPath(ConfigNodePropertyString configPath) {
    this.configPath = configPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configPath")
  public ConfigNodePropertyString getConfigPath() {
    return configPath;
  }
  public void setConfigPath(ConfigNodePropertyString configPath) {
    this.configPath = configPath;
  }

  /**
   **/
  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties fallbackPaths(ConfigNodePropertyArray fallbackPaths) {
    this.fallbackPaths = fallbackPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fallbackPaths")
  public ConfigNodePropertyArray getFallbackPaths() {
    return fallbackPaths;
  }
  public void setFallbackPaths(ConfigNodePropertyArray fallbackPaths) {
    this.fallbackPaths = fallbackPaths;
  }

  /**
   **/
  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties configCollectionInheritancePropertyNames(ConfigNodePropertyArray configCollectionInheritancePropertyNames) {
    this.configCollectionInheritancePropertyNames = configCollectionInheritancePropertyNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configCollectionInheritancePropertyNames")
  public ConfigNodePropertyArray getConfigCollectionInheritancePropertyNames() {
    return configCollectionInheritancePropertyNames;
  }
  public void setConfigCollectionInheritancePropertyNames(ConfigNodePropertyArray configCollectionInheritancePropertyNames) {
    this.configCollectionInheritancePropertyNames = configCollectionInheritancePropertyNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties = (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties) o;
    return Objects.equals(enabled, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.enabled) &&
        Objects.equals(configPath, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.configPath) &&
        Objects.equals(fallbackPaths, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.fallbackPaths) &&
        Objects.equals(configCollectionInheritancePropertyNames, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.configCollectionInheritancePropertyNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, configPath, fallbackPaths, configCollectionInheritancePropertyNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    configPath: ").append(toIndentedString(configPath)).append("\n");
    sb.append("    fallbackPaths: ").append(toIndentedString(fallbackPaths)).append("\n");
    sb.append("    configCollectionInheritancePropertyNames: ").append(toIndentedString(configCollectionInheritancePropertyNames)).append("\n");
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

