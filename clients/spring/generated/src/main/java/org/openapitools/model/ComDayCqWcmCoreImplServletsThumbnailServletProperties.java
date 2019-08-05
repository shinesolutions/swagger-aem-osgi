package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqWcmCoreImplServletsThumbnailServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqWcmCoreImplServletsThumbnailServletProperties   {
  @JsonProperty("workspace")
  private ConfigNodePropertyString workspace = null;

  @JsonProperty("dimensions")
  private ConfigNodePropertyArray dimensions = null;

  public ComDayCqWcmCoreImplServletsThumbnailServletProperties workspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Get workspace
   * @return workspace
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getWorkspace() {
    return workspace;
  }

  public void setWorkspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }

  public ComDayCqWcmCoreImplServletsThumbnailServletProperties dimensions(ConfigNodePropertyArray dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

