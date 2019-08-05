package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqWcmCoreImplServletsThumbnailServletProperties   {
  
  private ConfigNodePropertyString workspace = null;
  private ConfigNodePropertyArray dimensions = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("workspace")
  public ConfigNodePropertyString getWorkspace() {
    return workspace;
  }
  public void setWorkspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dimensions")
  public ConfigNodePropertyArray getDimensions() {
    return dimensions;
  }
  public void setDimensions(ConfigNodePropertyArray dimensions) {
    this.dimensions = dimensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsThumbnailServletProperties comDayCqWcmCoreImplServletsThumbnailServletProperties = (ComDayCqWcmCoreImplServletsThumbnailServletProperties) o;
    return Objects.equals(workspace, comDayCqWcmCoreImplServletsThumbnailServletProperties.workspace) &&
        Objects.equals(dimensions, comDayCqWcmCoreImplServletsThumbnailServletProperties.dimensions);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

