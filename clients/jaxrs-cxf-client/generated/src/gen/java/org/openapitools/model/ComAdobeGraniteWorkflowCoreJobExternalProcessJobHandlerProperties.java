package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger defaultTimeout = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxTimeout = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger defaultPeriod = null;
 /**
   * Get defaultTimeout
   * @return defaultTimeout
  **/
  @JsonProperty("default.timeout")
  public ConfigNodePropertyInteger getDefaultTimeout() {
    return defaultTimeout;
  }

  public void setDefaultTimeout(ConfigNodePropertyInteger defaultTimeout) {
    this.defaultTimeout = defaultTimeout;
  }

  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties defaultTimeout(ConfigNodePropertyInteger defaultTimeout) {
    this.defaultTimeout = defaultTimeout;
    return this;
  }

 /**
   * Get maxTimeout
   * @return maxTimeout
  **/
  @JsonProperty("max.timeout")
  public ConfigNodePropertyInteger getMaxTimeout() {
    return maxTimeout;
  }

  public void setMaxTimeout(ConfigNodePropertyInteger maxTimeout) {
    this.maxTimeout = maxTimeout;
  }

  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties maxTimeout(ConfigNodePropertyInteger maxTimeout) {
    this.maxTimeout = maxTimeout;
    return this;
  }

 /**
   * Get defaultPeriod
   * @return defaultPeriod
  **/
  @JsonProperty("default.period")
  public ConfigNodePropertyInteger getDefaultPeriod() {
    return defaultPeriod;
  }

  public void setDefaultPeriod(ConfigNodePropertyInteger defaultPeriod) {
    this.defaultPeriod = defaultPeriod;
  }

  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties defaultPeriod(ConfigNodePropertyInteger defaultPeriod) {
    this.defaultPeriod = defaultPeriod;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties {\n");
    
    sb.append("    defaultTimeout: ").append(toIndentedString(defaultTimeout)).append("\n");
    sb.append("    maxTimeout: ").append(toIndentedString(maxTimeout)).append("\n");
    sb.append("    defaultPeriod: ").append(toIndentedString(defaultPeriod)).append("\n");
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

