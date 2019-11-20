package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties   {
  
  private ConfigNodePropertyBoolean enabled = null;

  private ConfigNodePropertyArray fallbackPaths = null;


  /**
   **/
  public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties enabled(ConfigNodePropertyBoolean enabled) {
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
  public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties fallbackPaths(ConfigNodePropertyArray fallbackPaths) {
    this.fallbackPaths = fallbackPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fallbackPaths")
  public ConfigNodePropertyArray getFallbackPaths() {
    return fallbackPaths;
  }
  public void setFallbackPaths(ConfigNodePropertyArray fallbackPaths) {
    this.fallbackPaths = fallbackPaths;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties = (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties) o;
    return Objects.equals(enabled, comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.enabled) &&
        Objects.equals(fallbackPaths, comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.fallbackPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, fallbackPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fallbackPaths: ").append(toIndentedString(fallbackPaths)).append("\n");
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
