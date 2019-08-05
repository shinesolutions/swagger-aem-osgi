package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties   {
  
  private @Valid ConfigNodePropertyArray hcTags = null;
  private @Valid ConfigNodePropertyArray excludeSearchPath = null;

  /**
   **/
  public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   **/
  public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties excludeSearchPath(ConfigNodePropertyArray excludeSearchPath) {
    this.excludeSearchPath = excludeSearchPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exclude.search.path")
  public ConfigNodePropertyArray getExcludeSearchPath() {
    return excludeSearchPath;
  }
  public void setExcludeSearchPath(ConfigNodePropertyArray excludeSearchPath) {
    this.excludeSearchPath = excludeSearchPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties = (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties) o;
    return Objects.equals(hcTags, comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.hcTags) &&
        Objects.equals(excludeSearchPath, comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.excludeSearchPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, excludeSearchPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties {\n");
    
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    excludeSearchPath: ").append(toIndentedString(excludeSearchPath)).append("\n");
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

