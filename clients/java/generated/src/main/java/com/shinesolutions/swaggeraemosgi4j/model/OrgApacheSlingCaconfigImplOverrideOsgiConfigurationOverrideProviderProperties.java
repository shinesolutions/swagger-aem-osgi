/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private ConfigNodePropertyString description = null;

  public static final String SERIALIZED_NAME_OVERRIDES = "overrides";
  @SerializedName(SERIALIZED_NAME_OVERRIDES)
  private ConfigNodePropertyArray overrides = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private ConfigNodePropertyBoolean enabled = null;

  public static final String SERIALIZED_NAME_SERVICE_RANKING = "service.ranking";
  @SerializedName(SERIALIZED_NAME_SERVICE_RANKING)
  private ConfigNodePropertyInteger serviceRanking = null;

  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties description(ConfigNodePropertyString description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDescription() {
    return description;
  }

  public void setDescription(ConfigNodePropertyString description) {
    this.description = description;
  }

  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties overrides(ConfigNodePropertyArray overrides) {
    this.overrides = overrides;
    return this;
  }

   /**
   * Get overrides
   * @return overrides
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getOverrides() {
    return overrides;
  }

  public void setOverrides(ConfigNodePropertyArray overrides) {
    this.overrides = overrides;
  }

  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties enabled(ConfigNodePropertyBoolean enabled) {
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

  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties = (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties) o;
    return Objects.equals(this.description, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties.description) &&
        Objects.equals(this.overrides, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties.overrides) &&
        Objects.equals(this.enabled, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties.enabled) &&
        Objects.equals(this.serviceRanking, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties.serviceRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, overrides, enabled, serviceRanking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviderProperties {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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

