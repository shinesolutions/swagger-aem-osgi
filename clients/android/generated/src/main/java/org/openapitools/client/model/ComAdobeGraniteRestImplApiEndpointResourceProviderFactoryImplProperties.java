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
public class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties {
  
  @SerializedName("provider.roots")
  private ConfigNodePropertyString providerRoots = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getProviderRoots() {
    return providerRoots;
  }
  public void setProviderRoots(ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties = (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties) o;
    return (this.providerRoots == null ? comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.providerRoots == null : this.providerRoots.equals(comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.providerRoots));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.providerRoots == null ? 0: this.providerRoots.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties {\n");
    
    sb.append("  providerRoots: ").append(providerRoots).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}