package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray hcTags = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString dispatcherAddress = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray dispatcherFilterAllowed = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray dispatcherFilterBlocked = null;
 /**
   * Get hcTags
   * @return hcTags
  **/
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
   * Get dispatcherAddress
   * @return dispatcherAddress
  **/
  @JsonProperty("dispatcher.address")
  public ConfigNodePropertyString getDispatcherAddress() {
    return dispatcherAddress;
  }

  public void setDispatcherAddress(ConfigNodePropertyString dispatcherAddress) {
    this.dispatcherAddress = dispatcherAddress;
  }

  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties dispatcherAddress(ConfigNodePropertyString dispatcherAddress) {
    this.dispatcherAddress = dispatcherAddress;
    return this;
  }

 /**
   * Get dispatcherFilterAllowed
   * @return dispatcherFilterAllowed
  **/
  @JsonProperty("dispatcher.filter.allowed")
  public ConfigNodePropertyArray getDispatcherFilterAllowed() {
    return dispatcherFilterAllowed;
  }

  public void setDispatcherFilterAllowed(ConfigNodePropertyArray dispatcherFilterAllowed) {
    this.dispatcherFilterAllowed = dispatcherFilterAllowed;
  }

  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties dispatcherFilterAllowed(ConfigNodePropertyArray dispatcherFilterAllowed) {
    this.dispatcherFilterAllowed = dispatcherFilterAllowed;
    return this;
  }

 /**
   * Get dispatcherFilterBlocked
   * @return dispatcherFilterBlocked
  **/
  @JsonProperty("dispatcher.filter.blocked")
  public ConfigNodePropertyArray getDispatcherFilterBlocked() {
    return dispatcherFilterBlocked;
  }

  public void setDispatcherFilterBlocked(ConfigNodePropertyArray dispatcherFilterBlocked) {
    this.dispatcherFilterBlocked = dispatcherFilterBlocked;
  }

  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties dispatcherFilterBlocked(ConfigNodePropertyArray dispatcherFilterBlocked) {
    this.dispatcherFilterBlocked = dispatcherFilterBlocked;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

