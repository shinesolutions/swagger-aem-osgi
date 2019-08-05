package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties   {
  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("configPath")
  private ConfigNodePropertyString configPath = null;

  @JsonProperty("fallbackPaths")
  private ConfigNodePropertyArray fallbackPaths = null;

  @JsonProperty("configCollectionInheritancePropertyNames")
  private ConfigNodePropertyArray configCollectionInheritancePropertyNames = null;

  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties configPath(ConfigNodePropertyString configPath) {
    this.configPath = configPath;
    return this;
  }

  /**
   * Get configPath
   * @return configPath
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getConfigPath() {
    return configPath;
  }

  public void setConfigPath(ConfigNodePropertyString configPath) {
    this.configPath = configPath;
  }

  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties fallbackPaths(ConfigNodePropertyArray fallbackPaths) {
    this.fallbackPaths = fallbackPaths;
    return this;
  }

  /**
   * Get fallbackPaths
   * @return fallbackPaths
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getFallbackPaths() {
    return fallbackPaths;
  }

  public void setFallbackPaths(ConfigNodePropertyArray fallbackPaths) {
    this.fallbackPaths = fallbackPaths;
  }

  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties configCollectionInheritancePropertyNames(ConfigNodePropertyArray configCollectionInheritancePropertyNames) {
    this.configCollectionInheritancePropertyNames = configCollectionInheritancePropertyNames;
    return this;
  }

  /**
   * Get configCollectionInheritancePropertyNames
   * @return configCollectionInheritancePropertyNames
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.enabled, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.enabled) &&
        Objects.equals(this.configPath, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.configPath) &&
        Objects.equals(this.fallbackPaths, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.fallbackPaths) &&
        Objects.equals(this.configCollectionInheritancePropertyNames, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.configCollectionInheritancePropertyNames);
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

