package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeGraniteMonitoringImplScriptConfigImplProperties   {
  
  private ConfigNodePropertyString scriptFilename = null;
  private ConfigNodePropertyString scriptDisplay = null;
  private ConfigNodePropertyString scriptPath = null;
  private ConfigNodePropertyArray scriptPlatform = null;
  private ConfigNodePropertyInteger interval = null;
  private ConfigNodePropertyString jmxdomain = null;

  /**
   **/
  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptFilename(ConfigNodePropertyString scriptFilename) {
    this.scriptFilename = scriptFilename;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("script.filename")
  public ConfigNodePropertyString getScriptFilename() {
    return scriptFilename;
  }
  public void setScriptFilename(ConfigNodePropertyString scriptFilename) {
    this.scriptFilename = scriptFilename;
  }

  /**
   **/
  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptDisplay(ConfigNodePropertyString scriptDisplay) {
    this.scriptDisplay = scriptDisplay;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("script.display")
  public ConfigNodePropertyString getScriptDisplay() {
    return scriptDisplay;
  }
  public void setScriptDisplay(ConfigNodePropertyString scriptDisplay) {
    this.scriptDisplay = scriptDisplay;
  }

  /**
   **/
  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptPath(ConfigNodePropertyString scriptPath) {
    this.scriptPath = scriptPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("script.path")
  public ConfigNodePropertyString getScriptPath() {
    return scriptPath;
  }
  public void setScriptPath(ConfigNodePropertyString scriptPath) {
    this.scriptPath = scriptPath;
  }

  /**
   **/
  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptPlatform(ConfigNodePropertyArray scriptPlatform) {
    this.scriptPlatform = scriptPlatform;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("script.platform")
  public ConfigNodePropertyArray getScriptPlatform() {
    return scriptPlatform;
  }
  public void setScriptPlatform(ConfigNodePropertyArray scriptPlatform) {
    this.scriptPlatform = scriptPlatform;
  }

  /**
   **/
  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties interval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("interval")
  public ConfigNodePropertyInteger getInterval() {
    return interval;
  }
  public void setInterval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

  /**
   **/
  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties jmxdomain(ConfigNodePropertyString jmxdomain) {
    this.jmxdomain = jmxdomain;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jmxdomain")
  public ConfigNodePropertyString getJmxdomain() {
    return jmxdomain;
  }
  public void setJmxdomain(ConfigNodePropertyString jmxdomain) {
    this.jmxdomain = jmxdomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteMonitoringImplScriptConfigImplProperties comAdobeGraniteMonitoringImplScriptConfigImplProperties = (ComAdobeGraniteMonitoringImplScriptConfigImplProperties) o;
    return Objects.equals(scriptFilename, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptFilename) &&
        Objects.equals(scriptDisplay, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptDisplay) &&
        Objects.equals(scriptPath, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptPath) &&
        Objects.equals(scriptPlatform, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptPlatform) &&
        Objects.equals(interval, comAdobeGraniteMonitoringImplScriptConfigImplProperties.interval) &&
        Objects.equals(jmxdomain, comAdobeGraniteMonitoringImplScriptConfigImplProperties.jmxdomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptFilename, scriptDisplay, scriptPath, scriptPlatform, interval, jmxdomain);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

