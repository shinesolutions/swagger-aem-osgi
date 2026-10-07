package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCommonsHttpclientProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean proxyEnabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString proxyHost;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString proxyUser;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString proxyPassword;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString proxyNtlmHost;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString proxyNtlmDomain;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray proxyExceptions;
 /**
  * Get proxyEnabled
  * @return proxyEnabled
  */
  @JsonProperty("proxy.enabled")
  public ConfigNodePropertyBoolean getProxyEnabled() {
    return proxyEnabled;
  }

  /**
   * Sets the <code>proxyEnabled</code> property.
   */
 public void setProxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
  }

  /**
   * Sets the <code>proxyEnabled</code> property.
   */
  public ComDayCommonsHttpclientProperties proxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
    return this;
  }

 /**
  * Get proxyHost
  * @return proxyHost
  */
  @JsonProperty("proxy.host")
  public ConfigNodePropertyString getProxyHost() {
    return proxyHost;
  }

  /**
   * Sets the <code>proxyHost</code> property.
   */
 public void setProxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
  }

  /**
   * Sets the <code>proxyHost</code> property.
   */
  public ComDayCommonsHttpclientProperties proxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
    return this;
  }

 /**
  * Get proxyUser
  * @return proxyUser
  */
  @JsonProperty("proxy.user")
  public ConfigNodePropertyString getProxyUser() {
    return proxyUser;
  }

  /**
   * Sets the <code>proxyUser</code> property.
   */
 public void setProxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
  }

  /**
   * Sets the <code>proxyUser</code> property.
   */
  public ComDayCommonsHttpclientProperties proxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
    return this;
  }

 /**
  * Get proxyPassword
  * @return proxyPassword
  */
  @JsonProperty("proxy.password")
  public ConfigNodePropertyString getProxyPassword() {
    return proxyPassword;
  }

  /**
   * Sets the <code>proxyPassword</code> property.
   */
 public void setProxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
  }

  /**
   * Sets the <code>proxyPassword</code> property.
   */
  public ComDayCommonsHttpclientProperties proxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
    return this;
  }

 /**
  * Get proxyNtlmHost
  * @return proxyNtlmHost
  */
  @JsonProperty("proxy.ntlm.host")
  public ConfigNodePropertyString getProxyNtlmHost() {
    return proxyNtlmHost;
  }

  /**
   * Sets the <code>proxyNtlmHost</code> property.
   */
 public void setProxyNtlmHost(ConfigNodePropertyString proxyNtlmHost) {
    this.proxyNtlmHost = proxyNtlmHost;
  }

  /**
   * Sets the <code>proxyNtlmHost</code> property.
   */
  public ComDayCommonsHttpclientProperties proxyNtlmHost(ConfigNodePropertyString proxyNtlmHost) {
    this.proxyNtlmHost = proxyNtlmHost;
    return this;
  }

 /**
  * Get proxyNtlmDomain
  * @return proxyNtlmDomain
  */
  @JsonProperty("proxy.ntlm.domain")
  public ConfigNodePropertyString getProxyNtlmDomain() {
    return proxyNtlmDomain;
  }

  /**
   * Sets the <code>proxyNtlmDomain</code> property.
   */
 public void setProxyNtlmDomain(ConfigNodePropertyString proxyNtlmDomain) {
    this.proxyNtlmDomain = proxyNtlmDomain;
  }

  /**
   * Sets the <code>proxyNtlmDomain</code> property.
   */
  public ComDayCommonsHttpclientProperties proxyNtlmDomain(ConfigNodePropertyString proxyNtlmDomain) {
    this.proxyNtlmDomain = proxyNtlmDomain;
    return this;
  }

 /**
  * Get proxyExceptions
  * @return proxyExceptions
  */
  @JsonProperty("proxy.exceptions")
  public ConfigNodePropertyArray getProxyExceptions() {
    return proxyExceptions;
  }

  /**
   * Sets the <code>proxyExceptions</code> property.
   */
 public void setProxyExceptions(ConfigNodePropertyArray proxyExceptions) {
    this.proxyExceptions = proxyExceptions;
  }

  /**
   * Sets the <code>proxyExceptions</code> property.
   */
  public ComDayCommonsHttpclientProperties proxyExceptions(ConfigNodePropertyArray proxyExceptions) {
    this.proxyExceptions = proxyExceptions;
    return this;
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
    return Objects.equals(this.proxyEnabled, comDayCommonsHttpclientProperties.proxyEnabled) &&
        Objects.equals(this.proxyHost, comDayCommonsHttpclientProperties.proxyHost) &&
        Objects.equals(this.proxyUser, comDayCommonsHttpclientProperties.proxyUser) &&
        Objects.equals(this.proxyPassword, comDayCommonsHttpclientProperties.proxyPassword) &&
        Objects.equals(this.proxyNtlmHost, comDayCommonsHttpclientProperties.proxyNtlmHost) &&
        Objects.equals(this.proxyNtlmDomain, comDayCommonsHttpclientProperties.proxyNtlmDomain) &&
        Objects.equals(this.proxyExceptions, comDayCommonsHttpclientProperties.proxyExceptions);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

