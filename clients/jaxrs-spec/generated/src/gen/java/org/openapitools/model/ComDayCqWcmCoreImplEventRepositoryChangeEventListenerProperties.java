package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties   {
  
  private @Valid ConfigNodePropertyArray paths = null;
  private @Valid ConfigNodePropertyArray excludedPaths = null;

  /**
   **/
  public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties paths(ConfigNodePropertyArray paths) {
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

  /**
   **/
  public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties excludedPaths(ConfigNodePropertyArray excludedPaths) {
    this.excludedPaths = excludedPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("excludedPaths")
  public ConfigNodePropertyArray getExcludedPaths() {
    return excludedPaths;
  }
  public void setExcludedPaths(ConfigNodePropertyArray excludedPaths) {
    this.excludedPaths = excludedPaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties = (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties) o;
    return Objects.equals(paths, comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.paths) &&
        Objects.equals(excludedPaths, comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.excludedPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths, excludedPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties {\n");
    
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    excludedPaths: ").append(toIndentedString(excludedPaths)).append("\n");
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

