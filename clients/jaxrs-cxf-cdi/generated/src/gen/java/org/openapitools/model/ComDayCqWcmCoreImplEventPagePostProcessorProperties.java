package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqWcmCoreImplEventPagePostProcessorProperties   {
  
  private ConfigNodePropertyArray paths = null;


  /**
   **/
  public ComDayCqWcmCoreImplEventPagePostProcessorProperties paths(ConfigNodePropertyArray paths) {
    this.paths = paths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paths")
  public ConfigNodePropertyArray getPaths() {
    return paths;
  }
  public void setPaths(ConfigNodePropertyArray paths) {
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
    ComDayCqWcmCoreImplEventPagePostProcessorProperties comDayCqWcmCoreImplEventPagePostProcessorProperties = (ComDayCqWcmCoreImplEventPagePostProcessorProperties) o;
    return Objects.equals(paths, comDayCqWcmCoreImplEventPagePostProcessorProperties.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplEventPagePostProcessorProperties {\n");
    
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

