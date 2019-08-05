package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqWcmCoreImplEventTemplatePostProcessorProperties   {
  
  private ConfigNodePropertyString paths = null;


  /**
   **/
  public ComDayCqWcmCoreImplEventTemplatePostProcessorProperties paths(ConfigNodePropertyString paths) {
    this.paths = paths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paths")
  public ConfigNodePropertyString getPaths() {
    return paths;
  }
  public void setPaths(ConfigNodePropertyString paths) {
    this.paths = paths;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplEventTemplatePostProcessorProperties comDayCqWcmCoreImplEventTemplatePostProcessorProperties = (ComDayCqWcmCoreImplEventTemplatePostProcessorProperties) o;
    return Objects.equals(paths, comDayCqWcmCoreImplEventTemplatePostProcessorProperties.paths);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

