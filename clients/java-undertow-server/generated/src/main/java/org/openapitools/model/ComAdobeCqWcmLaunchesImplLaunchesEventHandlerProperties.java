/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties   {
  
  private ConfigNodePropertyString eventFilter;
  private ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize;
  private ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority;
  private ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification;

  /**
   */
  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }
  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   */
  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerThreadpoolMaxsize(ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize) {
    this.launchesEventhandlerThreadpoolMaxsize = launchesEventhandlerThreadpoolMaxsize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("launches.eventhandler.threadpool.maxsize")
  public ConfigNodePropertyInteger getLaunchesEventhandlerThreadpoolMaxsize() {
    return launchesEventhandlerThreadpoolMaxsize;
  }
  public void setLaunchesEventhandlerThreadpoolMaxsize(ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize) {
    this.launchesEventhandlerThreadpoolMaxsize = launchesEventhandlerThreadpoolMaxsize;
  }

  /**
   */
  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerThreadpoolPriority(ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority) {
    this.launchesEventhandlerThreadpoolPriority = launchesEventhandlerThreadpoolPriority;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("launches.eventhandler.threadpool.priority")
  public ConfigNodePropertyDropDown getLaunchesEventhandlerThreadpoolPriority() {
    return launchesEventhandlerThreadpoolPriority;
  }
  public void setLaunchesEventhandlerThreadpoolPriority(ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority) {
    this.launchesEventhandlerThreadpoolPriority = launchesEventhandlerThreadpoolPriority;
  }

  /**
   */
  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerUpdatelastmodification(ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification) {
    this.launchesEventhandlerUpdatelastmodification = launchesEventhandlerUpdatelastmodification;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("launches.eventhandler.updatelastmodification")
  public ConfigNodePropertyBoolean getLaunchesEventhandlerUpdatelastmodification() {
    return launchesEventhandlerUpdatelastmodification;
  }
  public void setLaunchesEventhandlerUpdatelastmodification(ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification) {
    this.launchesEventhandlerUpdatelastmodification = launchesEventhandlerUpdatelastmodification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties = (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties) o;
    return Objects.equals(eventFilter, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.eventFilter) &&
        Objects.equals(launchesEventhandlerThreadpoolMaxsize, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.launchesEventhandlerThreadpoolMaxsize) &&
        Objects.equals(launchesEventhandlerThreadpoolPriority, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.launchesEventhandlerThreadpoolPriority) &&
        Objects.equals(launchesEventhandlerUpdatelastmodification, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.launchesEventhandlerUpdatelastmodification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, launchesEventhandlerThreadpoolMaxsize, launchesEventhandlerThreadpoolPriority, launchesEventhandlerUpdatelastmodification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties {\n");
    
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    launchesEventhandlerThreadpoolMaxsize: ").append(toIndentedString(launchesEventhandlerThreadpoolMaxsize)).append("\n");
    sb.append("    launchesEventhandlerThreadpoolPriority: ").append(toIndentedString(launchesEventhandlerThreadpoolPriority)).append("\n");
    sb.append("    launchesEventhandlerUpdatelastmodification: ").append(toIndentedString(launchesEventhandlerUpdatelastmodification)).append("\n");
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

