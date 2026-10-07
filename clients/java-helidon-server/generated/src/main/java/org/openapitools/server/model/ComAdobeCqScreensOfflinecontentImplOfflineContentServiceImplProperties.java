package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties   {

    private ConfigNodePropertyBoolean disableSmartSync;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.
     *
     * @param disableSmartSync disableSmartSync
     */
    public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties(
        ConfigNodePropertyBoolean disableSmartSync
    ) {
        this.disableSmartSync = disableSmartSync;
    }



    /**
     * Get disableSmartSync
     * @return disableSmartSync
     */
    public ConfigNodePropertyBoolean getDisableSmartSync() {
        return disableSmartSync;
    }

    public void setDisableSmartSync(ConfigNodePropertyBoolean disableSmartSync) {
        this.disableSmartSync = disableSmartSync;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties {\n");
        
        sb.append("    disableSmartSync: ").append(toIndentedString(disableSmartSync)).append("\n");
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

