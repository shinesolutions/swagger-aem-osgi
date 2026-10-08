package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqMailerDefaultMailServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqMailerDefaultMailServiceProperties   {
  @JsonProperty("smtp.host")
  @Valid

  private ConfigNodePropertyString smtpHost;

  @JsonProperty("smtp.port")
  @Valid

  private ConfigNodePropertyInteger smtpPort;

  @JsonProperty("smtp.user")
  @Valid

  private ConfigNodePropertyString smtpUser;

  @JsonProperty("smtp.password")
  @Valid

  private ConfigNodePropertyString smtpPassword;

  @JsonProperty("from.address")
  @Valid

  private ConfigNodePropertyString fromAddress;

  @JsonProperty("smtp.ssl")
  @Valid

  private ConfigNodePropertyBoolean smtpSsl;

  @JsonProperty("smtp.starttls")
  @Valid

  private ConfigNodePropertyBoolean smtpStarttls;

  @JsonProperty("debug.email")
  @Valid

  private ConfigNodePropertyBoolean debugEmail;

  public ComDayCqMailerDefaultMailServiceProperties smtpHost(ConfigNodePropertyString smtpHost) {
    this.smtpHost = smtpHost;
    return this;
  }

   /**
   * Get smtpHost
   * @return smtpHost
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

