package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheHttpProxyconfiguratorProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheHttpProxyconfiguratorProperties   {
  private ConfigNodePropertyBoolean proxyEnabled;
  private ConfigNodePropertyString proxyHost;
  private ConfigNodePropertyInteger proxyPort;
  private ConfigNodePropertyString proxyUser;
  private ConfigNodePropertyString proxyPassword;
  private ConfigNodePropertyArray proxyExceptions;

  public OrgApacheHttpProxyconfiguratorProperties() {
  }

  /**
   **/
  public OrgApacheHttpProxyconfiguratorProperties proxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("proxy.enabled")
  @Valid public ConfigNodePropertyBoolean getProxyEnabled() {
    return proxyEnabled;
  }

  @JsonProperty("proxy.enabled")
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
  @Valid public ConfigNodePropertyString getProxyHost() {
    return proxyHost;
  }

  @JsonProperty("proxy.host")
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
  @Valid public ConfigNodePropertyInteger getProxyPort() {
    return proxyPort;
  }

  @JsonProperty("proxy.port")
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
  @Valid public ConfigNodePropertyString getProxyUser() {
    return proxyUser;
  }

  @JsonProperty("proxy.user")
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
  @Valid public ConfigNodePropertyString getProxyPassword() {
    return proxyPassword;
  }

  @JsonProperty("proxy.password")
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
  @Valid public ConfigNodePropertyArray getProxyExceptions() {
    return proxyExceptions;
  }

  @JsonProperty("proxy.exceptions")
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
