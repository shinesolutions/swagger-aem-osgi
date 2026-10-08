package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString providerRoot;
 /**
   * Get providerRoot
   * @return providerRoot
  **/
  @JsonProperty("provider.root")
  public ConfigNodePropertyString getProviderRoot() {
    return providerRoot;
  }

  public void setProviderRoot(ConfigNodePropertyString providerRoot) {
    this.providerRoot = providerRoot;
  }

  public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties providerRoot(ConfigNodePropertyString providerRoot) {
    this.providerRoot = providerRoot;
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
    ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties comAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties = (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties) o;
    return Objects.equals(this.providerRoot, comAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.providerRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerRoot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties {\n");
    
    sb.append("    providerRoot: ").append(toIndentedString(providerRoot)).append("\n");
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

