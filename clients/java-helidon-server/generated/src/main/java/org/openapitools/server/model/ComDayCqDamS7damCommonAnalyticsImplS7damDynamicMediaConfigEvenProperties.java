package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties   {

    private ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.
     *
     * @param cqDamS7damDynamicmediaconfigeventlistenerEnabled cqDamS7damDynamicmediaconfigeventlistenerEnabled
     */
    public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties(
        ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled
    ) {
        this.cqDamS7damDynamicmediaconfigeventlistenerEnabled = cqDamS7damDynamicmediaconfigeventlistenerEnabled;
    }



    /**
     * Get cqDamS7damDynamicmediaconfigeventlistenerEnabled
     * @return cqDamS7damDynamicmediaconfigeventlistenerEnabled
     */
    public ConfigNodePropertyBoolean getCqDamS7damDynamicmediaconfigeventlistenerEnabled() {
        return cqDamS7damDynamicmediaconfigeventlistenerEnabled;
    }

    public void setCqDamS7damDynamicmediaconfigeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled) {
        this.cqDamS7damDynamicmediaconfigeventlistenerEnabled = cqDamS7damDynamicmediaconfigeventlistenerEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {\n");
        
        sb.append("    cqDamS7damDynamicmediaconfigeventlistenerEnabled: ").append(toIndentedString(cqDamS7damDynamicmediaconfigeventlistenerEnabled)).append("\n");
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

