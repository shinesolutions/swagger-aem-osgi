package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComDayCommonsHttpclientProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean proxyEnabled = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString proxyHost = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString proxyUser = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString proxyPassword = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString proxyNtlmHost = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString proxyNtlmDomain = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray proxyExceptions = null;
 /**
   * Get proxyEnabled
   * @return proxyEnabled
  **/
  @JsonProperty("proxy.enabled")
  public ConfigNodePropertyBoolean getProxyEnabled() {
    return proxyEnabled;
  }

  public void setProxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
  }

  public ComDayCommonsHttpclientProperties proxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
    return this;
  }

 /**
   * Get proxyHost
   * @return proxyHost
  **/
  @JsonProperty("proxy.host")
  public ConfigNodePropertyString getProxyHost() {
    return proxyHost;
  }

  public void setProxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
  }

  public ComDayCommonsHttpclientProperties proxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
    return this;
  }

 /**
   * Get proxyUser
   * @return proxyUser
  **/
  @JsonProperty("proxy.user")
  public ConfigNodePropertyString getProxyUser() {
    return proxyUser;
  }

  public void setProxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
  }

  public ComDayCommonsHttpclientProperties proxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
    return this;
  }

 /**
   * Get proxyPassword
   * @return proxyPassword
  **/
  @JsonProperty("proxy.password")
  public ConfigNodePropertyString getProxyPassword() {
    return proxyPassword;
  }

  public void setProxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
  }

  public ComDayCommonsHttpclientProperties proxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
    return this;
  }

 /**
   * Get proxyNtlmHost
   * @return proxyNtlmHost
  **/
  @JsonProperty("proxy.ntlm.host")
  public ConfigNodePropertyString getProxyNtlmHost() {
    return proxyNtlmHost;
  }

  public void setProxyNtlmHost(ConfigNodePropertyString proxyNtlmHost) {
    this.proxyNtlmHost = proxyNtlmHost;
  }

  public ComDayCommonsHttpclientProperties proxyNtlmHost(ConfigNodePropertyString proxyNtlmHost) {
    this.proxyNtlmHost = proxyNtlmHost;
    return this;
  }

 /**
   * Get proxyNtlmDomain
   * @return proxyNtlmDomain
  **/
  @JsonProperty("proxy.ntlm.domain")
  public ConfigNodePropertyString getProxyNtlmDomain() {
    return proxyNtlmDomain;
  }

  public void setProxyNtlmDomain(ConfigNodePropertyString proxyNtlmDomain) {
    this.proxyNtlmDomain = proxyNtlmDomain;
  }

  public ComDayCommonsHttpclientProperties proxyNtlmDomain(ConfigNodePropertyString proxyNtlmDomain) {
    this.proxyNtlmDomain = proxyNtlmDomain;
    return this;
  }

 /**
   * Get proxyExceptions
   * @return proxyExceptions
  **/
  @JsonProperty("proxy.exceptions")
  public ConfigNodePropertyArray getProxyExceptions() {
    return proxyExceptions;
  }

  public void setProxyExceptions(ConfigNodePropertyArray proxyExceptions) {
    this.proxyExceptions = proxyExceptions;
  }

  public ComDayCommonsHttpclientProperties proxyExceptions(ConfigNodePropertyArray proxyExceptions) {
    this.proxyExceptions = proxyExceptions;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

