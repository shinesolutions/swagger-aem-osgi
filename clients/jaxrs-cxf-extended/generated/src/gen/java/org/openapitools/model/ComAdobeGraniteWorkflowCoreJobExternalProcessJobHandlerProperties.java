package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger defaultTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger defaultPeriod;
 /**
  * Get defaultTimeout
  * @return defaultTimeout
  */
  @JsonProperty("default.timeout")
  public ConfigNodePropertyInteger getDefaultTimeout() {
    return defaultTimeout;
  }

  /**
   * Sets the <code>defaultTimeout</code> property.
   */
 public void setDefaultTimeout(ConfigNodePropertyInteger defaultTimeout) {
    this.defaultTimeout = defaultTimeout;
  }

  /**
   * Sets the <code>defaultTimeout</code> property.
   */
  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties defaultTimeout(ConfigNodePropertyInteger defaultTimeout) {
    this.defaultTimeout = defaultTimeout;
    return this;
  }

 /**
  * Get maxTimeout
  * @return maxTimeout
  */
  @JsonProperty("max.timeout")
  public ConfigNodePropertyInteger getMaxTimeout() {
    return maxTimeout;
  }

  /**
   * Sets the <code>maxTimeout</code> property.
   */
 public void setMaxTimeout(ConfigNodePropertyInteger maxTimeout) {
    this.maxTimeout = maxTimeout;
  }

  /**
   * Sets the <code>maxTimeout</code> property.
   */
  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties maxTimeout(ConfigNodePropertyInteger maxTimeout) {
    this.maxTimeout = maxTimeout;
    return this;
  }

 /**
  * Get defaultPeriod
  * @return defaultPeriod
  */
  @JsonProperty("default.period")
  public ConfigNodePropertyInteger getDefaultPeriod() {
    return defaultPeriod;
  }

  /**
   * Sets the <code>defaultPeriod</code> property.
   */
 public void setDefaultPeriod(ConfigNodePropertyInteger defaultPeriod) {
    this.defaultPeriod = defaultPeriod;
  }

  /**
   * Sets the <code>defaultPeriod</code> property.
   */
  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties defaultPeriod(ConfigNodePropertyInteger defaultPeriod) {
    this.defaultPeriod = defaultPeriod;
    return this;
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
    return Objects.equals(this.defaultTimeout, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.defaultTimeout) &&
        Objects.equals(this.maxTimeout, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.maxTimeout) &&
        Objects.equals(this.defaultPeriod, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.defaultPeriod);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

