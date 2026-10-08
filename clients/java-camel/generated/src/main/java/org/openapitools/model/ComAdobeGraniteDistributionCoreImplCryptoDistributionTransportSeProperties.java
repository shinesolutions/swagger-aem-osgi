package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties
 */

@JsonTypeName("comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties {

  private ConfigNodePropertyString name;

  private ConfigNodePropertyString username;

  private ConfigNodePropertyString encryptedPassword;

  public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
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
   */
  @Valid 
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
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
   */
  @Valid 
  @Schema(name = "encryptedPassword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.name, comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.name) &&
        Objects.equals(this.username, comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.username) &&
        Objects.equals(this.encryptedPassword, comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.encryptedPassword);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

