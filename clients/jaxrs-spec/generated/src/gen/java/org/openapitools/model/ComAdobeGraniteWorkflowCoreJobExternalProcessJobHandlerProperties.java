package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties   {
  
  private @Valid ConfigNodePropertyInteger defaultTimeout = null;
  private @Valid ConfigNodePropertyInteger maxTimeout = null;
  private @Valid ConfigNodePropertyInteger defaultPeriod = null;

  /**
   **/
  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties defaultTimeout(ConfigNodePropertyInteger defaultTimeout) {
    this.defaultTimeout = defaultTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default.timeout")
  public ConfigNodePropertyInteger getDefaultTimeout() {
    return defaultTimeout;
  }
  public void setDefaultTimeout(ConfigNodePropertyInteger defaultTimeout) {
    this.defaultTimeout = defaultTimeout;
  }

  /**
   **/
  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties maxTimeout(ConfigNodePropertyInteger maxTimeout) {
    this.maxTimeout = maxTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max.timeout")
  public ConfigNodePropertyInteger getMaxTimeout() {
    return maxTimeout;
  }
  public void setMaxTimeout(ConfigNodePropertyInteger maxTimeout) {
    this.maxTimeout = maxTimeout;
  }

  /**
   **/
  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties defaultPeriod(ConfigNodePropertyInteger defaultPeriod) {
    this.defaultPeriod = defaultPeriod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default.period")
  public ConfigNodePropertyInteger getDefaultPeriod() {
    return defaultPeriod;
  }
  public void setDefaultPeriod(ConfigNodePropertyInteger defaultPeriod) {
    this.defaultPeriod = defaultPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

