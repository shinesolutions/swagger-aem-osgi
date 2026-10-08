package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath")
  private ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency")
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout")
  private ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients")
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver")
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport")
  private ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls")
  private ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username")
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password")
  private ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;

  /**
   * 
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
   */
  public ConfigNodePropertyArray getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
  }

  /**
   * 
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
   */
  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
  }

  /**
   * 
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
   */
  public ConfigNodePropertyInteger getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
  }

  /**
   * 
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
   */
  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
  }

  /**
   * 
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
   */
  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
  }

  /**
   * 
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
   */
  public ConfigNodePropertyInteger getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport(ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
  }

  /**
   * 
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
   */
  public ConfigNodePropertyBoolean getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls(ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
  }

  /**
   * 
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
   */
  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
  }

  /**
   * 
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
   */
  public ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
  }

  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword(ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
