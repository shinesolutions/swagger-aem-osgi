package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqDamCoreImplEventDamEventAuditListenerProperties   {
  
  private ConfigNodePropertyString eventFilter = null;
  private ConfigNodePropertyBoolean enabled = null;

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
  @JsonProperty("enabled")
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

