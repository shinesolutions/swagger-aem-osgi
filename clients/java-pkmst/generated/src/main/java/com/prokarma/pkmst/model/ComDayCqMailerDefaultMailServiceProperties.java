package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
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
 * ComDayCqMailerDefaultMailServiceProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqMailerDefaultMailServiceProperties   {
  @JsonProperty("smtp.host")
  private ConfigNodePropertyString smtpHost = null;

  @JsonProperty("smtp.port")
  private ConfigNodePropertyInteger smtpPort = null;

  @JsonProperty("smtp.user")
  private ConfigNodePropertyString smtpUser = null;

  @JsonProperty("smtp.password")
  private ConfigNodePropertyString smtpPassword = null;

  @JsonProperty("from.address")
  private ConfigNodePropertyString fromAddress = null;

  @JsonProperty("smtp.ssl")
  private ConfigNodePropertyBoolean smtpSsl = null;

  @JsonProperty("smtp.starttls")
  private ConfigNodePropertyBoolean smtpStarttls = null;

  @JsonProperty("debug.email")
  private ConfigNodePropertyBoolean debugEmail = null;

  public ComDayCqMailerDefaultMailServiceProperties smtpHost(ConfigNodePropertyString smtpHost) {
    this.smtpHost = smtpHost;
    return this;
  }

   /**
   * Get smtpHost
   * @return smtpHost
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSmtpHost() {
    return smtpHost;
  }

  public void setSmtpHost(ConfigNodePropertyString smtpHost) {
    this.smtpHost = smtpHost;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpPort(ConfigNodePropertyInteger smtpPort) {
    this.smtpPort = smtpPort;
    return this;
  }

   /**
   * Get smtpPort
   * @return smtpPort
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSmtpPort() {
    return smtpPort;
  }

  public void setSmtpPort(ConfigNodePropertyInteger smtpPort) {
    this.smtpPort = smtpPort;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpUser(ConfigNodePropertyString smtpUser) {
    this.smtpUser = smtpUser;
    return this;
  }

   /**
   * Get smtpUser
   * @return smtpUser
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSmtpUser() {
    return smtpUser;
  }

  public void setSmtpUser(ConfigNodePropertyString smtpUser) {
    this.smtpUser = smtpUser;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpPassword(ConfigNodePropertyString smtpPassword) {
    this.smtpPassword = smtpPassword;
    return this;
  }

   /**
   * Get smtpPassword
   * @return smtpPassword
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSmtpPassword() {
    return smtpPassword;
  }

  public void setSmtpPassword(ConfigNodePropertyString smtpPassword) {
    this.smtpPassword = smtpPassword;
  }

  public ComDayCqMailerDefaultMailServiceProperties fromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Get fromAddress
   * @return fromAddress
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpSsl(ConfigNodePropertyBoolean smtpSsl) {
    this.smtpSsl = smtpSsl;
    return this;
  }

   /**
   * Get smtpSsl
   * @return smtpSsl
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSmtpSsl() {
    return smtpSsl;
  }

  public void setSmtpSsl(ConfigNodePropertyBoolean smtpSsl) {
    this.smtpSsl = smtpSsl;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpStarttls(ConfigNodePropertyBoolean smtpStarttls) {
    this.smtpStarttls = smtpStarttls;
    return this;
  }

   /**
   * Get smtpStarttls
   * @return smtpStarttls
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSmtpStarttls() {
    return smtpStarttls;
  }

  public void setSmtpStarttls(ConfigNodePropertyBoolean smtpStarttls) {
    this.smtpStarttls = smtpStarttls;
  }

  public ComDayCqMailerDefaultMailServiceProperties debugEmail(ConfigNodePropertyBoolean debugEmail) {
    this.debugEmail = debugEmail;
    return this;
  }

   /**
   * Get debugEmail
   * @return debugEmail
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getDebugEmail() {
    return debugEmail;
  }

  public void setDebugEmail(ConfigNodePropertyBoolean debugEmail) {
    this.debugEmail = debugEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMailerDefaultMailServiceProperties comDayCqMailerDefaultMailServiceProperties = (ComDayCqMailerDefaultMailServiceProperties) o;
    return Objects.equals(this.smtpHost, comDayCqMailerDefaultMailServiceProperties.smtpHost) &&
        Objects.equals(this.smtpPort, comDayCqMailerDefaultMailServiceProperties.smtpPort) &&
        Objects.equals(this.smtpUser, comDayCqMailerDefaultMailServiceProperties.smtpUser) &&
        Objects.equals(this.smtpPassword, comDayCqMailerDefaultMailServiceProperties.smtpPassword) &&
        Objects.equals(this.fromAddress, comDayCqMailerDefaultMailServiceProperties.fromAddress) &&
        Objects.equals(this.smtpSsl, comDayCqMailerDefaultMailServiceProperties.smtpSsl) &&
        Objects.equals(this.smtpStarttls, comDayCqMailerDefaultMailServiceProperties.smtpStarttls) &&
        Objects.equals(this.debugEmail, comDayCqMailerDefaultMailServiceProperties.debugEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smtpHost, smtpPort, smtpUser, smtpPassword, fromAddress, smtpSsl, smtpStarttls, debugEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMailerDefaultMailServiceProperties {\n");
    
    sb.append("    smtpHost: ").append(toIndentedString(smtpHost)).append("\n");
    sb.append("    smtpPort: ").append(toIndentedString(smtpPort)).append("\n");
    sb.append("    smtpUser: ").append(toIndentedString(smtpUser)).append("\n");
    sb.append("    smtpPassword: ").append(toIndentedString(smtpPassword)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    smtpSsl: ").append(toIndentedString(smtpSsl)).append("\n");
    sb.append("    smtpStarttls: ").append(toIndentedString(smtpStarttls)).append("\n");
    sb.append("    debugEmail: ").append(toIndentedString(debugEmail)).append("\n");
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

