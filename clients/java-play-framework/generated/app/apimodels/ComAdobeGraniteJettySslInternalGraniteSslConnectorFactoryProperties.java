package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties   {
  @JsonProperty("com.adobe.granite.jetty.ssl.port")
  @Valid

  private ConfigNodePropertyInteger comAdobeGraniteJettySslPort;

  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.user")
  @Valid

  private ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser;

  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.password")
  @Valid

  private ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword;

  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.excluded")
  @Valid

  private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded;

  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.included")
  @Valid

  private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded;

  @JsonProperty("com.adobe.granite.jetty.ssl.client.certificate")
  @Valid

  private ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate;

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslPort(ConfigNodePropertyInteger comAdobeGraniteJettySslPort) {
    this.comAdobeGraniteJettySslPort = comAdobeGraniteJettySslPort;
    return this;
  }

   /**
   * Get comAdobeGraniteJettySslPort
   * @return comAdobeGraniteJettySslPort
  **/
  public ConfigNodePropertyInteger getComAdobeGraniteJettySslPort() {
    return comAdobeGraniteJettySslPort;
  }

  public void setComAdobeGraniteJettySslPort(ConfigNodePropertyInteger comAdobeGraniteJettySslPort) {
    this.comAdobeGraniteJettySslPort = comAdobeGraniteJettySslPort;
  }

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslKeystoreUser(ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser) {
    this.comAdobeGraniteJettySslKeystoreUser = comAdobeGraniteJettySslKeystoreUser;
    return this;
  }

   /**
   * Get comAdobeGraniteJettySslKeystoreUser
   * @return comAdobeGraniteJettySslKeystoreUser
  **/
  public ConfigNodePropertyString getComAdobeGraniteJettySslKeystoreUser() {
    return comAdobeGraniteJettySslKeystoreUser;
  }

  public void setComAdobeGraniteJettySslKeystoreUser(ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser) {
    this.comAdobeGraniteJettySslKeystoreUser = comAdobeGraniteJettySslKeystoreUser;
  }

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslKeystorePassword(ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword) {
    this.comAdobeGraniteJettySslKeystorePassword = comAdobeGraniteJettySslKeystorePassword;
    return this;
  }

   /**
   * Get comAdobeGraniteJettySslKeystorePassword
   * @return comAdobeGraniteJettySslKeystorePassword
  **/
  public ConfigNodePropertyString getComAdobeGraniteJettySslKeystorePassword() {
    return comAdobeGraniteJettySslKeystorePassword;
  }

  public void setComAdobeGraniteJettySslKeystorePassword(ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword) {
    this.comAdobeGraniteJettySslKeystorePassword = comAdobeGraniteJettySslKeystorePassword;
  }

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslCiphersuitesExcluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded) {
    this.comAdobeGraniteJettySslCiphersuitesExcluded = comAdobeGraniteJettySslCiphersuitesExcluded;
    return this;
  }

   /**
   * Get comAdobeGraniteJettySslCiphersuitesExcluded
   * @return comAdobeGraniteJettySslCiphersuitesExcluded
  **/
  public ConfigNodePropertyArray getComAdobeGraniteJettySslCiphersuitesExcluded() {
    return comAdobeGraniteJettySslCiphersuitesExcluded;
  }

  public void setComAdobeGraniteJettySslCiphersuitesExcluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded) {
    this.comAdobeGraniteJettySslCiphersuitesExcluded = comAdobeGraniteJettySslCiphersuitesExcluded;
  }

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslCiphersuitesIncluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded) {
    this.comAdobeGraniteJettySslCiphersuitesIncluded = comAdobeGraniteJettySslCiphersuitesIncluded;
    return this;
  }

   /**
   * Get comAdobeGraniteJettySslCiphersuitesIncluded
   * @return comAdobeGraniteJettySslCiphersuitesIncluded
  **/
  public ConfigNodePropertyArray getComAdobeGraniteJettySslCiphersuitesIncluded() {
    return comAdobeGraniteJettySslCiphersuitesIncluded;
  }

  public void setComAdobeGraniteJettySslCiphersuitesIncluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded) {
    this.comAdobeGraniteJettySslCiphersuitesIncluded = comAdobeGraniteJettySslCiphersuitesIncluded;
  }

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslClientCertificate(ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate) {
    this.comAdobeGraniteJettySslClientCertificate = comAdobeGraniteJettySslClientCertificate;
    return this;
  }

   /**
   * Get comAdobeGraniteJettySslClientCertificate
   * @return comAdobeGraniteJettySslClientCertificate
  **/
  public ConfigNodePropertyDropDown getComAdobeGraniteJettySslClientCertificate() {
    return comAdobeGraniteJettySslClientCertificate;
  }

  public void setComAdobeGraniteJettySslClientCertificate(ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate) {
    this.comAdobeGraniteJettySslClientCertificate = comAdobeGraniteJettySslClientCertificate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties = (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties) o;
    return Objects.equals(comAdobeGraniteJettySslPort, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslPort) &&
        Objects.equals(comAdobeGraniteJettySslKeystoreUser, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslKeystoreUser) &&
        Objects.equals(comAdobeGraniteJettySslKeystorePassword, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslKeystorePassword) &&
        Objects.equals(comAdobeGraniteJettySslCiphersuitesExcluded, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslCiphersuitesExcluded) &&
        Objects.equals(comAdobeGraniteJettySslCiphersuitesIncluded, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslCiphersuitesIncluded) &&
        Objects.equals(comAdobeGraniteJettySslClientCertificate, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslClientCertificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeGraniteJettySslPort, comAdobeGraniteJettySslKeystoreUser, comAdobeGraniteJettySslKeystorePassword, comAdobeGraniteJettySslCiphersuitesExcluded, comAdobeGraniteJettySslCiphersuitesIncluded, comAdobeGraniteJettySslClientCertificate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties {\n");
    
    sb.append("    comAdobeGraniteJettySslPort: ").append(toIndentedString(comAdobeGraniteJettySslPort)).append("\n");
    sb.append("    comAdobeGraniteJettySslKeystoreUser: ").append(toIndentedString(comAdobeGraniteJettySslKeystoreUser)).append("\n");
    sb.append("    comAdobeGraniteJettySslKeystorePassword: ").append(toIndentedString(comAdobeGraniteJettySslKeystorePassword)).append("\n");
    sb.append("    comAdobeGraniteJettySslCiphersuitesExcluded: ").append(toIndentedString(comAdobeGraniteJettySslCiphersuitesExcluded)).append("\n");
    sb.append("    comAdobeGraniteJettySslCiphersuitesIncluded: ").append(toIndentedString(comAdobeGraniteJettySslCiphersuitesIncluded)).append("\n");
    sb.append("    comAdobeGraniteJettySslClientCertificate: ").append(toIndentedString(comAdobeGraniteJettySslClientCertificate)).append("\n");
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

