package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties   {
  @JsonProperty("ignore_path")
  private ConfigNodePropertyBoolean ignorePath = null;

  public ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties ignorePath(ConfigNodePropertyBoolean ignorePath) {
    this.ignorePath = ignorePath;
    return this;
  }

   /**
   * Get ignorePath
   * @return ignorePath
  **/
  @Valid
  public ConfigNodePropertyBoolean getIgnorePath() {
    return ignorePath;
  }

  public void setIgnorePath(ConfigNodePropertyBoolean ignorePath) {
    this.ignorePath = ignorePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties comDayCqTaggingImplSearchTagPredicateEvaluatorProperties = (ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties) o;
    return Objects.equals(ignorePath, comDayCqTaggingImplSearchTagPredicateEvaluatorProperties.ignorePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignorePath);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

