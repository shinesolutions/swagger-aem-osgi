package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties   {

    private ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths;

    /**
     * Default constructor.
     */
    public ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.
     *
     * @param cqStoreListenerAdditionalStorePaths cqStoreListenerAdditionalStorePaths
     */
    public ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties(
        ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths
    ) {
        this.cqStoreListenerAdditionalStorePaths = cqStoreListenerAdditionalStorePaths;
    }



    /**
     * Get cqStoreListenerAdditionalStorePaths
     * @return cqStoreListenerAdditionalStorePaths
     */
    public ConfigNodePropertyArray getCqStoreListenerAdditionalStorePaths() {
        return cqStoreListenerAdditionalStorePaths;
    }

    public void setCqStoreListenerAdditionalStorePaths(ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths) {
        this.cqStoreListenerAdditionalStorePaths = cqStoreListenerAdditionalStorePaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties {\n");
        
        sb.append("    cqStoreListenerAdditionalStorePaths: ").append(toIndentedString(cqStoreListenerAdditionalStorePaths)).append("\n");
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

