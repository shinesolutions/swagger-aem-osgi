/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties   {
  
  private ConfigNodePropertyBoolean enabled;
  private ConfigNodePropertyArray configRefResourceNames;
  private ConfigNodePropertyArray configRefPropertyNames;
  private ConfigNodePropertyInteger serviceRanking;

  /**
   */
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
   */
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
   */
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
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

