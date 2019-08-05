package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties   {
  

  private ConfigNodePropertyInteger defaultTimeout = null;

  private ConfigNodePropertyInteger maxTimeout = null;

  private ConfigNodePropertyInteger defaultPeriod = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

