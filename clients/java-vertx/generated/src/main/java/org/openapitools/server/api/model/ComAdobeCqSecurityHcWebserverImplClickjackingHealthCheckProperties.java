package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties   {
  
  private ConfigNodePropertyArray hcTags = null;
  private ConfigNodePropertyString webserverAddress = null;

  public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties () {

  }

  public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties (ConfigNodePropertyArray hcTags, ConfigNodePropertyString webserverAddress) {
    this.hcTags = hcTags;
    this.webserverAddress = webserverAddress;
  }

    
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

    
  @JsonProperty("webserver.address")
  public ConfigNodePropertyString getWebserverAddress() {
    return webserverAddress;
  }
  public void setWebserverAddress(ConfigNodePropertyString webserverAddress) {
    this.webserverAddress = webserverAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties = (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties) o;
    return Objects.equals(hcTags, comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.hcTags) &&
        Objects.equals(webserverAddress, comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.webserverAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, webserverAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties {\n");
    
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    webserverAddress: ").append(toIndentedString(webserverAddress)).append("\n");
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
