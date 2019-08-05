package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties   {
  
  private ConfigNodePropertyInteger minThreadPoolSize = null;
  private ConfigNodePropertyInteger maxThreadPoolSize = null;

  public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties () {

  }

  public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties (ConfigNodePropertyInteger minThreadPoolSize, ConfigNodePropertyInteger maxThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
    this.maxThreadPoolSize = maxThreadPoolSize;
  }

    
  @JsonProperty("minThreadPoolSize")
  public ConfigNodePropertyInteger getMinThreadPoolSize() {
    return minThreadPoolSize;
  }
  public void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
  }

    
  @JsonProperty("maxThreadPoolSize")
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
    return Objects.equals(minThreadPoolSize, comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.minThreadPoolSize) &&
        Objects.equals(maxThreadPoolSize, comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.maxThreadPoolSize);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
