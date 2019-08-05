package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties   {
  @JsonProperty("full.gc.days")
  private ConfigNodePropertyArray fullGcDays = null;

  /**
   **/
  public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties fullGcDays(ConfigNodePropertyArray fullGcDays) {
    this.fullGcDays = fullGcDays;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("full.gc.days")
  public ConfigNodePropertyArray getFullGcDays() {
    return fullGcDays;
  }
  public void setFullGcDays(ConfigNodePropertyArray fullGcDays) {
    this.fullGcDays = fullGcDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

