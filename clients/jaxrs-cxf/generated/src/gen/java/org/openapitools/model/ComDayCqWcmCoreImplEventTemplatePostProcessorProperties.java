package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplEventTemplatePostProcessorProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString paths;
 /**
   * Get paths
   * @return paths
  **/
  @JsonProperty("paths")
  public ConfigNodePropertyString getPaths() {
    return paths;
  }

  public void setPaths(ConfigNodePropertyString paths) {
    this.paths = paths;
  }

  public ComDayCqWcmCoreImplEventTemplatePostProcessorProperties paths(ConfigNodePropertyString paths) {
    this.paths = paths;
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
    ComDayCqWcmCoreImplEventTemplatePostProcessorProperties comDayCqWcmCoreImplEventTemplatePostProcessorProperties = (ComDayCqWcmCoreImplEventTemplatePostProcessorProperties) o;
    return Objects.equals(this.paths, comDayCqWcmCoreImplEventTemplatePostProcessorProperties.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplEventTemplatePostProcessorProperties {\n");
    
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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

