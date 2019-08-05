package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqDamCoreImplDamEventRecorderImplProperties   {
  

  private ConfigNodePropertyString eventFilter = null;

  private ConfigNodePropertyInteger eventQueueLength = null;

  private ConfigNodePropertyBoolean eventrecorderEnabled = null;

  private ConfigNodePropertyArray eventrecorderBlacklist = null;

  private ConfigNodePropertyDropDown eventrecorderEventtypes = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("event.queue.length")
  public ConfigNodePropertyInteger getEventQueueLength() {
    return eventQueueLength;
  }
  public void setEventQueueLength(ConfigNodePropertyInteger eventQueueLength) {
    this.eventQueueLength = eventQueueLength;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eventrecorder.enabled")
  public ConfigNodePropertyBoolean getEventrecorderEnabled() {
    return eventrecorderEnabled;
  }
  public void setEventrecorderEnabled(ConfigNodePropertyBoolean eventrecorderEnabled) {
    this.eventrecorderEnabled = eventrecorderEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eventrecorder.blacklist")
  public ConfigNodePropertyArray getEventrecorderBlacklist() {
    return eventrecorderBlacklist;
  }
  public void setEventrecorderBlacklist(ConfigNodePropertyArray eventrecorderBlacklist) {
    this.eventrecorderBlacklist = eventrecorderBlacklist;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eventrecorder.eventtypes")
  public ConfigNodePropertyDropDown getEventrecorderEventtypes() {
    return eventrecorderEventtypes;
  }
  public void setEventrecorderEventtypes(ConfigNodePropertyDropDown eventrecorderEventtypes) {
    this.eventrecorderEventtypes = eventrecorderEventtypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplDamEventRecorderImplProperties comDayCqDamCoreImplDamEventRecorderImplProperties = (ComDayCqDamCoreImplDamEventRecorderImplProperties) o;
    return Objects.equals(eventFilter, comDayCqDamCoreImplDamEventRecorderImplProperties.eventFilter) &&
        Objects.equals(eventQueueLength, comDayCqDamCoreImplDamEventRecorderImplProperties.eventQueueLength) &&
        Objects.equals(eventrecorderEnabled, comDayCqDamCoreImplDamEventRecorderImplProperties.eventrecorderEnabled) &&
        Objects.equals(eventrecorderBlacklist, comDayCqDamCoreImplDamEventRecorderImplProperties.eventrecorderBlacklist) &&
        Objects.equals(eventrecorderEventtypes, comDayCqDamCoreImplDamEventRecorderImplProperties.eventrecorderEventtypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, eventQueueLength, eventrecorderEnabled, eventrecorderBlacklist, eventrecorderEventtypes);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

