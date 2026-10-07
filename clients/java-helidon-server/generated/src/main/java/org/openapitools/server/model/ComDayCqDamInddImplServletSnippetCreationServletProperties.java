package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamInddImplServletSnippetCreationServletProperties   {

    private ConfigNodePropertyInteger snippetcreationMaxcollections;

    /**
     * Default constructor.
     */
    public ComDayCqDamInddImplServletSnippetCreationServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamInddImplServletSnippetCreationServletProperties.
     *
     * @param snippetcreationMaxcollections snippetcreationMaxcollections
     */
    public ComDayCqDamInddImplServletSnippetCreationServletProperties(
        ConfigNodePropertyInteger snippetcreationMaxcollections
    ) {
        this.snippetcreationMaxcollections = snippetcreationMaxcollections;
    }



    /**
     * Get snippetcreationMaxcollections
     * @return snippetcreationMaxcollections
     */
    public ConfigNodePropertyInteger getSnippetcreationMaxcollections() {
        return snippetcreationMaxcollections;
    }

    public void setSnippetcreationMaxcollections(ConfigNodePropertyInteger snippetcreationMaxcollections) {
        this.snippetcreationMaxcollections = snippetcreationMaxcollections;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamInddImplServletSnippetCreationServletProperties {\n");
        
        sb.append("    snippetcreationMaxcollections: ").append(toIndentedString(snippetcreationMaxcollections)).append("\n");
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

