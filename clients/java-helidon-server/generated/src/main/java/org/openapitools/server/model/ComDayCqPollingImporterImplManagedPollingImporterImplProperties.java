package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqPollingImporterImplManagedPollingImporterImplProperties   {

    private ConfigNodePropertyString importerUser;

    /**
     * Default constructor.
     */
    public ComDayCqPollingImporterImplManagedPollingImporterImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqPollingImporterImplManagedPollingImporterImplProperties.
     *
     * @param importerUser importerUser
     */
    public ComDayCqPollingImporterImplManagedPollingImporterImplProperties(
        ConfigNodePropertyString importerUser
    ) {
        this.importerUser = importerUser;
    }



    /**
     * Get importerUser
     * @return importerUser
     */
    public ConfigNodePropertyString getImporterUser() {
        return importerUser;
    }

    public void setImporterUser(ConfigNodePropertyString importerUser) {
        this.importerUser = importerUser;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqPollingImporterImplManagedPollingImporterImplProperties {\n");
        
        sb.append("    importerUser: ").append(toIndentedString(importerUser)).append("\n");
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

