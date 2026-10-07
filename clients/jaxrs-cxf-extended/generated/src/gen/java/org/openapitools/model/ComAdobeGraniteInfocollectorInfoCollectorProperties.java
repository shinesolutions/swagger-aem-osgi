package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteInfocollectorInfoCollectorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump;
 /**
  * Get graniteInfocollectorIncludeThreadDumps
  * @return graniteInfocollectorIncludeThreadDumps
  */
  @JsonProperty("granite.infocollector.includeThreadDumps")
  public ConfigNodePropertyBoolean getGraniteInfocollectorIncludeThreadDumps() {
    return graniteInfocollectorIncludeThreadDumps;
  }

  /**
   * Sets the <code>graniteInfocollectorIncludeThreadDumps</code> property.
   */
 public void setGraniteInfocollectorIncludeThreadDumps(ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps) {
    this.graniteInfocollectorIncludeThreadDumps = graniteInfocollectorIncludeThreadDumps;
  }

  /**
   * Sets the <code>graniteInfocollectorIncludeThreadDumps</code> property.
   */
  public ComAdobeGraniteInfocollectorInfoCollectorProperties graniteInfocollectorIncludeThreadDumps(ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps) {
    this.graniteInfocollectorIncludeThreadDumps = graniteInfocollectorIncludeThreadDumps;
    return this;
  }

 /**
  * Get graniteInfocollectorIncludeHeapDump
  * @return graniteInfocollectorIncludeHeapDump
  */
  @JsonProperty("granite.infocollector.includeHeapDump")
  public ConfigNodePropertyBoolean getGraniteInfocollectorIncludeHeapDump() {
    return graniteInfocollectorIncludeHeapDump;
  }

  /**
   * Sets the <code>graniteInfocollectorIncludeHeapDump</code> property.
   */
 public void setGraniteInfocollectorIncludeHeapDump(ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump) {
    this.graniteInfocollectorIncludeHeapDump = graniteInfocollectorIncludeHeapDump;
  }

  /**
   * Sets the <code>graniteInfocollectorIncludeHeapDump</code> property.
   */
  public ComAdobeGraniteInfocollectorInfoCollectorProperties graniteInfocollectorIncludeHeapDump(ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump) {
    this.graniteInfocollectorIncludeHeapDump = graniteInfocollectorIncludeHeapDump;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteInfocollectorInfoCollectorProperties comAdobeGraniteInfocollectorInfoCollectorProperties = (ComAdobeGraniteInfocollectorInfoCollectorProperties) o;
    return Objects.equals(this.graniteInfocollectorIncludeThreadDumps, comAdobeGraniteInfocollectorInfoCollectorProperties.graniteInfocollectorIncludeThreadDumps) &&
        Objects.equals(this.graniteInfocollectorIncludeHeapDump, comAdobeGraniteInfocollectorInfoCollectorProperties.graniteInfocollectorIncludeHeapDump);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graniteInfocollectorIncludeThreadDumps, graniteInfocollectorIncludeHeapDump);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteInfocollectorInfoCollectorProperties {\n");
    
    sb.append("    graniteInfocollectorIncludeThreadDumps: ").append(toIndentedString(graniteInfocollectorIncludeThreadDumps)).append("\n");
    sb.append("    graniteInfocollectorIncludeHeapDump: ").append(toIndentedString(graniteInfocollectorIncludeHeapDump)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

