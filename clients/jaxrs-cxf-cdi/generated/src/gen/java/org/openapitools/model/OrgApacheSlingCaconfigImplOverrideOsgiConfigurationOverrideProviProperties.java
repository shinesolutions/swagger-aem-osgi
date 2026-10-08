package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties   {
  
  private ConfigNodePropertyString description;

  private ConfigNodePropertyArray overrides;

  private ConfigNodePropertyBoolean enabled;

  private ConfigNodePropertyInteger serviceRanking;

  /**
   **/
  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties description(ConfigNodePropertyString description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public ConfigNodePropertyString getDescription() {
    return description;
  }
  public void setDescription(ConfigNodePropertyString description) {
    this.description = description;
  }


  /**
   **/
  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties overrides(ConfigNodePropertyArray overrides) {
    this.overrides = overrides;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("overrides")
  public ConfigNodePropertyArray getOverrides() {
    return overrides;
  }
  public void setOverrides(ConfigNodePropertyArray overrides) {
    this.overrides = overrides;
  }


  /**
   **/
  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties enabled(ConfigNodePropertyBoolean enabled) {
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
  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties = (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties) o;
    return Objects.equals(this.description, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.description) &&
        Objects.equals(this.overrides, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.overrides) &&
        Objects.equals(this.enabled, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.enabled) &&
        Objects.equals(this.serviceRanking, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.serviceRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, overrides, enabled, serviceRanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

