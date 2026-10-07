package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplDamChangeEventListenerProperties   {

    private ConfigNodePropertyArray changeeventlistenerObservedPaths;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplDamChangeEventListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplDamChangeEventListenerProperties.
     *
     * @param changeeventlistenerObservedPaths changeeventlistenerObservedPaths
     */
    public ComDayCqDamCoreImplDamChangeEventListenerProperties(
        ConfigNodePropertyArray changeeventlistenerObservedPaths
    ) {
        this.changeeventlistenerObservedPaths = changeeventlistenerObservedPaths;
    }



    /**
     * Get changeeventlistenerObservedPaths
     * @return changeeventlistenerObservedPaths
     */
    public ConfigNodePropertyArray getChangeeventlistenerObservedPaths() {
        return changeeventlistenerObservedPaths;
    }

    public void setChangeeventlistenerObservedPaths(ConfigNodePropertyArray changeeventlistenerObservedPaths) {
        this.changeeventlistenerObservedPaths = changeeventlistenerObservedPaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplDamChangeEventListenerProperties {\n");
        
        sb.append("    changeeventlistenerObservedPaths: ").append(toIndentedString(changeeventlistenerObservedPaths)).append("\n");
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

