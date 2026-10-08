package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteInfocollectorInfoCollectorProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("granite.infocollector.includeThreadDumps")
  private ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps;

  @JsonProperty("granite.infocollector.includeHeapDump")
  private ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump;

  /**
   * 
   * @return graniteInfocollectorIncludeThreadDumps
   */
  public ConfigNodePropertyBoolean getGraniteInfocollectorIncludeThreadDumps() {
    return graniteInfocollectorIncludeThreadDumps;
  }

  public void setGraniteInfocollectorIncludeThreadDumps(ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps) {
    this.graniteInfocollectorIncludeThreadDumps = graniteInfocollectorIncludeThreadDumps;
  }

  /**
   * 
   * @return graniteInfocollectorIncludeHeapDump
   */
  public ConfigNodePropertyBoolean getGraniteInfocollectorIncludeHeapDump() {
    return graniteInfocollectorIncludeHeapDump;
  }

  public void setGraniteInfocollectorIncludeHeapDump(ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump) {
    this.graniteInfocollectorIncludeHeapDump = graniteInfocollectorIncludeHeapDump;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
