package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray paths = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray excludedPaths = null;
 /**
   * Get paths
   * @return paths
  **/
  @JsonProperty("paths")
  public ConfigNodePropertyArray getPaths() {
    return paths;
  }

  public void setPaths(ConfigNodePropertyArray paths) {
    this.paths = paths;
  }

  public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties paths(ConfigNodePropertyArray paths) {
    this.paths = paths;
    return this;
  }

 /**
   * Get excludedPaths
   * @return excludedPaths
  **/
  @JsonProperty("excludedPaths")
  public ConfigNodePropertyArray getExcludedPaths() {
    return excludedPaths;
  }

  public void setExcludedPaths(ConfigNodePropertyArray excludedPaths) {
    this.excludedPaths = excludedPaths;
  }

  public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties excludedPaths(ConfigNodePropertyArray excludedPaths) {
    this.excludedPaths = excludedPaths;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

