package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties   {
  @JsonProperty("name")
  @Valid

  private ConfigNodePropertyString name;

  @JsonProperty("username")
  @Valid

  private ConfigNodePropertyString username;

  @JsonProperty("encryptedPassword")
  @Valid

  private ConfigNodePropertyString encryptedPassword;

  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties username(ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  public ConfigNodePropertyString getUsername() {
    return username;
  }

  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties encryptedPassword(ConfigNodePropertyString encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
    return this;
  }

   /**
   * Get encryptedPassword
   * @return encryptedPassword
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

