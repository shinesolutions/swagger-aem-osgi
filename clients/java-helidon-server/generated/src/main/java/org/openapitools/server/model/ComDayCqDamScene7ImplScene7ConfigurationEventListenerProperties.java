package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties   {

    private ConfigNodePropertyBoolean cqDamScene7ConfigurationeventlistenerEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.
     *
     * @param cqDamScene7ConfigurationeventlistenerEnabled cqDamScene7ConfigurationeventlistenerEnabled
     */
    public ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties(
        ConfigNodePropertyBoolean cqDamScene7ConfigurationeventlistenerEnabled
    ) {
        this.cqDamScene7ConfigurationeventlistenerEnabled = cqDamScene7ConfigurationeventlistenerEnabled;
    }



    /**
     * Get cqDamScene7ConfigurationeventlistenerEnabled
     * @return cqDamScene7ConfigurationeventlistenerEnabled
     */
    public ConfigNodePropertyBoolean getCqDamScene7ConfigurationeventlistenerEnabled() {
        return cqDamScene7ConfigurationeventlistenerEnabled;
    }

    public void setCqDamScene7ConfigurationeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7ConfigurationeventlistenerEnabled) {
        this.cqDamScene7ConfigurationeventlistenerEnabled = cqDamScene7ConfigurationeventlistenerEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties {\n");
        
        sb.append("    cqDamScene7ConfigurationeventlistenerEnabled: ").append(toIndentedString(cqDamScene7ConfigurationeventlistenerEnabled)).append("\n");
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

