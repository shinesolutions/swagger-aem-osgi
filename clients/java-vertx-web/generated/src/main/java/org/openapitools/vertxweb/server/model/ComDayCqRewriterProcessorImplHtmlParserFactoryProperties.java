package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties   {
  
  private ConfigNodePropertyArray htmlparserProcessTags;
  private ConfigNodePropertyBoolean htmlparserPreserveCamelCase;

  public ComDayCqRewriterProcessorImplHtmlParserFactoryProperties () {

  }

  public ComDayCqRewriterProcessorImplHtmlParserFactoryProperties (ConfigNodePropertyArray htmlparserProcessTags, ConfigNodePropertyBoolean htmlparserPreserveCamelCase) {
    this.htmlparserProcessTags = htmlparserProcessTags;
    this.htmlparserPreserveCamelCase = htmlparserPreserveCamelCase;
  }

    
  @JsonProperty("htmlparser.processTags")
  public ConfigNodePropertyArray getHtmlparserProcessTags() {
    return htmlparserProcessTags;
  }
  public void setHtmlparserProcessTags(ConfigNodePropertyArray htmlparserProcessTags) {
    this.htmlparserProcessTags = htmlparserProcessTags;
  }

    
  @JsonProperty("htmlparser.preserveCamelCase")
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
    return Objects.equals(htmlparserProcessTags, comDayCqRewriterProcessorImplHtmlParserFactoryProperties.htmlparserProcessTags) &&
        Objects.equals(htmlparserPreserveCamelCase, comDayCqRewriterProcessorImplHtmlParserFactoryProperties.htmlparserPreserveCamelCase);
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
