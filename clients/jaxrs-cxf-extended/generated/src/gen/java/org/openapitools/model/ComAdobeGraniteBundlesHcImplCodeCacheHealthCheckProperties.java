package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray hcTags;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minimumCodeCacheSize;
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
  public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
  * Get minimumCodeCacheSize
  * @return minimumCodeCacheSize
  */
  @JsonProperty("minimum.code.cache.size")
  public ConfigNodePropertyInteger getMinimumCodeCacheSize() {
    return minimumCodeCacheSize;
  }

  /**
   * Sets the <code>minimumCodeCacheSize</code> property.
   */
 public void setMinimumCodeCacheSize(ConfigNodePropertyInteger minimumCodeCacheSize) {
    this.minimumCodeCacheSize = minimumCodeCacheSize;
  }

  /**
   * Sets the <code>minimumCodeCacheSize</code> property.
   */
  public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties minimumCodeCacheSize(ConfigNodePropertyInteger minimumCodeCacheSize) {
    this.minimumCodeCacheSize = minimumCodeCacheSize;
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
    ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties = (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties) o;
    return Objects.equals(this.hcTags, comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.hcTags) &&
        Objects.equals(this.minimumCodeCacheSize, comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.minimumCodeCacheSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, minimumCodeCacheSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties {\n");
    
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    minimumCodeCacheSize: ").append(toIndentedString(minimumCodeCacheSize)).append("\n");
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

