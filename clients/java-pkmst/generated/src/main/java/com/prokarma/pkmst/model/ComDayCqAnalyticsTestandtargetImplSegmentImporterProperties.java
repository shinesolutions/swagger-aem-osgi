package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties   {
  @JsonProperty("cq.analytics.testandtarget.segmentimporter.enabled")
  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled = null;

  public ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties cqAnalyticsTestandtargetSegmentimporterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled) {
    this.cqAnalyticsTestandtargetSegmentimporterEnabled = cqAnalyticsTestandtargetSegmentimporterEnabled;
    return this;
  }

   /**
   * Get cqAnalyticsTestandtargetSegmentimporterEnabled
   * @return cqAnalyticsTestandtargetSegmentimporterEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetSegmentimporterEnabled() {
    return cqAnalyticsTestandtargetSegmentimporterEnabled;
  }

  public void setCqAnalyticsTestandtargetSegmentimporterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled) {
    this.cqAnalyticsTestandtargetSegmentimporterEnabled = cqAnalyticsTestandtargetSegmentimporterEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

