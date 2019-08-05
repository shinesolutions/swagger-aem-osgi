package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplDamEventRecorderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

   /**
   * Get eventFilter
   * @return eventFilter
  **/
  @Valid
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventQueueLength(ConfigNodePropertyInteger eventQueueLength) {
    this.eventQueueLength = eventQueueLength;
    return this;
  }

   /**
   * Get eventQueueLength
   * @return eventQueueLength
  **/
  @Valid
  public ConfigNodePropertyInteger getEventQueueLength() {
    return eventQueueLength;
  }

  public void setEventQueueLength(ConfigNodePropertyInteger eventQueueLength) {
    this.eventQueueLength = eventQueueLength;
  }

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderEnabled(ConfigNodePropertyBoolean eventrecorderEnabled) {
    this.eventrecorderEnabled = eventrecorderEnabled;
    return this;
  }

   /**
   * Get eventrecorderEnabled
   * @return eventrecorderEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getEventrecorderEnabled() {
    return eventrecorderEnabled;
  }

  public void setEventrecorderEnabled(ConfigNodePropertyBoolean eventrecorderEnabled) {
    this.eventrecorderEnabled = eventrecorderEnabled;
  }

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderBlacklist(ConfigNodePropertyArray eventrecorderBlacklist) {
    this.eventrecorderBlacklist = eventrecorderBlacklist;
    return this;
  }

   /**
   * Get eventrecorderBlacklist
   * @return eventrecorderBlacklist
  **/
  @Valid
  public ConfigNodePropertyArray getEventrecorderBlacklist() {
    return eventrecorderBlacklist;
  }

  public void setEventrecorderBlacklist(ConfigNodePropertyArray eventrecorderBlacklist) {
    this.eventrecorderBlacklist = eventrecorderBlacklist;
  }

  public ComDayCqDamCoreImplDamEventRecorderImplProperties eventrecorderEventtypes(ConfigNodePropertyDropDown eventrecorderEventtypes) {
    this.eventrecorderEventtypes = eventrecorderEventtypes;
    return this;
  }

   /**
   * Get eventrecorderEventtypes
   * @return eventrecorderEventtypes
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

