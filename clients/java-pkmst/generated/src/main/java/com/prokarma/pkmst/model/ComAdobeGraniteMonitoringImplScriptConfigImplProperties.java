package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteMonitoringImplScriptConfigImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteMonitoringImplScriptConfigImplProperties   {
  @JsonProperty("script.filename")
  private ConfigNodePropertyString scriptFilename = null;

  @JsonProperty("script.display")
  private ConfigNodePropertyString scriptDisplay = null;

  @JsonProperty("script.path")
  private ConfigNodePropertyString scriptPath = null;

  @JsonProperty("script.platform")
  private ConfigNodePropertyArray scriptPlatform = null;

  @JsonProperty("interval")
  private ConfigNodePropertyInteger interval = null;

  @JsonProperty("jmxdomain")
  private ConfigNodePropertyString jmxdomain = null;

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptFilename(ConfigNodePropertyString scriptFilename) {
    this.scriptFilename = scriptFilename;
    return this;
  }

   /**
   * Get scriptFilename
   * @return scriptFilename
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getScriptFilename() {
    return scriptFilename;
  }

  public void setScriptFilename(ConfigNodePropertyString scriptFilename) {
    this.scriptFilename = scriptFilename;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptDisplay(ConfigNodePropertyString scriptDisplay) {
    this.scriptDisplay = scriptDisplay;
    return this;
  }

   /**
   * Get scriptDisplay
   * @return scriptDisplay
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getScriptDisplay() {
    return scriptDisplay;
  }

  public void setScriptDisplay(ConfigNodePropertyString scriptDisplay) {
    this.scriptDisplay = scriptDisplay;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptPath(ConfigNodePropertyString scriptPath) {
    this.scriptPath = scriptPath;
    return this;
  }

   /**
   * Get scriptPath
   * @return scriptPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getScriptPath() {
    return scriptPath;
  }

  public void setScriptPath(ConfigNodePropertyString scriptPath) {
    this.scriptPath = scriptPath;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptPlatform(ConfigNodePropertyArray scriptPlatform) {
    this.scriptPlatform = scriptPlatform;
    return this;
  }

   /**
   * Get scriptPlatform
   * @return scriptPlatform
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getScriptPlatform() {
    return scriptPlatform;
  }

  public void setScriptPlatform(ConfigNodePropertyArray scriptPlatform) {
    this.scriptPlatform = scriptPlatform;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties interval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getInterval() {
    return interval;
  }

  public void setInterval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties jmxdomain(ConfigNodePropertyString jmxdomain) {
    this.jmxdomain = jmxdomain;
    return this;
  }

   /**
   * Get jmxdomain
   * @return jmxdomain
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.scriptFilename, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptFilename) &&
        Objects.equals(this.scriptDisplay, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptDisplay) &&
        Objects.equals(this.scriptPath, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptPath) &&
        Objects.equals(this.scriptPlatform, comAdobeGraniteMonitoringImplScriptConfigImplProperties.scriptPlatform) &&
        Objects.equals(this.interval, comAdobeGraniteMonitoringImplScriptConfigImplProperties.interval) &&
        Objects.equals(this.jmxdomain, comAdobeGraniteMonitoringImplScriptConfigImplProperties.jmxdomain);
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
