package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
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

  /**
   **/
  public ComDayCqMailerDefaultMailServiceProperties smtpHost(ConfigNodePropertyString smtpHost) {
    this.smtpHost = smtpHost;
    return this;
  }

  
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
  public ComDayCqMailerDefaultMailServiceProperties smtpPort(ConfigNodePropertyInteger smtpPort) {
    this.smtpPort = smtpPort;
    return this;
  }

  
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
  public ComDayCqMailerDefaultMailServiceProperties smtpUser(ConfigNodePropertyString smtpUser) {
    this.smtpUser = smtpUser;
    return this;
  }

  
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
  public ComDayCqMailerDefaultMailServiceProperties smtpPassword(ConfigNodePropertyString smtpPassword) {
    this.smtpPassword = smtpPassword;
    return this;
  }

  
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
  public ComDayCqMailerDefaultMailServiceProperties fromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

  
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
  public ComDayCqMailerDefaultMailServiceProperties smtpSsl(ConfigNodePropertyBoolean smtpSsl) {
    this.smtpSsl = smtpSsl;
    return this;
  }

  
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
  public ComDayCqMailerDefaultMailServiceProperties smtpStarttls(ConfigNodePropertyBoolean smtpStarttls) {
    this.smtpStarttls = smtpStarttls;
    return this;
  }

  
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
  public ComDayCqMailerDefaultMailServiceProperties debugEmail(ConfigNodePropertyBoolean debugEmail) {
    this.debugEmail = debugEmail;
    return this;
  }

  
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

