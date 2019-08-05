package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreImplEventPagePostProcessorProperties   {
  
  private ConfigNodePropertyArray paths = null;

  public ComDayCqWcmCoreImplEventPagePostProcessorProperties () {

  }

  public ComDayCqWcmCoreImplEventPagePostProcessorProperties (ConfigNodePropertyArray paths) {
    this.paths = paths;
  }

    
  @JsonProperty("paths")
  public ConfigNodePropertyArray getPaths() {
    return paths;
  }
  public void setPaths(ConfigNodePropertyArray paths) {
    this.paths = paths;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
