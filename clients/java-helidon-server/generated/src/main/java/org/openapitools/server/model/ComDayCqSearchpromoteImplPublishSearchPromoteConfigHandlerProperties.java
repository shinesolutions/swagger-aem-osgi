package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties   {

    private ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.
     *
     * @param cqSearchpromoteConfighandlerEnabled cqSearchpromoteConfighandlerEnabled
     */
    public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties(
        ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled
    ) {
        this.cqSearchpromoteConfighandlerEnabled = cqSearchpromoteConfighandlerEnabled;
    }



    /**
     * Get cqSearchpromoteConfighandlerEnabled
     * @return cqSearchpromoteConfighandlerEnabled
     */
    public ConfigNodePropertyBoolean getCqSearchpromoteConfighandlerEnabled() {
        return cqSearchpromoteConfighandlerEnabled;
    }

    public void setCqSearchpromoteConfighandlerEnabled(ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled) {
        this.cqSearchpromoteConfighandlerEnabled = cqSearchpromoteConfighandlerEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties {\n");
        
        sb.append("    cqSearchpromoteConfighandlerEnabled: ").append(toIndentedString(cqSearchpromoteConfighandlerEnabled)).append("\n");
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

