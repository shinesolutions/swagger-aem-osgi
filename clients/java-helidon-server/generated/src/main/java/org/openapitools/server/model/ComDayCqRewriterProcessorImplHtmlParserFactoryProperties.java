package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties   {

    private ConfigNodePropertyArray htmlparserProcessTags;
    private ConfigNodePropertyBoolean htmlparserPreserveCamelCase;

    /**
     * Default constructor.
     */
    public ComDayCqRewriterProcessorImplHtmlParserFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.
     *
     * @param htmlparserProcessTags htmlparserProcessTags
     * @param htmlparserPreserveCamelCase htmlparserPreserveCamelCase
     */
    public ComDayCqRewriterProcessorImplHtmlParserFactoryProperties(
        ConfigNodePropertyArray htmlparserProcessTags, 
        ConfigNodePropertyBoolean htmlparserPreserveCamelCase
    ) {
        this.htmlparserProcessTags = htmlparserProcessTags;
        this.htmlparserPreserveCamelCase = htmlparserPreserveCamelCase;
    }



    /**
     * Get htmlparserProcessTags
     * @return htmlparserProcessTags
     */
    public ConfigNodePropertyArray getHtmlparserProcessTags() {
        return htmlparserProcessTags;
    }

    public void setHtmlparserProcessTags(ConfigNodePropertyArray htmlparserProcessTags) {
        this.htmlparserProcessTags = htmlparserProcessTags;
    }

    /**
     * Get htmlparserPreserveCamelCase
     * @return htmlparserPreserveCamelCase
     */
    public ConfigNodePropertyBoolean getHtmlparserPreserveCamelCase() {
        return htmlparserPreserveCamelCase;
    }

    public void setHtmlparserPreserveCamelCase(ConfigNodePropertyBoolean htmlparserPreserveCamelCase) {
        this.htmlparserPreserveCamelCase = htmlparserPreserveCamelCase;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

