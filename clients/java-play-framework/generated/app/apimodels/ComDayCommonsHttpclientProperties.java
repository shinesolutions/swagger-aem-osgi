package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCommonsHttpclientProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCommonsHttpclientProperties   {
  @JsonProperty("proxy.enabled")
  private ConfigNodePropertyBoolean proxyEnabled = null;

  @JsonProperty("proxy.host")
  private ConfigNodePropertyString proxyHost = null;

  @JsonProperty("proxy.user")
  private ConfigNodePropertyString proxyUser = null;

  @JsonProperty("proxy.password")
  private ConfigNodePropertyString proxyPassword = null;

  @JsonProperty("proxy.ntlm.host")
  private ConfigNodePropertyString proxyNtlmHost = null;

  @JsonProperty("proxy.ntlm.domain")
  private ConfigNodePropertyString proxyNtlmDomain = null;

  @JsonProperty("proxy.exceptions")
  private ConfigNodePropertyArray proxyExceptions = null;

  public ComDayCommonsHttpclientProperties proxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
    return this;
  }

   /**
   * Get proxyEnabled
   * @return proxyEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getProxyEnabled() {
    return proxyEnabled;
  }

  public void setProxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
  }

  public ComDayCommonsHttpclientProperties proxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
    return this;
  }

   /**
   * Get proxyHost
   * @return proxyHost
  **/
  @Valid
  public ConfigNodePropertyString getProxyHost() {
    return proxyHost;
  }

  public void setProxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
  }

  public ComDayCommonsHttpclientProperties proxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
    return this;
  }

   /**
   * Get proxyUser
   * @return proxyUser
  **/
  @Valid
  public ConfigNodePropertyString getProxyUser() {
    return proxyUser;
  }

  public void setProxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
  }

  public ComDayCommonsHttpclientProperties proxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
    return this;
  }

   /**
   * Get proxyPassword
   * @return proxyPassword
  **/
  @Valid
  public ConfigNodePropertyString getProxyPassword() {
    return proxyPassword;
  }

  public void setProxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
  }

  public ComDayCommonsHttpclientProperties proxyNtlmHost(ConfigNodePropertyString proxyNtlmHost) {
    this.proxyNtlmHost = proxyNtlmHost;
    return this;
  }

   /**
   * Get proxyNtlmHost
   * @return proxyNtlmHost
  **/
  @Valid
  public ConfigNodePropertyString getProxyNtlmHost() {
    return proxyNtlmHost;
  }

  public void setProxyNtlmHost(ConfigNodePropertyString proxyNtlmHost) {
    this.proxyNtlmHost = proxyNtlmHost;
  }

  public ComDayCommonsHttpclientProperties proxyNtlmDomain(ConfigNodePropertyString proxyNtlmDomain) {
    this.proxyNtlmDomain = proxyNtlmDomain;
    return this;
  }

   /**
   * Get proxyNtlmDomain
   * @return proxyNtlmDomain
  **/
  @Valid
  public ConfigNodePropertyString getProxyNtlmDomain() {
    return proxyNtlmDomain;
  }

  public void setProxyNtlmDomain(ConfigNodePropertyString proxyNtlmDomain) {
    this.proxyNtlmDomain = proxyNtlmDomain;
  }

  public ComDayCommonsHttpclientProperties proxyExceptions(ConfigNodePropertyArray proxyExceptions) {
    this.proxyExceptions = proxyExceptions;
    return this;
  }

   /**
   * Get proxyExceptions
   * @return proxyExceptions
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

