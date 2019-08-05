package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties   {
  @JsonProperty("minThreadPoolSize")
  private ConfigNodePropertyInteger minThreadPoolSize = null;

  @JsonProperty("maxThreadPoolSize")
  private ConfigNodePropertyInteger maxThreadPoolSize = null;

  public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties minThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
    return this;
  }

   /**
   * Get minThreadPoolSize
   * @return minThreadPoolSize
  **/
  @Valid
  public ConfigNodePropertyInteger getMinThreadPoolSize() {
    return minThreadPoolSize;
  }

  public void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
  }

  public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties maxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
    return this;
  }

   /**
   * Get maxThreadPoolSize
   * @return maxThreadPoolSize
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

