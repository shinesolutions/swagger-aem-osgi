package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties   {
  
  private @Valid ConfigNodePropertyString effectiveBundleListPath = null;

  /**
   **/
  public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties effectiveBundleListPath(ConfigNodePropertyString effectiveBundleListPath) {
    this.effectiveBundleListPath = effectiveBundleListPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("effectiveBundleListPath")
  public ConfigNodePropertyString getEffectiveBundleListPath() {
    return effectiveBundleListPath;
  }
  public void setEffectiveBundleListPath(ConfigNodePropertyString effectiveBundleListPath) {
    this.effectiveBundleListPath = effectiveBundleListPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

