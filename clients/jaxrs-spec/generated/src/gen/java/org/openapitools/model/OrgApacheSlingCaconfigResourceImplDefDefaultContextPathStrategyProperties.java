package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties   {
  
  private @Valid ConfigNodePropertyBoolean enabled = null;
  private @Valid ConfigNodePropertyArray configRefResourceNames = null;
  private @Valid ConfigNodePropertyArray configRefPropertyNames = null;
  private @Valid ConfigNodePropertyInteger serviceRanking = null;

  /**
   **/
  public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties enabled(ConfigNodePropertyBoolean enabled) {
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
  public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties configRefResourceNames(ConfigNodePropertyArray configRefResourceNames) {
    this.configRefResourceNames = configRefResourceNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configRefResourceNames")
  public ConfigNodePropertyArray getConfigRefResourceNames() {
    return configRefResourceNames;
  }
  public void setConfigRefResourceNames(ConfigNodePropertyArray configRefResourceNames) {
    this.configRefResourceNames = configRefResourceNames;
  }

  /**
   **/
  public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties configRefPropertyNames(ConfigNodePropertyArray configRefPropertyNames) {
    this.configRefPropertyNames = configRefPropertyNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configRefPropertyNames")
  public ConfigNodePropertyArray getConfigRefPropertyNames() {
    return configRefPropertyNames;
  }
  public void setConfigRefPropertyNames(ConfigNodePropertyArray configRefPropertyNames) {
    this.configRefPropertyNames = configRefPropertyNames;
  }

  /**
   **/
  public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

