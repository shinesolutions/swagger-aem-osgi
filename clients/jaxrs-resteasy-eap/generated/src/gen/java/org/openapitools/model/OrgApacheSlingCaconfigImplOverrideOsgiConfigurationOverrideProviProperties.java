package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties   {
  

  private ConfigNodePropertyString description = null;

  private ConfigNodePropertyArray overrides = null;

  private ConfigNodePropertyBoolean enabled = null;

  private ConfigNodePropertyInteger serviceRanking = null;

  /**
   **/
  
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
    return Objects.equals(description, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.description) &&
        Objects.equals(overrides, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.overrides) &&
        Objects.equals(enabled, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.enabled) &&
        Objects.equals(serviceRanking, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.serviceRanking);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

