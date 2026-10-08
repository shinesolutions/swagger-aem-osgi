package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties   {

    private ConfigNodePropertyArray persistentCacheIncludes;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.
     *
     * @param persistentCacheIncludes persistentCacheIncludes
     */
    public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties(
        ConfigNodePropertyArray persistentCacheIncludes
    ) {
        this.persistentCacheIncludes = persistentCacheIncludes;
    }



    /**
     * Get persistentCacheIncludes
     * @return persistentCacheIncludes
     */
    public ConfigNodePropertyArray getPersistentCacheIncludes() {
        return persistentCacheIncludes;
    }

    public void setPersistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes) {
        this.persistentCacheIncludes = persistentCacheIncludes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties {\n");
        
        sb.append("    persistentCacheIncludes: ").append(toIndentedString(persistentCacheIncludes)).append("\n");
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

