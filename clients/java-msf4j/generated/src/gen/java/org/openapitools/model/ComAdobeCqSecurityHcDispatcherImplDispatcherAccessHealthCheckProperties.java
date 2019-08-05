package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties   {
  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags = null;

  @JsonProperty("dispatcher.address")
  private ConfigNodePropertyString dispatcherAddress = null;

  @JsonProperty("dispatcher.filter.allowed")
  private ConfigNodePropertyArray dispatcherFilterAllowed = null;

  @JsonProperty("dispatcher.filter.blocked")
  private ConfigNodePropertyArray dispatcherFilterBlocked = null;

  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

   /**
   * Get hcTags
   * @return hcTags
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties dispatcherAddress(ConfigNodePropertyString dispatcherAddress) {
    this.dispatcherAddress = dispatcherAddress;
    return this;
  }

   /**
   * Get dispatcherAddress
   * @return dispatcherAddress
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDispatcherAddress() {
    return dispatcherAddress;
  }

  public void setDispatcherAddress(ConfigNodePropertyString dispatcherAddress) {
    this.dispatcherAddress = dispatcherAddress;
  }

  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties dispatcherFilterAllowed(ConfigNodePropertyArray dispatcherFilterAllowed) {
    this.dispatcherFilterAllowed = dispatcherFilterAllowed;
    return this;
  }

   /**
   * Get dispatcherFilterAllowed
   * @return dispatcherFilterAllowed
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getDispatcherFilterAllowed() {
    return dispatcherFilterAllowed;
  }

  public void setDispatcherFilterAllowed(ConfigNodePropertyArray dispatcherFilterAllowed) {
    this.dispatcherFilterAllowed = dispatcherFilterAllowed;
  }

  public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties dispatcherFilterBlocked(ConfigNodePropertyArray dispatcherFilterBlocked) {
    this.dispatcherFilterBlocked = dispatcherFilterBlocked;
    return this;
  }

   /**
   * Get dispatcherFilterBlocked
   * @return dispatcherFilterBlocked
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.hcTags, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.hcTags) &&
        Objects.equals(this.dispatcherAddress, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.dispatcherAddress) &&
        Objects.equals(this.dispatcherFilterAllowed, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.dispatcherFilterAllowed) &&
        Objects.equals(this.dispatcherFilterBlocked, comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.dispatcherFilterBlocked);
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

