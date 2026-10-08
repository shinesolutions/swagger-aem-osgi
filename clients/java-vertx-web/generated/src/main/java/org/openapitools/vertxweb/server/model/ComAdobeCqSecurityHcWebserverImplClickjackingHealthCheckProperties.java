package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties   {
  
  private ConfigNodePropertyArray hcTags;
  private ConfigNodePropertyString webserverAddress;

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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
