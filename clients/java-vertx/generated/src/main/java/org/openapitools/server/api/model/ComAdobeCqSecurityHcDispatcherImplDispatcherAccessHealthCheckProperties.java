package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties   {
  
  private ConfigNodePropertyArray hcTags = null;
  private ConfigNodePropertyString dispatcherAddress = null;
  private ConfigNodePropertyArray dispatcherFilterAllowed = null;
  private ConfigNodePropertyArray dispatcherFilterBlocked = null;

  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties () {

  }

  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties (ConfigNodePropertyArray hcTags, ConfigNodePropertyString dispatcherAddress, ConfigNodePropertyArray dispatcherFilterAllowed, ConfigNodePropertyArray dispatcherFilterBlocked) {
    this.hcTags = hcTags;
    this.dispatcherAddress = dispatcherAddress;
    this.dispatcherFilterAllowed = dispatcherFilterAllowed;
    this.dispatcherFilterBlocked = dispatcherFilterBlocked;
  }

    
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

    
  @JsonProperty("dispatcher.address")
  public ConfigNodePropertyString getDispatcherAddress() {
    return dispatcherAddress;
  }
  public void setDispatcherAddress(ConfigNodePropertyString dispatcherAddress) {
    this.dispatcherAddress = dispatcherAddress;
  }

    
  @JsonProperty("dispatcher.filter.allowed")
  public ConfigNodePropertyArray getDispatcherFilterAllowed() {
    return dispatcherFilterAllowed;
  }
  public void setDispatcherFilterAllowed(ConfigNodePropertyArray dispatcherFilterAllowed) {
    this.dispatcherFilterAllowed = dispatcherFilterAllowed;
  }

    
  @JsonProperty("dispatcher.filter.blocked")
  public ConfigNodePropertyArray getDispatcherFilterBlocked() {
    return dispatcherFilterBlocked;
  }
  public void setDispatcherFilterBlocked(ConfigNodePropertyArray dispatcherFilterBlocked) {
    this.dispatcherFilterBlocked = dispatcherFilterBlocked;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
