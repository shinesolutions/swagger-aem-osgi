package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties   {
  @JsonProperty("com.adobe.granite.jetty.ssl.port")
  private ConfigNodePropertyInteger comAdobeGraniteJettySslPort = null;

  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.user")
  private ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser = null;

  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.password")
  private ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword = null;

  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.excluded")
  private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded = null;

  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.included")
  private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded = null;

  @JsonProperty("com.adobe.granite.jetty.ssl.client.certificate")
  private ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate = null;

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslPort(ConfigNodePropertyInteger comAdobeGraniteJettySslPort) {
    this.comAdobeGraniteJettySslPort = comAdobeGraniteJettySslPort;
    return this;
  }

   /**
   * Get comAdobeGraniteJettySslPort
   * @return comAdobeGraniteJettySslPort
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getComAdobeGraniteJettySslClientCertificate() {
    return comAdobeGraniteJettySslClientCertificate;
  }

  public void setComAdobeGraniteJettySslClientCertificate(ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate) {
    this.comAdobeGraniteJettySslClientCertificate = comAdobeGraniteJettySslClientCertificate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties = (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties) o;
    return Objects.equals(this.comAdobeGraniteJettySslPort, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslPort) &&
        Objects.equals(this.comAdobeGraniteJettySslKeystoreUser, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslKeystoreUser) &&
        Objects.equals(this.comAdobeGraniteJettySslKeystorePassword, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslKeystorePassword) &&
        Objects.equals(this.comAdobeGraniteJettySslCiphersuitesExcluded, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslCiphersuitesExcluded) &&
        Objects.equals(this.comAdobeGraniteJettySslCiphersuitesIncluded, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslCiphersuitesIncluded) &&
        Objects.equals(this.comAdobeGraniteJettySslClientCertificate, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.comAdobeGraniteJettySslClientCertificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeGraniteJettySslPort, comAdobeGraniteJettySslKeystoreUser, comAdobeGraniteJettySslKeystorePassword, comAdobeGraniteJettySslCiphersuitesExcluded, comAdobeGraniteJettySslCiphersuitesIncluded, comAdobeGraniteJettySslClientCertificate);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

