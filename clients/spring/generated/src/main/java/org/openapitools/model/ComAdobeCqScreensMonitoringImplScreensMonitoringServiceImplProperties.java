package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties   {
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath")
  private ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = null;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency")
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = null;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout")
  private ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = null;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients")
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = null;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver")
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = null;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport")
  private ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = null;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls")
  private ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = null;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username")
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = null;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password")
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = null;

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls(ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls(ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties = (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties) o;
    return Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties {\n");
    
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword)).append("\n");
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

