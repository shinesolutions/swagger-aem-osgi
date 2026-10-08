package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties   {
  
  private ConfigNodePropertyString providerRoot;

  /**
   **/
  public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties providerRoot(ConfigNodePropertyString providerRoot) {
    this.providerRoot = providerRoot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.root")
  public ConfigNodePropertyString getProviderRoot() {
    return providerRoot;
  }
  public void setProviderRoot(ConfigNodePropertyString providerRoot) {
    this.providerRoot = providerRoot;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

