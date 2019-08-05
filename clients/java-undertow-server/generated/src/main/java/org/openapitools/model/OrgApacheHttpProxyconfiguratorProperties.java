package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class OrgApacheHttpProxyconfiguratorProperties   {
  
  private ConfigNodePropertyBoolean proxyEnabled = null;
  private ConfigNodePropertyString proxyHost = null;
  private ConfigNodePropertyInteger proxyPort = null;
  private ConfigNodePropertyString proxyUser = null;
  private ConfigNodePropertyString proxyPassword = null;
  private ConfigNodePropertyArray proxyExceptions = null;

  /**
   **/
  public OrgApacheHttpProxyconfiguratorProperties proxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("proxy.enabled")
  public ConfigNodePropertyBoolean getProxyEnabled() {
    return proxyEnabled;
  }
  public void setProxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
  }

  /**
   **/
  public OrgApacheHttpProxyconfiguratorProperties proxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("proxy.host")
  public ConfigNodePropertyString getProxyHost() {
    return proxyHost;
  }
  public void setProxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
  }

  /**
   **/
  public OrgApacheHttpProxyconfiguratorProperties proxyPort(ConfigNodePropertyInteger proxyPort) {
    this.proxyPort = proxyPort;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("proxy.port")
  public ConfigNodePropertyInteger getProxyPort() {
    return proxyPort;
  }
  public void setProxyPort(ConfigNodePropertyInteger proxyPort) {
    this.proxyPort = proxyPort;
  }

  /**
   **/
  public OrgApacheHttpProxyconfiguratorProperties proxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("proxy.user")
  public ConfigNodePropertyString getProxyUser() {
    return proxyUser;
  }
  public void setProxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
  }

  /**
   **/
  public OrgApacheHttpProxyconfiguratorProperties proxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("proxy.password")
  public ConfigNodePropertyString getProxyPassword() {
    return proxyPassword;
  }
  public void setProxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
  }

  /**
   **/
  public OrgApacheHttpProxyconfiguratorProperties proxyExceptions(ConfigNodePropertyArray proxyExceptions) {
    this.proxyExceptions = proxyExceptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("proxy.exceptions")
  public ConfigNodePropertyArray getProxyExceptions() {
    return proxyExceptions;
  }
  public void setProxyExceptions(ConfigNodePropertyArray proxyExceptions) {
    this.proxyExceptions = proxyExceptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

