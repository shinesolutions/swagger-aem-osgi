package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties   {

    private ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.
     *
     * @param cqAnalyticsTestandtargetAccountoptionsupdaterEnabled cqAnalyticsTestandtargetAccountoptionsupdaterEnabled
     */
    public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties(
        ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled
    ) {
        this.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled = cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
    }



    /**
     * Get cqAnalyticsTestandtargetAccountoptionsupdaterEnabled
     * @return cqAnalyticsTestandtargetAccountoptionsupdaterEnabled
     */
    public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetAccountoptionsupdaterEnabled() {
        return cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
    }

    public void setCqAnalyticsTestandtargetAccountoptionsupdaterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetAccountoptionsupdaterEnabled) {
        this.cqAnalyticsTestandtargetAccountoptionsupdaterEnabled = cqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties {\n");
        
        sb.append("    cqAnalyticsTestandtargetAccountoptionsupdaterEnabled: ").append(toIndentedString(cqAnalyticsTestandtargetAccountoptionsupdaterEnabled)).append("\n");
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

