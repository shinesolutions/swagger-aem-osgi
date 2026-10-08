package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheHttpProxyconfiguratorProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("proxy.enabled")
  private ConfigNodePropertyBoolean proxyEnabled;

  @JsonProperty("proxy.host")
  private ConfigNodePropertyString proxyHost;

  @JsonProperty("proxy.port")
  private ConfigNodePropertyInteger proxyPort;

  @JsonProperty("proxy.user")
  private ConfigNodePropertyString proxyUser;

  @JsonProperty("proxy.password")
  private ConfigNodePropertyString proxyPassword;

  @JsonProperty("proxy.exceptions")
  private ConfigNodePropertyArray proxyExceptions;

  /**
   * 
   * @return proxyEnabled
   */
  public ConfigNodePropertyBoolean getProxyEnabled() {
    return proxyEnabled;
  }

  public void setProxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
  }

  /**
   * 
   * @return proxyHost
   */
  public ConfigNodePropertyString getProxyHost() {
    return proxyHost;
  }

  public void setProxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
  }

  /**
   * 
   * @return proxyPort
   */
  public ConfigNodePropertyInteger getProxyPort() {
    return proxyPort;
  }

  public void setProxyPort(ConfigNodePropertyInteger proxyPort) {
    this.proxyPort = proxyPort;
  }

  /**
   * 
   * @return proxyUser
   */
  public ConfigNodePropertyString getProxyUser() {
    return proxyUser;
  }

  public void setProxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
  }

  /**
   * 
   * @return proxyPassword
   */
  public ConfigNodePropertyString getProxyPassword() {
    return proxyPassword;
  }

  public void setProxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
  }

  /**
   * 
   * @return proxyExceptions
   */
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
    return Objects.equals(this.proxyEnabled, orgApacheHttpProxyconfiguratorProperties.proxyEnabled) &&
        Objects.equals(this.proxyHost, orgApacheHttpProxyconfiguratorProperties.proxyHost) &&
        Objects.equals(this.proxyPort, orgApacheHttpProxyconfiguratorProperties.proxyPort) &&
        Objects.equals(this.proxyUser, orgApacheHttpProxyconfiguratorProperties.proxyUser) &&
        Objects.equals(this.proxyPassword, orgApacheHttpProxyconfiguratorProperties.proxyPassword) &&
        Objects.equals(this.proxyExceptions, orgApacheHttpProxyconfiguratorProperties.proxyExceptions);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
