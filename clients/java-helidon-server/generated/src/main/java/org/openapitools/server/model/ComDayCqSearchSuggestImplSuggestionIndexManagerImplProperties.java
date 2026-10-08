package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties   {

    private ConfigNodePropertyString pathBuilderTarget;
    private ConfigNodePropertyString suggestBasepath;

    /**
     * Default constructor.
     */
    public ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.
     *
     * @param pathBuilderTarget pathBuilderTarget
     * @param suggestBasepath suggestBasepath
     */
    public ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(
        ConfigNodePropertyString pathBuilderTarget, 
        ConfigNodePropertyString suggestBasepath
    ) {
        this.pathBuilderTarget = pathBuilderTarget;
        this.suggestBasepath = suggestBasepath;
    }



    /**
     * Get pathBuilderTarget
     * @return pathBuilderTarget
     */
    public ConfigNodePropertyString getPathBuilderTarget() {
        return pathBuilderTarget;
    }

    public void setPathBuilderTarget(ConfigNodePropertyString pathBuilderTarget) {
        this.pathBuilderTarget = pathBuilderTarget;
    }

    /**
     * Get suggestBasepath
     * @return suggestBasepath
     */
    public ConfigNodePropertyString getSuggestBasepath() {
        return suggestBasepath;
    }

    public void setSuggestBasepath(ConfigNodePropertyString suggestBasepath) {
        this.suggestBasepath = suggestBasepath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {\n");
        
        sb.append("    pathBuilderTarget: ").append(toIndentedString(pathBuilderTarget)).append("\n");
        sb.append("    suggestBasepath: ").append(toIndentedString(suggestBasepath)).append("\n");
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

