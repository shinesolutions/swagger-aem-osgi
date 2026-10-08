/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties   {
  
  private ConfigNodePropertyInteger comAdobeGraniteJettySslPort;
  private ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser;
  private ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword;
  private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded;
  private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded;
  private ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate;

  /**
   */
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslPort(ConfigNodePropertyInteger comAdobeGraniteJettySslPort) {
    this.comAdobeGraniteJettySslPort = comAdobeGraniteJettySslPort;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.port")
  public ConfigNodePropertyInteger getComAdobeGraniteJettySslPort() {
    return comAdobeGraniteJettySslPort;
  }
  public void setComAdobeGraniteJettySslPort(ConfigNodePropertyInteger comAdobeGraniteJettySslPort) {
    this.comAdobeGraniteJettySslPort = comAdobeGraniteJettySslPort;
  }

  /**
   */
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslKeystoreUser(ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser) {
    this.comAdobeGraniteJettySslKeystoreUser = comAdobeGraniteJettySslKeystoreUser;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.user")
  public ConfigNodePropertyString getComAdobeGraniteJettySslKeystoreUser() {
    return comAdobeGraniteJettySslKeystoreUser;
  }
  public void setComAdobeGraniteJettySslKeystoreUser(ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser) {
    this.comAdobeGraniteJettySslKeystoreUser = comAdobeGraniteJettySslKeystoreUser;
  }

  /**
   */
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslKeystorePassword(ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword) {
    this.comAdobeGraniteJettySslKeystorePassword = comAdobeGraniteJettySslKeystorePassword;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.password")
  public ConfigNodePropertyString getComAdobeGraniteJettySslKeystorePassword() {
    return comAdobeGraniteJettySslKeystorePassword;
  }
  public void setComAdobeGraniteJettySslKeystorePassword(ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword) {
    this.comAdobeGraniteJettySslKeystorePassword = comAdobeGraniteJettySslKeystorePassword;
  }

  /**
   */
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslCiphersuitesExcluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded) {
    this.comAdobeGraniteJettySslCiphersuitesExcluded = comAdobeGraniteJettySslCiphersuitesExcluded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.excluded")
  public ConfigNodePropertyArray getComAdobeGraniteJettySslCiphersuitesExcluded() {
    return comAdobeGraniteJettySslCiphersuitesExcluded;
  }
  public void setComAdobeGraniteJettySslCiphersuitesExcluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded) {
    this.comAdobeGraniteJettySslCiphersuitesExcluded = comAdobeGraniteJettySslCiphersuitesExcluded;
  }

  /**
   */
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslCiphersuitesIncluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded) {
    this.comAdobeGraniteJettySslCiphersuitesIncluded = comAdobeGraniteJettySslCiphersuitesIncluded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.included")
  public ConfigNodePropertyArray getComAdobeGraniteJettySslCiphersuitesIncluded() {
    return comAdobeGraniteJettySslCiphersuitesIncluded;
  }
  public void setComAdobeGraniteJettySslCiphersuitesIncluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded) {
    this.comAdobeGraniteJettySslCiphersuitesIncluded = comAdobeGraniteJettySslCiphersuitesIncluded;
  }

  /**
   */
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslClientCertificate(ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate) {
    this.comAdobeGraniteJettySslClientCertificate = comAdobeGraniteJettySslClientCertificate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.client.certificate")
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

