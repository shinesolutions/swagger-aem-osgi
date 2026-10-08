package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
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



@JsonTypeName("comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties   {
  private ConfigNodePropertyInteger comAdobeGraniteJettySslPort;
  private ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser;
  private ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword;
  private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded;
  private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded;
  private ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate;

  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties() {
  }

  /**
   **/
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslPort(ConfigNodePropertyInteger comAdobeGraniteJettySslPort) {
    this.comAdobeGraniteJettySslPort = comAdobeGraniteJettySslPort;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.port")
  @Valid public ConfigNodePropertyInteger getComAdobeGraniteJettySslPort() {
    return comAdobeGraniteJettySslPort;
  }

  @JsonProperty("com.adobe.granite.jetty.ssl.port")
  public void setComAdobeGraniteJettySslPort(ConfigNodePropertyInteger comAdobeGraniteJettySslPort) {
    this.comAdobeGraniteJettySslPort = comAdobeGraniteJettySslPort;
  }

  /**
   **/
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslKeystoreUser(ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser) {
    this.comAdobeGraniteJettySslKeystoreUser = comAdobeGraniteJettySslKeystoreUser;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.user")
  @Valid public ConfigNodePropertyString getComAdobeGraniteJettySslKeystoreUser() {
    return comAdobeGraniteJettySslKeystoreUser;
  }

  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.user")
  public void setComAdobeGraniteJettySslKeystoreUser(ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser) {
    this.comAdobeGraniteJettySslKeystoreUser = comAdobeGraniteJettySslKeystoreUser;
  }

  /**
   **/
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslKeystorePassword(ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword) {
    this.comAdobeGraniteJettySslKeystorePassword = comAdobeGraniteJettySslKeystorePassword;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.password")
  @Valid public ConfigNodePropertyString getComAdobeGraniteJettySslKeystorePassword() {
    return comAdobeGraniteJettySslKeystorePassword;
  }

  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.password")
  public void setComAdobeGraniteJettySslKeystorePassword(ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword) {
    this.comAdobeGraniteJettySslKeystorePassword = comAdobeGraniteJettySslKeystorePassword;
  }

  /**
   **/
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslCiphersuitesExcluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded) {
    this.comAdobeGraniteJettySslCiphersuitesExcluded = comAdobeGraniteJettySslCiphersuitesExcluded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.excluded")
  @Valid public ConfigNodePropertyArray getComAdobeGraniteJettySslCiphersuitesExcluded() {
    return comAdobeGraniteJettySslCiphersuitesExcluded;
  }

  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.excluded")
  public void setComAdobeGraniteJettySslCiphersuitesExcluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded) {
    this.comAdobeGraniteJettySslCiphersuitesExcluded = comAdobeGraniteJettySslCiphersuitesExcluded;
  }

  /**
   **/
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslCiphersuitesIncluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded) {
    this.comAdobeGraniteJettySslCiphersuitesIncluded = comAdobeGraniteJettySslCiphersuitesIncluded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.included")
  @Valid public ConfigNodePropertyArray getComAdobeGraniteJettySslCiphersuitesIncluded() {
    return comAdobeGraniteJettySslCiphersuitesIncluded;
  }

  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.included")
  public void setComAdobeGraniteJettySslCiphersuitesIncluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded) {
    this.comAdobeGraniteJettySslCiphersuitesIncluded = comAdobeGraniteJettySslCiphersuitesIncluded;
  }

  /**
   **/
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties comAdobeGraniteJettySslClientCertificate(ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate) {
    this.comAdobeGraniteJettySslClientCertificate = comAdobeGraniteJettySslClientCertificate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.client.certificate")
  @Valid public ConfigNodePropertyDropDown getComAdobeGraniteJettySslClientCertificate() {
    return comAdobeGraniteJettySslClientCertificate;
  }

  @JsonProperty("com.adobe.granite.jetty.ssl.client.certificate")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
