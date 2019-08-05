package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCommonsHttpclientProperties   {
  
  private ConfigNodePropertyBoolean proxyEnabled = null;
  private ConfigNodePropertyString proxyHost = null;
  private ConfigNodePropertyString proxyUser = null;
  private ConfigNodePropertyString proxyPassword = null;
  private ConfigNodePropertyString proxyNtlmHost = null;
  private ConfigNodePropertyString proxyNtlmDomain = null;
  private ConfigNodePropertyArray proxyExceptions = null;

  public ComDayCommonsHttpclientProperties () {

  }

  public ComDayCommonsHttpclientProperties (ConfigNodePropertyBoolean proxyEnabled, ConfigNodePropertyString proxyHost, ConfigNodePropertyString proxyUser, ConfigNodePropertyString proxyPassword, ConfigNodePropertyString proxyNtlmHost, ConfigNodePropertyString proxyNtlmDomain, ConfigNodePropertyArray proxyExceptions) {
    this.proxyEnabled = proxyEnabled;
    this.proxyHost = proxyHost;
    this.proxyUser = proxyUser;
    this.proxyPassword = proxyPassword;
    this.proxyNtlmHost = proxyNtlmHost;
    this.proxyNtlmDomain = proxyNtlmDomain;
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

    
  @JsonProperty("proxy.ntlm.host")
  public ConfigNodePropertyString getProxyNtlmHost() {
    return proxyNtlmHost;
  }
  public void setProxyNtlmHost(ConfigNodePropertyString proxyNtlmHost) {
    this.proxyNtlmHost = proxyNtlmHost;
  }

    
  @JsonProperty("proxy.ntlm.domain")
  public ConfigNodePropertyString getProxyNtlmDomain() {
    return proxyNtlmDomain;
  }
  public void setProxyNtlmDomain(ConfigNodePropertyString proxyNtlmDomain) {
    this.proxyNtlmDomain = proxyNtlmDomain;
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
    ComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties = (ComDayCommonsHttpclientProperties) o;
    return Objects.equals(proxyEnabled, comDayCommonsHttpclientProperties.proxyEnabled) &&
        Objects.equals(proxyHost, comDayCommonsHttpclientProperties.proxyHost) &&
        Objects.equals(proxyUser, comDayCommonsHttpclientProperties.proxyUser) &&
        Objects.equals(proxyPassword, comDayCommonsHttpclientProperties.proxyPassword) &&
        Objects.equals(proxyNtlmHost, comDayCommonsHttpclientProperties.proxyNtlmHost) &&
        Objects.equals(proxyNtlmDomain, comDayCommonsHttpclientProperties.proxyNtlmDomain) &&
        Objects.equals(proxyExceptions, comDayCommonsHttpclientProperties.proxyExceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyEnabled, proxyHost, proxyUser, proxyPassword, proxyNtlmHost, proxyNtlmDomain, proxyExceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCommonsHttpclientProperties {\n");
    
    sb.append("    proxyEnabled: ").append(toIndentedString(proxyEnabled)).append("\n");
    sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
    sb.append("    proxyUser: ").append(toIndentedString(proxyUser)).append("\n");
    sb.append("    proxyPassword: ").append(toIndentedString(proxyPassword)).append("\n");
    sb.append("    proxyNtlmHost: ").append(toIndentedString(proxyNtlmHost)).append("\n");
    sb.append("    proxyNtlmDomain: ").append(toIndentedString(proxyNtlmDomain)).append("\n");
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
