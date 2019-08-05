package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeGraniteInfocollectorInfoCollectorProperties   {
  @JsonProperty("granite.infocollector.includeThreadDumps")
  private ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps = null;

  @JsonProperty("granite.infocollector.includeHeapDump")
  private ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump = null;

  /**
   **/
  public ComAdobeGraniteInfocollectorInfoCollectorProperties graniteInfocollectorIncludeThreadDumps(ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps) {
    this.graniteInfocollectorIncludeThreadDumps = graniteInfocollectorIncludeThreadDumps;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.infocollector.includeThreadDumps")
  public ConfigNodePropertyBoolean getGraniteInfocollectorIncludeThreadDumps() {
    return graniteInfocollectorIncludeThreadDumps;
  }
  public void setGraniteInfocollectorIncludeThreadDumps(ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps) {
    this.graniteInfocollectorIncludeThreadDumps = graniteInfocollectorIncludeThreadDumps;
  }

  /**
   **/
  public ComAdobeGraniteInfocollectorInfoCollectorProperties graniteInfocollectorIncludeHeapDump(ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump) {
    this.graniteInfocollectorIncludeHeapDump = graniteInfocollectorIncludeHeapDump;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.infocollector.includeHeapDump")
  public ConfigNodePropertyBoolean getGraniteInfocollectorIncludeHeapDump() {
    return graniteInfocollectorIncludeHeapDump;
  }
  public void setGraniteInfocollectorIncludeHeapDump(ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump) {
    this.graniteInfocollectorIncludeHeapDump = graniteInfocollectorIncludeHeapDump;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteInfocollectorInfoCollectorProperties comAdobeGraniteInfocollectorInfoCollectorProperties = (ComAdobeGraniteInfocollectorInfoCollectorProperties) o;
    return Objects.equals(graniteInfocollectorIncludeThreadDumps, comAdobeGraniteInfocollectorInfoCollectorProperties.graniteInfocollectorIncludeThreadDumps) &&
        Objects.equals(graniteInfocollectorIncludeHeapDump, comAdobeGraniteInfocollectorInfoCollectorProperties.graniteInfocollectorIncludeHeapDump);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

