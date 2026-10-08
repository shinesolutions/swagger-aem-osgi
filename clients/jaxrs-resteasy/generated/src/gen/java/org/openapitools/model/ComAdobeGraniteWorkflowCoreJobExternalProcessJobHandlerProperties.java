package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties   {
  
  private ConfigNodePropertyInteger defaultTimeout;
  private ConfigNodePropertyInteger maxTimeout;
  private ConfigNodePropertyInteger defaultPeriod;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("default.timeout")
  @Valid
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
  @Valid
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
  @Valid
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

