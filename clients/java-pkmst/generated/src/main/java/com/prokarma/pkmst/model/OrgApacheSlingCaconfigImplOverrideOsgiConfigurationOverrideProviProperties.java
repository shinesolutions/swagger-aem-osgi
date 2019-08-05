package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties   {
  @JsonProperty("description")
  private ConfigNodePropertyString description = null;

  @JsonProperty("overrides")
  private ConfigNodePropertyArray overrides = null;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties description(ConfigNodePropertyString description) {
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

  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties overrides(ConfigNodePropertyArray overrides) {
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

  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties enabled(ConfigNodePropertyBoolean enabled) {
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

  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

