package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamImageCacheMaxMemory = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamImageCacheMaxAge = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqDamImageCacheMaxDimension = null;
 /**
   * Get cqDamImageCacheMaxMemory
   * @return cqDamImageCacheMaxMemory
  **/
  @JsonProperty("cq.dam.image.cache.max.memory")
  public ConfigNodePropertyInteger getCqDamImageCacheMaxMemory() {
    return cqDamImageCacheMaxMemory;
  }

  public void setCqDamImageCacheMaxMemory(ConfigNodePropertyInteger cqDamImageCacheMaxMemory) {
    this.cqDamImageCacheMaxMemory = cqDamImageCacheMaxMemory;
  }

  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxMemory(ConfigNodePropertyInteger cqDamImageCacheMaxMemory) {
    this.cqDamImageCacheMaxMemory = cqDamImageCacheMaxMemory;
    return this;
  }

 /**
   * Get cqDamImageCacheMaxAge
   * @return cqDamImageCacheMaxAge
  **/
  @JsonProperty("cq.dam.image.cache.max.age")
  public ConfigNodePropertyInteger getCqDamImageCacheMaxAge() {
    return cqDamImageCacheMaxAge;
  }

  public void setCqDamImageCacheMaxAge(ConfigNodePropertyInteger cqDamImageCacheMaxAge) {
    this.cqDamImageCacheMaxAge = cqDamImageCacheMaxAge;
  }

  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxAge(ConfigNodePropertyInteger cqDamImageCacheMaxAge) {
    this.cqDamImageCacheMaxAge = cqDamImageCacheMaxAge;
    return this;
  }

 /**
   * Get cqDamImageCacheMaxDimension
   * @return cqDamImageCacheMaxDimension
  **/
  @JsonProperty("cq.dam.image.cache.max.dimension")
  public ConfigNodePropertyString getCqDamImageCacheMaxDimension() {
    return cqDamImageCacheMaxDimension;
  }

  public void setCqDamImageCacheMaxDimension(ConfigNodePropertyString cqDamImageCacheMaxDimension) {
    this.cqDamImageCacheMaxDimension = cqDamImageCacheMaxDimension;
  }

  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxDimension(ConfigNodePropertyString cqDamImageCacheMaxDimension) {
    this.cqDamImageCacheMaxDimension = cqDamImageCacheMaxDimension;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {\n");
    
    sb.append("    cqDamImageCacheMaxMemory: ").append(toIndentedString(cqDamImageCacheMaxMemory)).append("\n");
    sb.append("    cqDamImageCacheMaxAge: ").append(toIndentedString(cqDamImageCacheMaxAge)).append("\n");
    sb.append("    cqDamImageCacheMaxDimension: ").append(toIndentedString(cqDamImageCacheMaxDimension)).append("\n");
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

