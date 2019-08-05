package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties   {
  
  private ConfigNodePropertyString effectiveBundleListPath = null;

  public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties () {

  }

  public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties (ConfigNodePropertyString effectiveBundleListPath) {
    this.effectiveBundleListPath = effectiveBundleListPath;
  }

    
  @JsonProperty("effectiveBundleListPath")
  public ConfigNodePropertyString getEffectiveBundleListPath() {
    return effectiveBundleListPath;
  }
  public void setEffectiveBundleListPath(ConfigNodePropertyString effectiveBundleListPath) {
    this.effectiveBundleListPath = effectiveBundleListPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties = (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties) o;
    return Objects.equals(effectiveBundleListPath, comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.effectiveBundleListPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveBundleListPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties {\n");
    
    sb.append("    effectiveBundleListPath: ").append(toIndentedString(effectiveBundleListPath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
