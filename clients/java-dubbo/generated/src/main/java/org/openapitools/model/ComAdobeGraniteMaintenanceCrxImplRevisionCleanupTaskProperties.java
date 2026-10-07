package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("full.gc.days")
  private ConfigNodePropertyArray fullGcDays;

  /**
   * 
   * @return fullGcDays
   */
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
    return Objects.equals(this.fullGcDays, comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.fullGcDays);
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
