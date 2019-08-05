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
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties   {
  @JsonProperty("event.filter")
  private ConfigNodePropertyString eventFilter = null;

  @JsonProperty("launches.eventhandler.threadpool.maxsize")
  private ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize = null;

  @JsonProperty("launches.eventhandler.threadpool.priority")
  private ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority = null;

  @JsonProperty("launches.eventhandler.updatelastmodification")
  private ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification = null;

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  /**
   * Get eventFilter
   * @return eventFilter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerThreadpoolMaxsize(ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize) {
    this.launchesEventhandlerThreadpoolMaxsize = launchesEventhandlerThreadpoolMaxsize;
    return this;
  }

  /**
   * Get launchesEventhandlerThreadpoolMaxsize
   * @return launchesEventhandlerThreadpoolMaxsize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getLaunchesEventhandlerThreadpoolMaxsize() {
    return launchesEventhandlerThreadpoolMaxsize;
  }

  public void setLaunchesEventhandlerThreadpoolMaxsize(ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize) {
    this.launchesEventhandlerThreadpoolMaxsize = launchesEventhandlerThreadpoolMaxsize;
  }

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerThreadpoolPriority(ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority) {
    this.launchesEventhandlerThreadpoolPriority = launchesEventhandlerThreadpoolPriority;
    return this;
  }

  /**
   * Get launchesEventhandlerThreadpoolPriority
   * @return launchesEventhandlerThreadpoolPriority
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyDropDown getLaunchesEventhandlerThreadpoolPriority() {
    return launchesEventhandlerThreadpoolPriority;
  }

  public void setLaunchesEventhandlerThreadpoolPriority(ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority) {
    this.launchesEventhandlerThreadpoolPriority = launchesEventhandlerThreadpoolPriority;
  }

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerUpdatelastmodification(ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification) {
    this.launchesEventhandlerUpdatelastmodification = launchesEventhandlerUpdatelastmodification;
    return this;
  }

  /**
   * Get launchesEventhandlerUpdatelastmodification
   * @return launchesEventhandlerUpdatelastmodification
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

