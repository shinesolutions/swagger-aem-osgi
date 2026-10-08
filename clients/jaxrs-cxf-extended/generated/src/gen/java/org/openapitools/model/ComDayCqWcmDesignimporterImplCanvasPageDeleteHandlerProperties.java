package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minThreadPoolSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxThreadPoolSize;
 /**
  * Get minThreadPoolSize
  * @return minThreadPoolSize
  */
  @JsonProperty("minThreadPoolSize")
  public ConfigNodePropertyInteger getMinThreadPoolSize() {
    return minThreadPoolSize;
  }

  /**
   * Sets the <code>minThreadPoolSize</code> property.
   */
 public void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
  }

  /**
   * Sets the <code>minThreadPoolSize</code> property.
   */
  public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties minThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
    return this;
  }

 /**
  * Get maxThreadPoolSize
  * @return maxThreadPoolSize
  */
  @JsonProperty("maxThreadPoolSize")
  public ConfigNodePropertyInteger getMaxThreadPoolSize() {
    return maxThreadPoolSize;
  }

  /**
   * Sets the <code>maxThreadPoolSize</code> property.
   */
 public void setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
  }

  /**
   * Sets the <code>maxThreadPoolSize</code> property.
   */
  public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties maxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
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
    ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties = (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties) o;
    return Objects.equals(this.minThreadPoolSize, comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.minThreadPoolSize) &&
        Objects.equals(this.maxThreadPoolSize, comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.maxThreadPoolSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minThreadPoolSize, maxThreadPoolSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties {\n");
    
    sb.append("    minThreadPoolSize: ").append(toIndentedString(minThreadPoolSize)).append("\n");
    sb.append("    maxThreadPoolSize: ").append(toIndentedString(maxThreadPoolSize)).append("\n");
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

