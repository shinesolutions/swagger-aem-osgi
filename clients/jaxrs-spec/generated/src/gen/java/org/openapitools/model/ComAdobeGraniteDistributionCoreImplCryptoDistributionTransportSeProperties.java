package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties   {
  
  private @Valid ConfigNodePropertyString name = null;
  private @Valid ConfigNodePropertyString username = null;
  private @Valid ConfigNodePropertyString encryptedPassword = null;

  /**
   **/
  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties username(ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  public ConfigNodePropertyString getUsername() {
    return username;
  }
  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  /**
   **/
  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties encryptedPassword(ConfigNodePropertyString encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("encryptedPassword")
  public ConfigNodePropertyString getEncryptedPassword() {
    return encryptedPassword;
  }
  public void setEncryptedPassword(ConfigNodePropertyString encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties = (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties) o;
    return Objects.equals(name, comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.name) &&
        Objects.equals(username, comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.username) &&
        Objects.equals(encryptedPassword, comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.encryptedPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, username, encryptedPassword);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

