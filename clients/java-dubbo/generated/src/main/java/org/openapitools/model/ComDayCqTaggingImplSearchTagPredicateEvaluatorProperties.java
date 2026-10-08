package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ignore_path")
  private ConfigNodePropertyBoolean ignorePath;

  /**
   * 
   * @return ignorePath
   */
  public ConfigNodePropertyBoolean getIgnorePath() {
    return ignorePath;
  }

  public void setIgnorePath(ConfigNodePropertyBoolean ignorePath) {
    this.ignorePath = ignorePath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties comDayCqTaggingImplSearchTagPredicateEvaluatorProperties = (ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties) o;
    return Objects.equals(this.ignorePath, comDayCqTaggingImplSearchTagPredicateEvaluatorProperties.ignorePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignorePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties {\n");
    
    sb.append("    ignorePath: ").append(toIndentedString(ignorePath)).append("\n");
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
