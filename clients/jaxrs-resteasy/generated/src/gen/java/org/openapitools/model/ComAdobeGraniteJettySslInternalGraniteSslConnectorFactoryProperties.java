package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties   {
  
  private ConfigNodePropertyInteger comAdobeGraniteJettySslPort = null;
  private ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser = null;
  private ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword = null;
  private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded = null;
  private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded = null;
  private ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.port")
  public ConfigNodePropertyInteger getComAdobeGraniteJettySslPort() {
    return comAdobeGraniteJettySslPort;
  }
  public void setComAdobeGraniteJettySslPort(ConfigNodePropertyInteger comAdobeGraniteJettySslPort) {
    this.comAdobeGraniteJettySslPort = comAdobeGraniteJettySslPort;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.user")
  public ConfigNodePropertyString getComAdobeGraniteJettySslKeystoreUser() {
    return comAdobeGraniteJettySslKeystoreUser;
  }
  public void setComAdobeGraniteJettySslKeystoreUser(ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser) {
    this.comAdobeGraniteJettySslKeystoreUser = comAdobeGraniteJettySslKeystoreUser;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.keystore.password")
  public ConfigNodePropertyString getComAdobeGraniteJettySslKeystorePassword() {
    return comAdobeGraniteJettySslKeystorePassword;
  }
  public void setComAdobeGraniteJettySslKeystorePassword(ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword) {
    this.comAdobeGraniteJettySslKeystorePassword = comAdobeGraniteJettySslKeystorePassword;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.excluded")
  public ConfigNodePropertyArray getComAdobeGraniteJettySslCiphersuitesExcluded() {
    return comAdobeGraniteJettySslCiphersuitesExcluded;
  }
  public void setComAdobeGraniteJettySslCiphersuitesExcluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded) {
    this.comAdobeGraniteJettySslCiphersuitesExcluded = comAdobeGraniteJettySslCiphersuitesExcluded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.included")
  public ConfigNodePropertyArray getComAdobeGraniteJettySslCiphersuitesIncluded() {
    return comAdobeGraniteJettySslCiphersuitesIncluded;
  }
  public void setComAdobeGraniteJettySslCiphersuitesIncluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded) {
    this.comAdobeGraniteJettySslCiphersuitesIncluded = comAdobeGraniteJettySslCiphersuitesIncluded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.jetty.ssl.client.certificate")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

