package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqMailerDefaultMailServiceProperties   {
  
  private ConfigNodePropertyString smtpHost = null;
  private ConfigNodePropertyInteger smtpPort = null;
  private ConfigNodePropertyString smtpUser = null;
  private ConfigNodePropertyString smtpPassword = null;
  private ConfigNodePropertyString fromAddress = null;
  private ConfigNodePropertyBoolean smtpSsl = null;
  private ConfigNodePropertyBoolean smtpStarttls = null;
  private ConfigNodePropertyBoolean debugEmail = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("smtp.host")
  public ConfigNodePropertyString getSmtpHost() {
    return smtpHost;
  }
  public void setSmtpHost(ConfigNodePropertyString smtpHost) {
    this.smtpHost = smtpHost;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("smtp.port")
  public ConfigNodePropertyInteger getSmtpPort() {
    return smtpPort;
  }
  public void setSmtpPort(ConfigNodePropertyInteger smtpPort) {
    this.smtpPort = smtpPort;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("smtp.user")
  public ConfigNodePropertyString getSmtpUser() {
    return smtpUser;
  }
  public void setSmtpUser(ConfigNodePropertyString smtpUser) {
    this.smtpUser = smtpUser;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("smtp.password")
  public ConfigNodePropertyString getSmtpPassword() {
    return smtpPassword;
  }
  public void setSmtpPassword(ConfigNodePropertyString smtpPassword) {
    this.smtpPassword = smtpPassword;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("from.address")
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("smtp.ssl")
  public ConfigNodePropertyBoolean getSmtpSsl() {
    return smtpSsl;
  }
  public void setSmtpSsl(ConfigNodePropertyBoolean smtpSsl) {
    this.smtpSsl = smtpSsl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("smtp.starttls")
  public ConfigNodePropertyBoolean getSmtpStarttls() {
    return smtpStarttls;
  }
  public void setSmtpStarttls(ConfigNodePropertyBoolean smtpStarttls) {
    this.smtpStarttls = smtpStarttls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("debug.email")
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
    return Objects.equals(smtpHost, comDayCqMailerDefaultMailServiceProperties.smtpHost) &&
        Objects.equals(smtpPort, comDayCqMailerDefaultMailServiceProperties.smtpPort) &&
        Objects.equals(smtpUser, comDayCqMailerDefaultMailServiceProperties.smtpUser) &&
        Objects.equals(smtpPassword, comDayCqMailerDefaultMailServiceProperties.smtpPassword) &&
        Objects.equals(fromAddress, comDayCqMailerDefaultMailServiceProperties.fromAddress) &&
        Objects.equals(smtpSsl, comDayCqMailerDefaultMailServiceProperties.smtpSsl) &&
        Objects.equals(smtpStarttls, comDayCqMailerDefaultMailServiceProperties.smtpStarttls) &&
        Objects.equals(debugEmail, comDayCqMailerDefaultMailServiceProperties.debugEmail);
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

