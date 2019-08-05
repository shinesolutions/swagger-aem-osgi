package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties   {
  
  private @Valid ConfigNodePropertyString eventFilter = null;
  private @Valid ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize = null;
  private @Valid ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority = null;
  private @Valid ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification = null;

  /**
   **/
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
   **/
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
   **/
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
   **/
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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

