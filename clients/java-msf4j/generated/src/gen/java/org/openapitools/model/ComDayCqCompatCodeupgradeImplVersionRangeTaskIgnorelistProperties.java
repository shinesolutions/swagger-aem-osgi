package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties   {
  @JsonProperty("effectiveBundleListPath")
  private ConfigNodePropertyString effectiveBundleListPath;

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

