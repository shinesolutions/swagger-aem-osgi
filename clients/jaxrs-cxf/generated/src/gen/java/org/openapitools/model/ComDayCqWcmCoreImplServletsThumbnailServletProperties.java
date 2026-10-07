package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplServletsThumbnailServletProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString workspace;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray dimensions;
 /**
   * Get workspace
   * @return workspace
  **/
  @JsonProperty("workspace")
  public ConfigNodePropertyString getWorkspace() {
    return workspace;
  }

  public void setWorkspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }

  public ComDayCqWcmCoreImplServletsThumbnailServletProperties workspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
    return this;
  }

 /**
   * Get dimensions
   * @return dimensions
  **/
  @JsonProperty("dimensions")
  public ConfigNodePropertyArray getDimensions() {
    return dimensions;
  }

  public void setDimensions(ConfigNodePropertyArray dimensions) {
    this.dimensions = dimensions;
  }

  public ComDayCqWcmCoreImplServletsThumbnailServletProperties dimensions(ConfigNodePropertyArray dimensions) {
    this.dimensions = dimensions;
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
    ComDayCqWcmCoreImplServletsThumbnailServletProperties comDayCqWcmCoreImplServletsThumbnailServletProperties = (ComDayCqWcmCoreImplServletsThumbnailServletProperties) o;
    return Objects.equals(this.workspace, comDayCqWcmCoreImplServletsThumbnailServletProperties.workspace) &&
        Objects.equals(this.dimensions, comDayCqWcmCoreImplServletsThumbnailServletProperties.dimensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspace, dimensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsThumbnailServletProperties {\n");
    
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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

