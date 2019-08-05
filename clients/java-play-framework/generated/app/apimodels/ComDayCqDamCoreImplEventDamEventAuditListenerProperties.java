package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplEventDamEventAuditListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplEventDamEventAuditListenerProperties   {
  @JsonProperty("event.filter")
  private ConfigNodePropertyString eventFilter = null;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  public ComDayCqDamCoreImplEventDamEventAuditListenerProperties eventFilter(ConfigNodePropertyString eventFilter) {
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

  public ComDayCqDamCoreImplEventDamEventAuditListenerProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplEventDamEventAuditListenerProperties comDayCqDamCoreImplEventDamEventAuditListenerProperties = (ComDayCqDamCoreImplEventDamEventAuditListenerProperties) o;
    return Objects.equals(eventFilter, comDayCqDamCoreImplEventDamEventAuditListenerProperties.eventFilter) &&
        Objects.equals(enabled, comDayCqDamCoreImplEventDamEventAuditListenerProperties.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, enabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplEventDamEventAuditListenerProperties {\n");
    
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

