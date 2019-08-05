package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString username = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString encryptedPassword = null;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  @JsonProperty("username")
  public ConfigNodePropertyString getUsername() {
    return username;
  }

  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties username(ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

 /**
   * Get encryptedPassword
   * @return encryptedPassword
  **/
  @JsonProperty("encryptedPassword")
  public ConfigNodePropertyString getEncryptedPassword() {
    return encryptedPassword;
  }

  public void setEncryptedPassword(ConfigNodePropertyString encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
  }

  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties encryptedPassword(ConfigNodePropertyString encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    encryptedPassword: ").append(toIndentedString(encryptedPassword)).append("\n");
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

