package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties   {
  
  private ConfigNodePropertyInteger defaultTimeout;
  private ConfigNodePropertyInteger maxTimeout;
  private ConfigNodePropertyInteger defaultPeriod;

  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties () {

  }

  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties (ConfigNodePropertyInteger defaultTimeout, ConfigNodePropertyInteger maxTimeout, ConfigNodePropertyInteger defaultPeriod) {
    this.defaultTimeout = defaultTimeout;
    this.maxTimeout = maxTimeout;
    this.defaultPeriod = defaultPeriod;
  }

    
  @JsonProperty("default.timeout")
  public ConfigNodePropertyInteger getDefaultTimeout() {
    return defaultTimeout;
  }
  public void setDefaultTimeout(ConfigNodePropertyInteger defaultTimeout) {
    this.defaultTimeout = defaultTimeout;
  }

    
  @JsonProperty("max.timeout")
  public ConfigNodePropertyInteger getMaxTimeout() {
    return maxTimeout;
  }
  public void setMaxTimeout(ConfigNodePropertyInteger maxTimeout) {
    this.maxTimeout = maxTimeout;
  }

    
  @JsonProperty("default.period")
  public ConfigNodePropertyInteger getDefaultPeriod() {
    return defaultPeriod;
  }
  public void setDefaultPeriod(ConfigNodePropertyInteger defaultPeriod) {
    this.defaultPeriod = defaultPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties = (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties) o;
    return Objects.equals(defaultTimeout, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.defaultTimeout) &&
        Objects.equals(maxTimeout, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.maxTimeout) &&
        Objects.equals(defaultPeriod, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.defaultPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTimeout, maxTimeout, defaultPeriod);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
