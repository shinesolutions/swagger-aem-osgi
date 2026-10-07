package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties   {

    private ConfigNodePropertyInteger queryLimitInMemory;
    private ConfigNodePropertyInteger queryLimitReads;
    private ConfigNodePropertyBoolean queryFailTraversal;
    private ConfigNodePropertyBoolean fastQuerySize;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.
     *
     * @param queryLimitInMemory queryLimitInMemory
     * @param queryLimitReads queryLimitReads
     * @param queryFailTraversal queryFailTraversal
     * @param fastQuerySize fastQuerySize
     */
    public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(
        ConfigNodePropertyInteger queryLimitInMemory, 
        ConfigNodePropertyInteger queryLimitReads, 
        ConfigNodePropertyBoolean queryFailTraversal, 
        ConfigNodePropertyBoolean fastQuerySize
    ) {
        this.queryLimitInMemory = queryLimitInMemory;
        this.queryLimitReads = queryLimitReads;
        this.queryFailTraversal = queryFailTraversal;
        this.fastQuerySize = fastQuerySize;
    }



    /**
     * Get queryLimitInMemory
     * @return queryLimitInMemory
     */
    public ConfigNodePropertyInteger getQueryLimitInMemory() {
        return queryLimitInMemory;
    }

    public void setQueryLimitInMemory(ConfigNodePropertyInteger queryLimitInMemory) {
        this.queryLimitInMemory = queryLimitInMemory;
    }

    /**
     * Get queryLimitReads
     * @return queryLimitReads
     */
    public ConfigNodePropertyInteger getQueryLimitReads() {
        return queryLimitReads;
    }

    public void setQueryLimitReads(ConfigNodePropertyInteger queryLimitReads) {
        this.queryLimitReads = queryLimitReads;
    }

    /**
     * Get queryFailTraversal
     * @return queryFailTraversal
     */
    public ConfigNodePropertyBoolean getQueryFailTraversal() {
        return queryFailTraversal;
    }

    public void setQueryFailTraversal(ConfigNodePropertyBoolean queryFailTraversal) {
        this.queryFailTraversal = queryFailTraversal;
    }

    /**
     * Get fastQuerySize
     * @return fastQuerySize
     */
    public ConfigNodePropertyBoolean getFastQuerySize() {
        return fastQuerySize;
    }

    public void setFastQuerySize(ConfigNodePropertyBoolean fastQuerySize) {
        this.fastQuerySize = fastQuerySize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties {\n");
        
        sb.append("    queryLimitInMemory: ").append(toIndentedString(queryLimitInMemory)).append("\n");
        sb.append("    queryLimitReads: ").append(toIndentedString(queryLimitReads)).append("\n");
        sb.append("    queryFailTraversal: ").append(toIndentedString(queryFailTraversal)).append("\n");
        sb.append("    fastQuerySize: ").append(toIndentedString(fastQuerySize)).append("\n");
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

