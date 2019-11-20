/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties {
  
  @SerializedName("name")
  private ConfigNodePropertyString name = null;
  @SerializedName("serviceName")
  private ConfigNodePropertyString serviceName = null;
  @SerializedName("userId")
  private ConfigNodePropertyString userId = null;
  @SerializedName("accessTokenProvider.target")
  private ConfigNodePropertyString accessTokenProviderTarget = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUserId() {
    return userId;
  }
  public void setUserId(ConfigNodePropertyString userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAccessTokenProviderTarget() {
    return accessTokenProviderTarget;
  }
  public void setAccessTokenProviderTarget(ConfigNodePropertyString accessTokenProviderTarget) {
    this.accessTokenProviderTarget = accessTokenProviderTarget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties = (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties) o;
    return (this.name == null ? comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.name == null : this.name.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.name)) &&
        (this.serviceName == null ? comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.serviceName == null : this.serviceName.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.serviceName)) &&
        (this.userId == null ? comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.userId == null : this.userId.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.userId)) &&
        (this.accessTokenProviderTarget == null ? comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.accessTokenProviderTarget == null : this.accessTokenProviderTarget.equals(comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.accessTokenProviderTarget));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.serviceName == null ? 0: this.serviceName.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.accessTokenProviderTarget == null ? 0: this.accessTokenProviderTarget.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  serviceName: ").append(serviceName).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  accessTokenProviderTarget: ").append(accessTokenProviderTarget).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}