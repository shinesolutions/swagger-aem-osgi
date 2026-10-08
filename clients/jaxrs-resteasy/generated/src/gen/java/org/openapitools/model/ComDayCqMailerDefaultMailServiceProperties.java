package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMailerDefaultMailServiceProperties   {
  
  private ConfigNodePropertyString smtpHost;
  private ConfigNodePropertyInteger smtpPort;
  private ConfigNodePropertyString smtpUser;
  private ConfigNodePropertyString smtpPassword;
  private ConfigNodePropertyString fromAddress;
  private ConfigNodePropertyBoolean smtpSsl;
  private ConfigNodePropertyBoolean smtpStarttls;
  private ConfigNodePropertyBoolean debugEmail;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("smtp.host")
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
  public ConfigNodePropertyBoolean getDebugEmail() {
    return debugEmail;
  }
  public void setDebugEmail(ConfigNodePropertyBoolean debugEmail) {
    this.debugEmail = debugEmail;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

