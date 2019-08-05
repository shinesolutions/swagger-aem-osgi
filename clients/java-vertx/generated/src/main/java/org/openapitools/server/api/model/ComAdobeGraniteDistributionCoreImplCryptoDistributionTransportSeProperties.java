package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString username = null;
  private ConfigNodePropertyString encryptedPassword = null;

  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties () {

  }

  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties (ConfigNodePropertyString name, ConfigNodePropertyString username, ConfigNodePropertyString encryptedPassword) {
    this.name = name;
    this.username = username;
    this.encryptedPassword = encryptedPassword;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("username")
  public ConfigNodePropertyString getUsername() {
    return username;
  }
  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

    
  @JsonProperty("encryptedPassword")
  public ConfigNodePropertyString getEncryptedPassword() {
    return encryptedPassword;
  }
  public void setEncryptedPassword(ConfigNodePropertyString encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
