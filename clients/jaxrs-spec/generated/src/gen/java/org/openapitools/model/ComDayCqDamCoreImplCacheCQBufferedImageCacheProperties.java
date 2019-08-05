package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties   {
  
  private @Valid ConfigNodePropertyInteger cqDamImageCacheMaxMemory = null;
  private @Valid ConfigNodePropertyInteger cqDamImageCacheMaxAge = null;
  private @Valid ConfigNodePropertyString cqDamImageCacheMaxDimension = null;

  /**
   **/
  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxMemory(ConfigNodePropertyInteger cqDamImageCacheMaxMemory) {
    this.cqDamImageCacheMaxMemory = cqDamImageCacheMaxMemory;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.image.cache.max.memory")
  public ConfigNodePropertyInteger getCqDamImageCacheMaxMemory() {
    return cqDamImageCacheMaxMemory;
  }
  public void setCqDamImageCacheMaxMemory(ConfigNodePropertyInteger cqDamImageCacheMaxMemory) {
    this.cqDamImageCacheMaxMemory = cqDamImageCacheMaxMemory;
  }

  /**
   **/
  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxAge(ConfigNodePropertyInteger cqDamImageCacheMaxAge) {
    this.cqDamImageCacheMaxAge = cqDamImageCacheMaxAge;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.image.cache.max.age")
  public ConfigNodePropertyInteger getCqDamImageCacheMaxAge() {
    return cqDamImageCacheMaxAge;
  }
  public void setCqDamImageCacheMaxAge(ConfigNodePropertyInteger cqDamImageCacheMaxAge) {
    this.cqDamImageCacheMaxAge = cqDamImageCacheMaxAge;
  }

  /**
   **/
  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxDimension(ConfigNodePropertyString cqDamImageCacheMaxDimension) {
    this.cqDamImageCacheMaxDimension = cqDamImageCacheMaxDimension;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.image.cache.max.dimension")
  public ConfigNodePropertyString getCqDamImageCacheMaxDimension() {
    return cqDamImageCacheMaxDimension;
  }
  public void setCqDamImageCacheMaxDimension(ConfigNodePropertyString cqDamImageCacheMaxDimension) {
    this.cqDamImageCacheMaxDimension = cqDamImageCacheMaxDimension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties comDayCqDamCoreImplCacheCQBufferedImageCacheProperties = (ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties) o;
    return Objects.equals(cqDamImageCacheMaxMemory, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties.cqDamImageCacheMaxMemory) &&
        Objects.equals(cqDamImageCacheMaxAge, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties.cqDamImageCacheMaxAge) &&
        Objects.equals(cqDamImageCacheMaxDimension, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties.cqDamImageCacheMaxDimension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamImageCacheMaxMemory, cqDamImageCacheMaxAge, cqDamImageCacheMaxDimension);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

