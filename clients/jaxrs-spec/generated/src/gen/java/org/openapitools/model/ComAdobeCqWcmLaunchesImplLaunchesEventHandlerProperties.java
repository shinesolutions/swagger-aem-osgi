package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties   {
  private ConfigNodePropertyString eventFilter;
  private ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize;
  private ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority;
  private ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification;

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties() {
  }

  /**
   **/
  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event.filter")
  @Valid public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  @JsonProperty("event.filter")
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
  @Valid public ConfigNodePropertyInteger getLaunchesEventhandlerThreadpoolMaxsize() {
    return launchesEventhandlerThreadpoolMaxsize;
  }

  @JsonProperty("launches.eventhandler.threadpool.maxsize")
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
  @Valid public ConfigNodePropertyDropDown getLaunchesEventhandlerThreadpoolPriority() {
    return launchesEventhandlerThreadpoolPriority;
  }

  @JsonProperty("launches.eventhandler.threadpool.priority")
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
  @Valid public ConfigNodePropertyBoolean getLaunchesEventhandlerUpdatelastmodification() {
    return launchesEventhandlerUpdatelastmodification;
  }

  @JsonProperty("launches.eventhandler.updatelastmodification")
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
    return Objects.equals(this.eventFilter, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.eventFilter) &&
        Objects.equals(this.launchesEventhandlerThreadpoolMaxsize, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.launchesEventhandlerThreadpoolMaxsize) &&
        Objects.equals(this.launchesEventhandlerThreadpoolPriority, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.launchesEventhandlerThreadpoolPriority) &&
        Objects.equals(this.launchesEventhandlerUpdatelastmodification, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.launchesEventhandlerUpdatelastmodification);
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
