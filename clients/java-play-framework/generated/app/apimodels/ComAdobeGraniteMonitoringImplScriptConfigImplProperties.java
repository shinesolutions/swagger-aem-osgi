package apimodels;

import apimodels.ConfigNodePropertyArray;
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
 * ComAdobeGraniteMonitoringImplScriptConfigImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteMonitoringImplScriptConfigImplProperties   {
  @JsonProperty("script.filename")
  @Valid

  private ConfigNodePropertyString scriptFilename;

  @JsonProperty("script.display")
  @Valid

  private ConfigNodePropertyString scriptDisplay;

  @JsonProperty("script.path")
  @Valid

  private ConfigNodePropertyString scriptPath;

  @JsonProperty("script.platform")
  @Valid

  private ConfigNodePropertyArray scriptPlatform;

  @JsonProperty("interval")
  @Valid

  private ConfigNodePropertyInteger interval;

  @JsonProperty("jmxdomain")
  @Valid

  private ConfigNodePropertyString jmxdomain;

  public ComAdobeGraniteMonitoringImplScriptConfigImplProperties scriptFilename(ConfigNodePropertyString scriptFilename) {
    this.scriptFilename = scriptFilename;
    return this;
  }

   /**
   * Get scriptFilename
   * @return scriptFilename
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

