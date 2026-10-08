package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqWcmCoreImplServletsThumbnailServletProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplServletsThumbnailServletProperties   {
  private ConfigNodePropertyString workspace;
  private ConfigNodePropertyArray dimensions;

  public ComDayCqWcmCoreImplServletsThumbnailServletProperties() {
  }

  /**
   **/
  public ComDayCqWcmCoreImplServletsThumbnailServletProperties workspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("workspace")
  @Valid public ConfigNodePropertyString getWorkspace() {
    return workspace;
  }

  @JsonProperty("workspace")
  public void setWorkspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }

  /**
   **/
  public ComDayCqWcmCoreImplServletsThumbnailServletProperties dimensions(ConfigNodePropertyArray dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dimensions")
  @Valid public ConfigNodePropertyArray getDimensions() {
    return dimensions;
  }

  @JsonProperty("dimensions")
  public void setDimensions(ConfigNodePropertyArray dimensions) {
    this.dimensions = dimensions;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
