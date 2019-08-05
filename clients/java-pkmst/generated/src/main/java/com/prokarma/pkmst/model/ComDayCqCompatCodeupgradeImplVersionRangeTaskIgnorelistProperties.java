package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties   {
  @JsonProperty("effectiveBundleListPath")
  private ConfigNodePropertyString effectiveBundleListPath = null;

  public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties effectiveBundleListPath(ConfigNodePropertyString effectiveBundleListPath) {
    this.effectiveBundleListPath = effectiveBundleListPath;
    return this;
  }

   /**
   * Get effectiveBundleListPath
   * @return effectiveBundleListPath
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

