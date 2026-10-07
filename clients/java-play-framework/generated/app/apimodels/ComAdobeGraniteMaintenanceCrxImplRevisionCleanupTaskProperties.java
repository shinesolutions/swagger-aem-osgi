package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties   {
  @JsonProperty("full.gc.days")
  @Valid

  private ConfigNodePropertyArray fullGcDays;

  public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties fullGcDays(ConfigNodePropertyArray fullGcDays) {
    this.fullGcDays = fullGcDays;
    return this;
  }

   /**
   * Get fullGcDays
   * @return fullGcDays
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

