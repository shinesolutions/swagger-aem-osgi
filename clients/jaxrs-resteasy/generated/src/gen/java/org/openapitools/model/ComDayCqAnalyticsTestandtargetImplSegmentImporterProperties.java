package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties   {
  
  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.testandtarget.segmentimporter.enabled")
  @Valid
  public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetSegmentimporterEnabled() {
    return cqAnalyticsTestandtargetSegmentimporterEnabled;
  }
  public void setCqAnalyticsTestandtargetSegmentimporterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled) {
    this.cqAnalyticsTestandtargetSegmentimporterEnabled = cqAnalyticsTestandtargetSegmentimporterEnabled;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

