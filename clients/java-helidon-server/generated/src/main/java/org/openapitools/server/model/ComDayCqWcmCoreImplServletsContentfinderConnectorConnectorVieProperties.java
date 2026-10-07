package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties   {

    private ConfigNodePropertyArray itemResourceTypes;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.
     *
     * @param itemResourceTypes itemResourceTypes
     */
    public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties(
        ConfigNodePropertyArray itemResourceTypes
    ) {
        this.itemResourceTypes = itemResourceTypes;
    }



    /**
     * Get itemResourceTypes
     * @return itemResourceTypes
     */
    public ConfigNodePropertyArray getItemResourceTypes() {
        return itemResourceTypes;
    }

    public void setItemResourceTypes(ConfigNodePropertyArray itemResourceTypes) {
        this.itemResourceTypes = itemResourceTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties {\n");
        
        sb.append("    itemResourceTypes: ").append(toIndentedString(itemResourceTypes)).append("\n");
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

