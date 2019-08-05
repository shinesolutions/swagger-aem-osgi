package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties   {
  
  private ConfigNodePropertyBoolean enabled = null;
  private ConfigNodePropertyArray configRefResourceNames = null;
  private ConfigNodePropertyArray configRefPropertyNames = null;
  private ConfigNodePropertyInteger serviceRanking = null;

  public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties () {

  }

  public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties (ConfigNodePropertyBoolean enabled, ConfigNodePropertyArray configRefResourceNames, ConfigNodePropertyArray configRefPropertyNames, ConfigNodePropertyInteger serviceRanking) {
    this.enabled = enabled;
    this.configRefResourceNames = configRefResourceNames;
    this.configRefPropertyNames = configRefPropertyNames;
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

    
  @JsonProperty("configRefResourceNames")
  public ConfigNodePropertyArray getConfigRefResourceNames() {
    return configRefResourceNames;
  }
  public void setConfigRefResourceNames(ConfigNodePropertyArray configRefResourceNames) {
    this.configRefResourceNames = configRefResourceNames;
  }

    
  @JsonProperty("configRefPropertyNames")
  public ConfigNodePropertyArray getConfigRefPropertyNames() {
    return configRefPropertyNames;
  }
  public void setConfigRefPropertyNames(ConfigNodePropertyArray configRefPropertyNames) {
    this.configRefPropertyNames = configRefPropertyNames;
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
    OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties = (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties) o;
    return Objects.equals(enabled, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.enabled) &&
        Objects.equals(configRefResourceNames, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.configRefResourceNames) &&
        Objects.equals(configRefPropertyNames, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.configRefPropertyNames) &&
        Objects.equals(serviceRanking, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.serviceRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, configRefResourceNames, configRefPropertyNames, serviceRanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    configRefResourceNames: ").append(toIndentedString(configRefResourceNames)).append("\n");
    sb.append("    configRefPropertyNames: ").append(toIndentedString(configRefPropertyNames)).append("\n");
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
