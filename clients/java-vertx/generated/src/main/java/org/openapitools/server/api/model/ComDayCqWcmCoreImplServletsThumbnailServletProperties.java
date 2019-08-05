package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreImplServletsThumbnailServletProperties   {
  
  private ConfigNodePropertyString workspace = null;
  private ConfigNodePropertyArray dimensions = null;

  public ComDayCqWcmCoreImplServletsThumbnailServletProperties () {

  }

  public ComDayCqWcmCoreImplServletsThumbnailServletProperties (ConfigNodePropertyString workspace, ConfigNodePropertyArray dimensions) {
    this.workspace = workspace;
    this.dimensions = dimensions;
  }

    
  @JsonProperty("workspace")
  public ConfigNodePropertyString getWorkspace() {
    return workspace;
  }
  public void setWorkspace(ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }

    
  @JsonProperty("dimensions")
  public ConfigNodePropertyArray getDimensions() {
    return dimensions;
  }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
