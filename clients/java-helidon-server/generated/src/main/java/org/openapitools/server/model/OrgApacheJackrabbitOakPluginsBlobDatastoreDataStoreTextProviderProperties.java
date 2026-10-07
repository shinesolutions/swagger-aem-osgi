package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties   {

    private ConfigNodePropertyString dir;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.
     *
     * @param dir dir
     */
    public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties(
        ConfigNodePropertyString dir
    ) {
        this.dir = dir;
    }



    /**
     * Get dir
     * @return dir
     */
    public ConfigNodePropertyString getDir() {
        return dir;
    }

    public void setDir(ConfigNodePropertyString dir) {
        this.dir = dir;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties {\n");
        
        sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
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

