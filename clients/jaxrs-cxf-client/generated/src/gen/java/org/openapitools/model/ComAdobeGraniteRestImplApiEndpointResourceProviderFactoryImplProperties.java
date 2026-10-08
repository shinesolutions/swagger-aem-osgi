package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString providerRoots;
 /**
   * Get providerRoots
   * @return providerRoots
  **/
  @JsonProperty("provider.roots")
  public ConfigNodePropertyString getProviderRoots() {
    return providerRoots;
  }

  public void setProviderRoots(ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
  }

  public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties providerRoots(ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
    return this;
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
    return Objects.equals(this.providerRoots, comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.providerRoots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerRoots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties {\n");
    
    sb.append("    providerRoots: ").append(toIndentedString(providerRoots)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

