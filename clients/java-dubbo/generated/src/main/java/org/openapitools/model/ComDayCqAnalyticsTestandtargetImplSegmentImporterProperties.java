package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.analytics.testandtarget.segmentimporter.enabled")
  private ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled;

  /**
   * 
   * @return cqAnalyticsTestandtargetSegmentimporterEnabled
   */
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
