package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled;

  @JsonProperty("configRefResourceNames")
  private ConfigNodePropertyArray configRefResourceNames;

  @JsonProperty("configRefPropertyNames")
  private ConfigNodePropertyArray configRefPropertyNames;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking;

  /**
   * 
   * @return enabled
   */
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   * 
   * @return configRefResourceNames
   */
  public ConfigNodePropertyArray getConfigRefResourceNames() {
    return configRefResourceNames;
  }

  public void setConfigRefResourceNames(ConfigNodePropertyArray configRefResourceNames) {
    this.configRefResourceNames = configRefResourceNames;
  }

  /**
   * 
   * @return configRefPropertyNames
   */
  public ConfigNodePropertyArray getConfigRefPropertyNames() {
    return configRefPropertyNames;
  }

  public void setConfigRefPropertyNames(ConfigNodePropertyArray configRefPropertyNames) {
    this.configRefPropertyNames = configRefPropertyNames;
  }

  /**
   * 
   * @return serviceRanking
   */
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
    return Objects.equals(this.enabled, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.enabled) &&
        Objects.equals(this.configRefResourceNames, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.configRefResourceNames) &&
        Objects.equals(this.configRefPropertyNames, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.configRefPropertyNames) &&
        Objects.equals(this.serviceRanking, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.serviceRanking);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
