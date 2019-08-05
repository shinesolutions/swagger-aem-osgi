package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteMonitoringImplScriptConfigImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString scriptFilename = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString scriptDisplay = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString scriptPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray scriptPlatform = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger interval = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString jmxdomain = null;
 /**
   * Get scriptFilename
   * @return scriptFilename
  **/
  @JsonProperty("script.filename")
  public ConfigNodePropertyString getScriptFilename() {
    return scriptFilename;
  }

  public void setScriptFilename(ConfigNodePropertyString scriptFilename) {
    this.scriptFilename = scriptFilename;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptFilename(ConfigNodePropertyString scriptFilename) {
    this.scriptFilename = scriptFilename;
    return this;
  }

 /**
   * Get scriptDisplay
   * @return scriptDisplay
  **/
  @JsonProperty("script.display")
  public ConfigNodePropertyString getScriptDisplay() {
    return scriptDisplay;
  }

  public void setScriptDisplay(ConfigNodePropertyString scriptDisplay) {
    this.scriptDisplay = scriptDisplay;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptDisplay(ConfigNodePropertyString scriptDisplay) {
    this.scriptDisplay = scriptDisplay;
    return this;
  }

 /**
   * Get scriptPath
   * @return scriptPath
  **/
  @JsonProperty("script.path")
  public ConfigNodePropertyString getScriptPath() {
    return scriptPath;
  }

  public void setScriptPath(ConfigNodePropertyString scriptPath) {
    this.scriptPath = scriptPath;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptPath(ConfigNodePropertyString scriptPath) {
    this.scriptPath = scriptPath;
    return this;
  }

 /**
   * Get scriptPlatform
   * @return scriptPlatform
  **/
  @JsonProperty("script.platform")
  public ConfigNodePropertyArray getScriptPlatform() {
    return scriptPlatform;
  }

  public void setScriptPlatform(ConfigNodePropertyArray scriptPlatform) {
    this.scriptPlatform = scriptPlatform;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptPlatform(ConfigNodePropertyArray scriptPlatform) {
    this.scriptPlatform = scriptPlatform;
    return this;
  }

 /**
   * Get interval
   * @return interval
  **/
  @JsonProperty("interval")
  public ConfigNodePropertyInteger getInterval() {
    return interval;
  }

  public void setInterval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties interval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
    return this;
  }

 /**
   * Get jmxdomain
   * @return jmxdomain
  **/
  @JsonProperty("jmxdomain")
  public ConfigNodePropertyString getJmxdomain() {
    return jmxdomain;
  }

  public void setJmxdomain(ConfigNodePropertyString jmxdomain) {
    this.jmxdomain = jmxdomain;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties jmxdomain(ConfigNodePropertyString jmxdomain) {
    this.jmxdomain = jmxdomain;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteMonitoringImplScriptConfigImplProperties {\n");
    
    sb.append("    scriptFilename: ").append(toIndentedString(scriptFilename)).append("\n");
    sb.append("    scriptDisplay: ").append(toIndentedString(scriptDisplay)).append("\n");
    sb.append("    scriptPath: ").append(toIndentedString(scriptPath)).append("\n");
    sb.append("    scriptPlatform: ").append(toIndentedString(scriptPlatform)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    jmxdomain: ").append(toIndentedString(jmxdomain)).append("\n");
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

