package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamHandlerStandardPsdPsdHandlerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("large_file_threshold")
  private ConfigNodePropertyInteger largeFileThreshold;

  /**
   * 
   * @return largeFileThreshold
   */
  public ConfigNodePropertyInteger getLargeFileThreshold() {
    return largeFileThreshold;
  }

  public void setLargeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamHandlerStandardPsdPsdHandlerProperties comDayCqDamHandlerStandardPsdPsdHandlerProperties = (ComDayCqDamHandlerStandardPsdPsdHandlerProperties) o;
    return Objects.equals(this.largeFileThreshold, comDayCqDamHandlerStandardPsdPsdHandlerProperties.largeFileThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(largeFileThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamHandlerStandardPsdPsdHandlerProperties {\n");
    
    sb.append("    largeFileThreshold: ").append(toIndentedString(largeFileThreshold)).append("\n");
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
