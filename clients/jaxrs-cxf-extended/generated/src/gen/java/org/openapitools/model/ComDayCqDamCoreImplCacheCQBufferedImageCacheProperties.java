package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamImageCacheMaxMemory;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamImageCacheMaxAge;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqDamImageCacheMaxDimension;
 /**
  * Get cqDamImageCacheMaxMemory
  * @return cqDamImageCacheMaxMemory
  */
  @JsonProperty("cq.dam.image.cache.max.memory")
  public ConfigNodePropertyInteger getCqDamImageCacheMaxMemory() {
    return cqDamImageCacheMaxMemory;
  }

  /**
   * Sets the <code>cqDamImageCacheMaxMemory</code> property.
   */
 public void setCqDamImageCacheMaxMemory(ConfigNodePropertyInteger cqDamImageCacheMaxMemory) {
    this.cqDamImageCacheMaxMemory = cqDamImageCacheMaxMemory;
  }

  /**
   * Sets the <code>cqDamImageCacheMaxMemory</code> property.
   */
  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxMemory(ConfigNodePropertyInteger cqDamImageCacheMaxMemory) {
    this.cqDamImageCacheMaxMemory = cqDamImageCacheMaxMemory;
    return this;
  }

 /**
  * Get cqDamImageCacheMaxAge
  * @return cqDamImageCacheMaxAge
  */
  @JsonProperty("cq.dam.image.cache.max.age")
  public ConfigNodePropertyInteger getCqDamImageCacheMaxAge() {
    return cqDamImageCacheMaxAge;
  }

  /**
   * Sets the <code>cqDamImageCacheMaxAge</code> property.
   */
 public void setCqDamImageCacheMaxAge(ConfigNodePropertyInteger cqDamImageCacheMaxAge) {
    this.cqDamImageCacheMaxAge = cqDamImageCacheMaxAge;
  }

  /**
   * Sets the <code>cqDamImageCacheMaxAge</code> property.
   */
  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxAge(ConfigNodePropertyInteger cqDamImageCacheMaxAge) {
    this.cqDamImageCacheMaxAge = cqDamImageCacheMaxAge;
    return this;
  }

 /**
  * Get cqDamImageCacheMaxDimension
  * @return cqDamImageCacheMaxDimension
  */
  @JsonProperty("cq.dam.image.cache.max.dimension")
  public ConfigNodePropertyString getCqDamImageCacheMaxDimension() {
    return cqDamImageCacheMaxDimension;
  }

  /**
   * Sets the <code>cqDamImageCacheMaxDimension</code> property.
   */
 public void setCqDamImageCacheMaxDimension(ConfigNodePropertyString cqDamImageCacheMaxDimension) {
    this.cqDamImageCacheMaxDimension = cqDamImageCacheMaxDimension;
  }

  /**
   * Sets the <code>cqDamImageCacheMaxDimension</code> property.
   */
  public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties cqDamImageCacheMaxDimension(ConfigNodePropertyString cqDamImageCacheMaxDimension) {
    this.cqDamImageCacheMaxDimension = cqDamImageCacheMaxDimension;
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
    ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties comDayCqDamCoreImplCacheCQBufferedImageCacheProperties = (ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties) o;
    return Objects.equals(this.cqDamImageCacheMaxMemory, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties.cqDamImageCacheMaxMemory) &&
        Objects.equals(this.cqDamImageCacheMaxAge, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties.cqDamImageCacheMaxAge) &&
        Objects.equals(this.cqDamImageCacheMaxDimension, comDayCqDamCoreImplCacheCQBufferedImageCacheProperties.cqDamImageCacheMaxDimension);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

