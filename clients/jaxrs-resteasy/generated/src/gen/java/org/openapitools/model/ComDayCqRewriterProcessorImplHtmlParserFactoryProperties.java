package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties   {
  
  private ConfigNodePropertyArray htmlparserProcessTags;
  private ConfigNodePropertyBoolean htmlparserPreserveCamelCase;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmlparser.processTags")
  @Valid
  public ConfigNodePropertyArray getHtmlparserProcessTags() {
    return htmlparserProcessTags;
  }
  public void setHtmlparserProcessTags(ConfigNodePropertyArray htmlparserProcessTags) {
    this.htmlparserProcessTags = htmlparserProcessTags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmlparser.preserveCamelCase")
  @Valid
  public ConfigNodePropertyBoolean getHtmlparserPreserveCamelCase() {
    return htmlparserPreserveCamelCase;
  }
  public void setHtmlparserPreserveCamelCase(ConfigNodePropertyBoolean htmlparserPreserveCamelCase) {
    this.htmlparserPreserveCamelCase = htmlparserPreserveCamelCase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqRewriterProcessorImplHtmlParserFactoryProperties comDayCqRewriterProcessorImplHtmlParserFactoryProperties = (ComDayCqRewriterProcessorImplHtmlParserFactoryProperties) o;
    return Objects.equals(this.htmlparserProcessTags, comDayCqRewriterProcessorImplHtmlParserFactoryProperties.htmlparserProcessTags) &&
        Objects.equals(this.htmlparserPreserveCamelCase, comDayCqRewriterProcessorImplHtmlParserFactoryProperties.htmlparserPreserveCamelCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlparserProcessTags, htmlparserPreserveCamelCase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties {\n");
    
    sb.append("    htmlparserProcessTags: ").append(toIndentedString(htmlparserProcessTags)).append("\n");
    sb.append("    htmlparserPreserveCamelCase: ").append(toIndentedString(htmlparserPreserveCamelCase)).append("\n");
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

