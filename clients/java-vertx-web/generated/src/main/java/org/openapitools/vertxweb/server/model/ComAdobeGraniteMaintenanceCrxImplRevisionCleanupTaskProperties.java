package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties   {
  
  private ConfigNodePropertyArray fullGcDays;

  public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties () {

  }

  public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties (ConfigNodePropertyArray fullGcDays) {
    this.fullGcDays = fullGcDays;
  }

    
  @JsonProperty("full.gc.days")
  public ConfigNodePropertyArray getFullGcDays() {
    return fullGcDays;
  }
  public void setFullGcDays(ConfigNodePropertyArray fullGcDays) {
    this.fullGcDays = fullGcDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties = (ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties) o;
    return Objects.equals(fullGcDays, comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.fullGcDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullGcDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties {\n");
    
    sb.append("    fullGcDays: ").append(toIndentedString(fullGcDays)).append("\n");
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
