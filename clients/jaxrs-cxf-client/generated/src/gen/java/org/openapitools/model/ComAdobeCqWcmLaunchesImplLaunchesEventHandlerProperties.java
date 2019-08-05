package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString eventFilter = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification = null;
 /**
   * Get eventFilter
   * @return eventFilter
  **/
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

 /**
   * Get launchesEventhandlerThreadpoolMaxsize
   * @return launchesEventhandlerThreadpoolMaxsize
  **/
  @JsonProperty("launches.eventhandler.threadpool.maxsize")
  public ConfigNodePropertyInteger getLaunchesEventhandlerThreadpoolMaxsize() {
    return launchesEventhandlerThreadpoolMaxsize;
  }

  public void setLaunchesEventhandlerThreadpoolMaxsize(ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize) {
    this.launchesEventhandlerThreadpoolMaxsize = launchesEventhandlerThreadpoolMaxsize;
  }

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerThreadpoolMaxsize(ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize) {
    this.launchesEventhandlerThreadpoolMaxsize = launchesEventhandlerThreadpoolMaxsize;
    return this;
  }

 /**
   * Get launchesEventhandlerThreadpoolPriority
   * @return launchesEventhandlerThreadpoolPriority
  **/
  @JsonProperty("launches.eventhandler.threadpool.priority")
  public ConfigNodePropertyDropDown getLaunchesEventhandlerThreadpoolPriority() {
    return launchesEventhandlerThreadpoolPriority;
  }

  public void setLaunchesEventhandlerThreadpoolPriority(ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority) {
    this.launchesEventhandlerThreadpoolPriority = launchesEventhandlerThreadpoolPriority;
  }

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerThreadpoolPriority(ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority) {
    this.launchesEventhandlerThreadpoolPriority = launchesEventhandlerThreadpoolPriority;
    return this;
  }

 /**
   * Get launchesEventhandlerUpdatelastmodification
   * @return launchesEventhandlerUpdatelastmodification
  **/
  @JsonProperty("launches.eventhandler.updatelastmodification")
  public ConfigNodePropertyBoolean getLaunchesEventhandlerUpdatelastmodification() {
    return launchesEventhandlerUpdatelastmodification;
  }

  public void setLaunchesEventhandlerUpdatelastmodification(ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification) {
    this.launchesEventhandlerUpdatelastmodification = launchesEventhandlerUpdatelastmodification;
  }

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerUpdatelastmodification(ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification) {
    this.launchesEventhandlerUpdatelastmodification = launchesEventhandlerUpdatelastmodification;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

