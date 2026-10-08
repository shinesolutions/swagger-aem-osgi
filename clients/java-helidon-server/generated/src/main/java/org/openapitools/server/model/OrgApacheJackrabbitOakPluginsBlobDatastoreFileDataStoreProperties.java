package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties   {

    private ConfigNodePropertyString path;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.
     *
     * @param path path
     */
    public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties(
        ConfigNodePropertyString path
    ) {
        this.path = path;
    }



    /**
     * Get path
     * @return path
     */
    public ConfigNodePropertyString getPath() {
        return path;
    }

    public void setPath(ConfigNodePropertyString path) {
        this.path = path;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties {\n");
        
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

