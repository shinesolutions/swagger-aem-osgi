package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheHttpProxyconfiguratorProperties   {
  
  private ConfigNodePropertyBoolean proxyEnabled = null;
  private ConfigNodePropertyString proxyHost = null;
  private ConfigNodePropertyInteger proxyPort = null;
  private ConfigNodePropertyString proxyUser = null;
  private ConfigNodePropertyString proxyPassword = null;
  private ConfigNodePropertyArray proxyExceptions = null;

  public OrgApacheHttpProxyconfiguratorProperties () {

  }

  public OrgApacheHttpProxyconfiguratorProperties (ConfigNodePropertyBoolean proxyEnabled, ConfigNodePropertyString proxyHost, ConfigNodePropertyInteger proxyPort, ConfigNodePropertyString proxyUser, ConfigNodePropertyString proxyPassword, ConfigNodePropertyArray proxyExceptions) {
    this.proxyEnabled = proxyEnabled;
    this.proxyHost = proxyHost;
    this.proxyPort = proxyPort;
    this.proxyUser = proxyUser;
    this.proxyPassword = proxyPassword;
    this.proxyExceptions = proxyExceptions;
  }

    
  @JsonProperty("proxy.enabled")
  public ConfigNodePropertyBoolean getProxyEnabled() {
    return proxyEnabled;
  }
  public void setProxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
  }

    
  @JsonProperty("proxy.host")
  public ConfigNodePropertyString getProxyHost() {
    return proxyHost;
  }
  public void setProxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
  }

    
  @JsonProperty("proxy.port")
  public ConfigNodePropertyInteger getProxyPort() {
    return proxyPort;
  }
  public void setProxyPort(ConfigNodePropertyInteger proxyPort) {
    this.proxyPort = proxyPort;
  }

    
  @JsonProperty("proxy.user")
  public ConfigNodePropertyString getProxyUser() {
    return proxyUser;
  }
  public void setProxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
  }

    
  @JsonProperty("proxy.password")
  public ConfigNodePropertyString getProxyPassword() {
    return proxyPassword;
  }
  public void setProxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
  }

    
  @JsonProperty("proxy.exceptions")
  public ConfigNodePropertyArray getProxyExceptions() {
    return proxyExceptions;
  }
  public void setProxyExceptions(ConfigNodePropertyArray proxyExceptions) {
    this.proxyExceptions = proxyExceptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheHttpProxyconfiguratorProperties orgApacheHttpProxyconfiguratorProperties = (OrgApacheHttpProxyconfiguratorProperties) o;
    return Objects.equals(proxyEnabled, orgApacheHttpProxyconfiguratorProperties.proxyEnabled) &&
        Objects.equals(proxyHost, orgApacheHttpProxyconfiguratorProperties.proxyHost) &&
        Objects.equals(proxyPort, orgApacheHttpProxyconfiguratorProperties.proxyPort) &&
        Objects.equals(proxyUser, orgApacheHttpProxyconfiguratorProperties.proxyUser) &&
        Objects.equals(proxyPassword, orgApacheHttpProxyconfiguratorProperties.proxyPassword) &&
        Objects.equals(proxyExceptions, orgApacheHttpProxyconfiguratorProperties.proxyExceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyEnabled, proxyHost, proxyPort, proxyUser, proxyPassword, proxyExceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheHttpProxyconfiguratorProperties {\n");
    
    sb.append("    proxyEnabled: ").append(toIndentedString(proxyEnabled)).append("\n");
    sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
    sb.append("    proxyPort: ").append(toIndentedString(proxyPort)).append("\n");
    sb.append("    proxyUser: ").append(toIndentedString(proxyUser)).append("\n");
    sb.append("    proxyPassword: ").append(toIndentedString(proxyPassword)).append("\n");
    sb.append("    proxyExceptions: ").append(toIndentedString(proxyExceptions)).append("\n");
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
