package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties   {

    private ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.
     *
     * @param cqDamS7damDamchangeeventlistenerEnabled cqDamS7damDamchangeeventlistenerEnabled
     */
    public ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties(
        ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled
    ) {
        this.cqDamS7damDamchangeeventlistenerEnabled = cqDamS7damDamchangeeventlistenerEnabled;
    }



    /**
     * Get cqDamS7damDamchangeeventlistenerEnabled
     * @return cqDamS7damDamchangeeventlistenerEnabled
     */
    public ConfigNodePropertyBoolean getCqDamS7damDamchangeeventlistenerEnabled() {
        return cqDamS7damDamchangeeventlistenerEnabled;
    }

    public void setCqDamS7damDamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled) {
        this.cqDamS7damDamchangeeventlistenerEnabled = cqDamS7damDamchangeeventlistenerEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties {\n");
        
        sb.append("    cqDamS7damDamchangeeventlistenerEnabled: ").append(toIndentedString(cqDamS7damDamchangeeventlistenerEnabled)).append("\n");
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

