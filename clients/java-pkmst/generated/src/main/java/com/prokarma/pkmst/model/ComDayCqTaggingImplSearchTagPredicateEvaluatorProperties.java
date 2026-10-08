package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties   {
  @JsonProperty("ignore_path")
  private ConfigNodePropertyBoolean ignorePath;

  public ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties ignorePath(ConfigNodePropertyBoolean ignorePath) {
    this.ignorePath = ignorePath;
    return this;
  }

  /**
   * Get ignorePath
   * @return ignorePath
   */
  @ApiModelProperty(value = "")
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

