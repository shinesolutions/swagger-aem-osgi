package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("minThreadPoolSize")
  private ConfigNodePropertyInteger minThreadPoolSize;

  @JsonProperty("maxThreadPoolSize")
  private ConfigNodePropertyInteger maxThreadPoolSize;

  /**
   * 
   * @return minThreadPoolSize
   */
  public ConfigNodePropertyInteger getMinThreadPoolSize() {
    return minThreadPoolSize;
  }

  public void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
  }

  /**
   * 
   * @return maxThreadPoolSize
   */
  public ConfigNodePropertyInteger getMaxThreadPoolSize() {
    return maxThreadPoolSize;
  }

  public void setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
