package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqDamCoreImplDamEventRecorderImplProperties   {
  @JsonProperty("event.filter")
  private ConfigNodePropertyString eventFilter = null;

  @JsonProperty("event.queue.length")
  private ConfigNodePropertyInteger eventQueueLength = null;

  @JsonProperty("eventrecorder.enabled")
  private ConfigNodePropertyBoolean eventrecorderEnabled = null;

  @JsonProperty("eventrecorder.blacklist")
  private ConfigNodePropertyArray eventrecorderBlacklist = null;

  @JsonProperty("eventrecorder.eventtypes")
  private ConfigNodePropertyDropDown eventrecorderEventtypes = null;

  /**
   **/
  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
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
  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventQueueLength(ConfigNodePropertyInteger eventQueueLength) {
    this.eventQueueLength = eventQueueLength;
    return this;
  }

  
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
  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderEnabled(ConfigNodePropertyBoolean eventrecorderEnabled) {
    this.eventrecorderEnabled = eventrecorderEnabled;
    return this;
  }

  
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
  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderBlacklist(ConfigNodePropertyArray eventrecorderBlacklist) {
    this.eventrecorderBlacklist = eventrecorderBlacklist;
    return this;
  }

  
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
  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderEventtypes(ConfigNodePropertyDropDown eventrecorderEventtypes) {
    this.eventrecorderEventtypes = eventrecorderEventtypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("eventrecorder.eventtypes")
  public ConfigNodePropertyDropDown getEventrecorderEventtypes() {
    return eventrecorderEventtypes;
  }
  public void setEventrecorderEventtypes(ConfigNodePropertyDropDown eventrecorderEventtypes) {
    this.eventrecorderEventtypes = eventrecorderEventtypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

