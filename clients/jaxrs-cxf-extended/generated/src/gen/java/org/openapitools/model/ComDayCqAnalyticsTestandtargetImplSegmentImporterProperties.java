package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled;
 /**
  * Get cqAnalyticsTestandtargetSegmentimporterEnabled
  * @return cqAnalyticsTestandtargetSegmentimporterEnabled
  */
  @JsonProperty("cq.analytics.testandtarget.segmentimporter.enabled")
  public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetSegmentimporterEnabled() {
    return cqAnalyticsTestandtargetSegmentimporterEnabled;
  }

  /**
   * Sets the <code>cqAnalyticsTestandtargetSegmentimporterEnabled</code> property.
   */
 public void setCqAnalyticsTestandtargetSegmentimporterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled) {
    this.cqAnalyticsTestandtargetSegmentimporterEnabled = cqAnalyticsTestandtargetSegmentimporterEnabled;
  }

  /**
   * Sets the <code>cqAnalyticsTestandtargetSegmentimporterEnabled</code> property.
   */
  public ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties cqAnalyticsTestandtargetSegmentimporterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled) {
    this.cqAnalyticsTestandtargetSegmentimporterEnabled = cqAnalyticsTestandtargetSegmentimporterEnabled;
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
    ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties comDayCqAnalyticsTestandtargetImplSegmentImporterProperties = (ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties) o;
    return Objects.equals(this.cqAnalyticsTestandtargetSegmentimporterEnabled, comDayCqAnalyticsTestandtargetImplSegmentImporterProperties.cqAnalyticsTestandtargetSegmentimporterEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsTestandtargetSegmentimporterEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties {\n");
    
    sb.append("    cqAnalyticsTestandtargetSegmentimporterEnabled: ").append(toIndentedString(cqAnalyticsTestandtargetSegmentimporterEnabled)).append("\n");
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

