package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties   {
  
  private ConfigNodePropertyString description = null;
  private ConfigNodePropertyArray overrides = null;
  private ConfigNodePropertyBoolean enabled = null;
  private ConfigNodePropertyInteger serviceRanking = null;

  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties () {

  }

  public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties (ConfigNodePropertyString description, ConfigNodePropertyArray overrides, ConfigNodePropertyBoolean enabled, ConfigNodePropertyInteger serviceRanking) {
    this.description = description;
    this.overrides = overrides;
    this.enabled = enabled;
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("description")
  public ConfigNodePropertyString getDescription() {
    return description;
  }
  public void setDescription(ConfigNodePropertyString description) {
    this.description = description;
  }

    
  @JsonProperty("overrides")
  public ConfigNodePropertyArray getOverrides() {
    return overrides;
  }
  public void setOverrides(ConfigNodePropertyArray overrides) {
    this.overrides = overrides;
  }

    
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

    
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
