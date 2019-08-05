package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
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

public class ComDayCqDamCoreImplDamEventRecorderImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString eventFilter = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger eventQueueLength = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean eventrecorderEnabled = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray eventrecorderBlacklist = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown eventrecorderEventtypes = null;
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

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

 /**
   * Get eventQueueLength
   * @return eventQueueLength
  **/
  @JsonProperty("event.queue.length")
  public ConfigNodePropertyInteger getEventQueueLength() {
    return eventQueueLength;
  }

  public void setEventQueueLength(ConfigNodePropertyInteger eventQueueLength) {
    this.eventQueueLength = eventQueueLength;
  }

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventQueueLength(ConfigNodePropertyInteger eventQueueLength) {
    this.eventQueueLength = eventQueueLength;
    return this;
  }

 /**
   * Get eventrecorderEnabled
   * @return eventrecorderEnabled
  **/
  @JsonProperty("eventrecorder.enabled")
  public ConfigNodePropertyBoolean getEventrecorderEnabled() {
    return eventrecorderEnabled;
  }

  public void setEventrecorderEnabled(ConfigNodePropertyBoolean eventrecorderEnabled) {
    this.eventrecorderEnabled = eventrecorderEnabled;
  }

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderEnabled(ConfigNodePropertyBoolean eventrecorderEnabled) {
    this.eventrecorderEnabled = eventrecorderEnabled;
    return this;
  }

 /**
   * Get eventrecorderBlacklist
   * @return eventrecorderBlacklist
  **/
  @JsonProperty("eventrecorder.blacklist")
  public ConfigNodePropertyArray getEventrecorderBlacklist() {
    return eventrecorderBlacklist;
  }

  public void setEventrecorderBlacklist(ConfigNodePropertyArray eventrecorderBlacklist) {
    this.eventrecorderBlacklist = eventrecorderBlacklist;
  }

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderBlacklist(ConfigNodePropertyArray eventrecorderBlacklist) {
    this.eventrecorderBlacklist = eventrecorderBlacklist;
    return this;
  }

 /**
   * Get eventrecorderEventtypes
   * @return eventrecorderEventtypes
  **/
  @JsonProperty("eventrecorder.eventtypes")
  public ConfigNodePropertyDropDown getEventrecorderEventtypes() {
    return eventrecorderEventtypes;
  }

  public void setEventrecorderEventtypes(ConfigNodePropertyDropDown eventrecorderEventtypes) {
    this.eventrecorderEventtypes = eventrecorderEventtypes;
  }

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderEventtypes(ConfigNodePropertyDropDown eventrecorderEventtypes) {
    this.eventrecorderEventtypes = eventrecorderEventtypes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplDamEventRecorderImplProperties {\n");
    
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    eventQueueLength: ").append(toIndentedString(eventQueueLength)).append("\n");
    sb.append("    eventrecorderEnabled: ").append(toIndentedString(eventrecorderEnabled)).append("\n");
    sb.append("    eventrecorderBlacklist: ").append(toIndentedString(eventrecorderBlacklist)).append("\n");
    sb.append("    eventrecorderEventtypes: ").append(toIndentedString(eventrecorderEventtypes)).append("\n");
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

