package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = null;
 /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
  **/
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath")
  public ConfigNodePropertyArray getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
    return this;
  }

 /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
  **/
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency")
  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
    return this;
  }

 /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
  **/
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout")
  public ConfigNodePropertyInteger getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
    return this;
  }

 /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
  **/
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients")
  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
    return this;
  }

 /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
  **/
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver")
  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
    return this;
  }

 /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
  **/
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport")
  public ConfigNodePropertyInteger getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
    return this;
  }

 /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
  **/
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls")
  public ConfigNodePropertyBoolean getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls(ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls(ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
    return this;
  }

 /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
  **/
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username")
  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
    return this;
  }

 /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
  **/
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password")
  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

