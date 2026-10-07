package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray hcTags;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray excludeSearchPath;
 /**
  * Get hcTags
  * @return hcTags
  */
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  /**
   * Sets the <code>hcTags</code> property.
   */
 public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   * Sets the <code>hcTags</code> property.
   */
  public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
  * Get excludeSearchPath
  * @return excludeSearchPath
  */
  @JsonProperty("exclude.search.path")
  public ConfigNodePropertyArray getExcludeSearchPath() {
    return excludeSearchPath;
  }

  /**
   * Sets the <code>excludeSearchPath</code> property.
   */
 public void setExcludeSearchPath(ConfigNodePropertyArray excludeSearchPath) {
    this.excludeSearchPath = excludeSearchPath;
  }

  /**
   * Sets the <code>excludeSearchPath</code> property.
   */
  public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties excludeSearchPath(ConfigNodePropertyArray excludeSearchPath) {
    this.excludeSearchPath = excludeSearchPath;
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
    ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties = (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties) o;
    return Objects.equals(this.hcTags, comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.hcTags) &&
        Objects.equals(this.excludeSearchPath, comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.excludeSearchPath);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

