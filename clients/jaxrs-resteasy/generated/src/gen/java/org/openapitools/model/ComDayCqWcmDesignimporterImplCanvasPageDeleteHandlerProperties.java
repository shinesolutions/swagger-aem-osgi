package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties   {
  
  private ConfigNodePropertyInteger minThreadPoolSize = null;
  private ConfigNodePropertyInteger maxThreadPoolSize = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minThreadPoolSize")
  public ConfigNodePropertyInteger getMinThreadPoolSize() {
    return minThreadPoolSize;
  }
  public void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxThreadPoolSize")
  public ConfigNodePropertyInteger getMaxThreadPoolSize() {
    return maxThreadPoolSize;
  }
  public void setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

