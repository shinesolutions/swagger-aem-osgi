package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteInfocollectorInfoCollectorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump = null;
 /**
   * Get graniteInfocollectorIncludeThreadDumps
   * @return graniteInfocollectorIncludeThreadDumps
  **/
  @JsonProperty("granite.infocollector.includeThreadDumps")
  public ConfigNodePropertyBoolean getGraniteInfocollectorIncludeThreadDumps() {
    return graniteInfocollectorIncludeThreadDumps;
  }

  public void setGraniteInfocollectorIncludeThreadDumps(ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps) {
    this.graniteInfocollectorIncludeThreadDumps = graniteInfocollectorIncludeThreadDumps;
  }

  public ComAdobeGraniteInfocollectorInfoCollectorProperties graniteInfocollectorIncludeThreadDumps(ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps) {
    this.graniteInfocollectorIncludeThreadDumps = graniteInfocollectorIncludeThreadDumps;
    return this;
  }

 /**
   * Get graniteInfocollectorIncludeHeapDump
   * @return graniteInfocollectorIncludeHeapDump
  **/
  @JsonProperty("granite.infocollector.includeHeapDump")
  public ConfigNodePropertyBoolean getGraniteInfocollectorIncludeHeapDump() {
    return graniteInfocollectorIncludeHeapDump;
  }

  public void setGraniteInfocollectorIncludeHeapDump(ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump) {
    this.graniteInfocollectorIncludeHeapDump = graniteInfocollectorIncludeHeapDump;
  }

  public ComAdobeGraniteInfocollectorInfoCollectorProperties graniteInfocollectorIncludeHeapDump(ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump) {
    this.graniteInfocollectorIncludeHeapDump = graniteInfocollectorIncludeHeapDump;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

