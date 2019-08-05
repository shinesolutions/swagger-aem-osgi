package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties   {
  
  private ConfigNodePropertyArray hcTags = null;

  private ConfigNodePropertyString dispatcherAddress = null;

  private ConfigNodePropertyArray dispatcherFilterAllowed = null;

  private ConfigNodePropertyArray dispatcherFilterBlocked = null;


  /**
   **/
  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }


  /**
   **/
  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties dispatcherAddress(ConfigNodePropertyString dispatcherAddress) {
    this.dispatcherAddress = dispatcherAddress;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dispatcher.address")
  public ConfigNodePropertyString getDispatcherAddress() {
    return dispatcherAddress;
  }
  public void setDispatcherAddress(ConfigNodePropertyString dispatcherAddress) {
    this.dispatcherAddress = dispatcherAddress;
  }


  /**
   **/
  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties dispatcherFilterAllowed(ConfigNodePropertyArray dispatcherFilterAllowed) {
    this.dispatcherFilterAllowed = dispatcherFilterAllowed;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dispatcher.filter.allowed")
  public ConfigNodePropertyArray getDispatcherFilterAllowed() {
    return dispatcherFilterAllowed;
  }
  public void setDispatcherFilterAllowed(ConfigNodePropertyArray dispatcherFilterAllowed) {
    this.dispatcherFilterAllowed = dispatcherFilterAllowed;
  }


  /**
   **/
  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties dispatcherFilterBlocked(ConfigNodePropertyArray dispatcherFilterBlocked) {
    this.dispatcherFilterBlocked = dispatcherFilterBlocked;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dispatcher.filter.blocked")
  public ConfigNodePropertyArray getDispatcherFilterBlocked() {
    return dispatcherFilterBlocked;
  }
  public void setDispatcherFilterBlocked(ConfigNodePropertyArray dispatcherFilterBlocked) {
    this.dispatcherFilterBlocked = dispatcherFilterBlocked;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties = (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties) o;
    return Objects.equals(hcTags, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.hcTags) &&
        Objects.equals(dispatcherAddress, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.dispatcherAddress) &&
        Objects.equals(dispatcherFilterAllowed, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.dispatcherFilterAllowed) &&
        Objects.equals(dispatcherFilterBlocked, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.dispatcherFilterBlocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, dispatcherAddress, dispatcherFilterAllowed, dispatcherFilterBlocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties {\n");
    
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    dispatcherAddress: ").append(toIndentedString(dispatcherAddress)).append("\n");
    sb.append("    dispatcherFilterAllowed: ").append(toIndentedString(dispatcherFilterAllowed)).append("\n");
    sb.append("    dispatcherFilterBlocked: ").append(toIndentedString(dispatcherFilterBlocked)).append("\n");
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

