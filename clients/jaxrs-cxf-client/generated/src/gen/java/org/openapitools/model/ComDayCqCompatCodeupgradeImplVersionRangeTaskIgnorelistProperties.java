package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString effectiveBundleListPath;
 /**
   * Get effectiveBundleListPath
   * @return effectiveBundleListPath
  **/
  @JsonProperty("effectiveBundleListPath")
  public ConfigNodePropertyString getEffectiveBundleListPath() {
    return effectiveBundleListPath;
  }

  public void setEffectiveBundleListPath(ConfigNodePropertyString effectiveBundleListPath) {
    this.effectiveBundleListPath = effectiveBundleListPath;
  }

  public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties effectiveBundleListPath(ConfigNodePropertyString effectiveBundleListPath) {
    this.effectiveBundleListPath = effectiveBundleListPath;
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
    ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties = (ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties) o;
    return Objects.equals(this.effectiveBundleListPath, comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.effectiveBundleListPath);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

