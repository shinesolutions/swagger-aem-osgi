package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties   {

    private ConfigNodePropertyString searchPattern;
    private ConfigNodePropertyString replacePattern;

    /**
     * Default constructor.
     */
    public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.
     *
     * @param searchPattern searchPattern
     * @param replacePattern replacePattern
     */
    public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(
        ConfigNodePropertyString searchPattern, 
        ConfigNodePropertyString replacePattern
    ) {
        this.searchPattern = searchPattern;
        this.replacePattern = replacePattern;
    }



    /**
     * Get searchPattern
     * @return searchPattern
     */
    public ConfigNodePropertyString getSearchPattern() {
        return searchPattern;
    }

    public void setSearchPattern(ConfigNodePropertyString searchPattern) {
        this.searchPattern = searchPattern;
    }

    /**
     * Get replacePattern
     * @return replacePattern
     */
    public ConfigNodePropertyString getReplacePattern() {
        return replacePattern;
    }

    public void setReplacePattern(ConfigNodePropertyString replacePattern) {
        this.replacePattern = replacePattern;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties {\n");
        
        sb.append("    searchPattern: ").append(toIndentedString(searchPattern)).append("\n");
        sb.append("    replacePattern: ").append(toIndentedString(replacePattern)).append("\n");
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

