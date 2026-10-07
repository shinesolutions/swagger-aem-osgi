package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeGraniteMonitoringImplScriptConfigImplProperties   {
  
  private ConfigNodePropertyString scriptFilename;
  private ConfigNodePropertyString scriptDisplay;
  private ConfigNodePropertyString scriptPath;
  private ConfigNodePropertyArray scriptPlatform;
  private ConfigNodePropertyInteger interval;
  private ConfigNodePropertyString jmxdomain;

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties () {

  }

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties (ConfigNodePropertyString scriptFilename, ConfigNodePropertyString scriptDisplay, ConfigNodePropertyString scriptPath, ConfigNodePropertyArray scriptPlatform, ConfigNodePropertyInteger interval, ConfigNodePropertyString jmxdomain) {
    this.scriptFilename = scriptFilename;
    this.scriptDisplay = scriptDisplay;
    this.scriptPath = scriptPath;
    this.scriptPlatform = scriptPlatform;
    this.interval = interval;
    this.jmxdomain = jmxdomain;
  }

    
  @JsonProperty("script.filename")
  public ConfigNodePropertyString getScriptFilename() {
    return scriptFilename;
  }
  public void setScriptFilename(ConfigNodePropertyString scriptFilename) {
    this.scriptFilename = scriptFilename;
  }

    
  @JsonProperty("script.display")
  public ConfigNodePropertyString getScriptDisplay() {
    return scriptDisplay;
  }
  public void setScriptDisplay(ConfigNodePropertyString scriptDisplay) {
    this.scriptDisplay = scriptDisplay;
  }

    
  @JsonProperty("script.path")
  public ConfigNodePropertyString getScriptPath() {
    return scriptPath;
  }
  public void setScriptPath(ConfigNodePropertyString scriptPath) {
    this.scriptPath = scriptPath;
  }

    
  @JsonProperty("script.platform")
  public ConfigNodePropertyArray getScriptPlatform() {
    return scriptPlatform;
  }
  public void setScriptPlatform(ConfigNodePropertyArray scriptPlatform) {
    this.scriptPlatform = scriptPlatform;
  }

    
  @JsonProperty("interval")
  public ConfigNodePropertyInteger getInterval() {
    return interval;
  }
  public void setInterval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

    
  @JsonProperty("jmxdomain")
  public ConfigNodePropertyString getJmxdomain() {
    return jmxdomain;
  }
  public void setJmxdomain(ConfigNodePropertyString jmxdomain) {
    this.jmxdomain = jmxdomain;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
