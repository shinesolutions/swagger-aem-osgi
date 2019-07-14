/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private ConfigNodePropertyBoolean enabled = null;

  public static final String SERIALIZED_NAME_CONFIG_PATH = "configPath";
  @SerializedName(SERIALIZED_NAME_CONFIG_PATH)
  private ConfigNodePropertyString configPath = null;

  public static final String SERIALIZED_NAME_FALLBACK_PATHS = "fallbackPaths";
  @SerializedName(SERIALIZED_NAME_FALLBACK_PATHS)
  private ConfigNodePropertyArray fallbackPaths = null;

  public static final String SERIALIZED_NAME_CONFIG_COLLECTION_INHERITANCE_PROPERTY_NAMES = "configCollectionInheritancePropertyNames";
  @SerializedName(SERIALIZED_NAME_CONFIG_COLLECTION_INHERITANCE_PROPERTY_NAMES)
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

