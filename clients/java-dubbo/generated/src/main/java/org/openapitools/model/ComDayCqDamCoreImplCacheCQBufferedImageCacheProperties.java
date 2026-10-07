package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.dam.image.cache.max.memory")
  private ConfigNodePropertyInteger cqDamImageCacheMaxMemory;

  @JsonProperty("cq.dam.image.cache.max.age")
  private ConfigNodePropertyInteger cqDamImageCacheMaxAge;

  @JsonProperty("cq.dam.image.cache.max.dimension")
  private ConfigNodePropertyString cqDamImageCacheMaxDimension;

  /**
   * 
   * @return cqDamImageCacheMaxMemory
   */
  public ConfigNodePropertyInteger getCqDamImageCacheMaxMemory() {
    return cqDamImageCacheMaxMemory;
  }

  public void setCqDamImageCacheMaxMemory(ConfigNodePropertyInteger cqDamImageCacheMaxMemory) {
    this.cqDamImageCacheMaxMemory = cqDamImageCacheMaxMemory;
  }

  /**
   * 
   * @return cqDamImageCacheMaxAge
   */
  public ConfigNodePropertyInteger getCqDamImageCacheMaxAge() {
    return cqDamImageCacheMaxAge;
  }

  public void setCqDamImageCacheMaxAge(ConfigNodePropertyInteger cqDamImageCacheMaxAge) {
    this.cqDamImageCacheMaxAge = cqDamImageCacheMaxAge;
  }

  /**
   * 
   * @return cqDamImageCacheMaxDimension
   */
  public ConfigNodePropertyString getCqDamImageCacheMaxDimension() {
    return cqDamImageCacheMaxDimension;
  }

  public void setCqDamImageCacheMaxDimension(ConfigNodePropertyString cqDamImageCacheMaxDimension) {
    this.cqDamImageCacheMaxDimension = cqDamImageCacheMaxDimension;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
