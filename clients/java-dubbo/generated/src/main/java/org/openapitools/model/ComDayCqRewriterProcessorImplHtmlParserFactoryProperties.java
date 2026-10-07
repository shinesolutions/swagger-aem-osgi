package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("htmlparser.processTags")
  private ConfigNodePropertyArray htmlparserProcessTags;

  @JsonProperty("htmlparser.preserveCamelCase")
  private ConfigNodePropertyBoolean htmlparserPreserveCamelCase;

  /**
   * 
   * @return htmlparserProcessTags
   */
  public ConfigNodePropertyArray getHtmlparserProcessTags() {
    return htmlparserProcessTags;
  }

  public void setHtmlparserProcessTags(ConfigNodePropertyArray htmlparserProcessTags) {
    this.htmlparserProcessTags = htmlparserProcessTags;
  }

  /**
   * 
   * @return htmlparserPreserveCamelCase
   */
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
