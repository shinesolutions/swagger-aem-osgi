package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties   {

    private ConfigNodePropertyBoolean ignorePath;

    /**
     * Default constructor.
     */
    public ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.
     *
     * @param ignorePath ignorePath
     */
    public ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties(
        ConfigNodePropertyBoolean ignorePath
    ) {
        this.ignorePath = ignorePath;
    }



    /**
     * Get ignorePath
     * @return ignorePath
     */
    public ConfigNodePropertyBoolean getIgnorePath() {
        return ignorePath;
    }

    public void setIgnorePath(ConfigNodePropertyBoolean ignorePath) {
        this.ignorePath = ignorePath;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

