package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties   {

    private ConfigNodePropertyBoolean offloadingJobclonerEnabled;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.
     *
     * @param offloadingJobclonerEnabled offloadingJobclonerEnabled
     */
    public ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(
        ConfigNodePropertyBoolean offloadingJobclonerEnabled
    ) {
        this.offloadingJobclonerEnabled = offloadingJobclonerEnabled;
    }



    /**
     * Get offloadingJobclonerEnabled
     * @return offloadingJobclonerEnabled
     */
    public ConfigNodePropertyBoolean getOffloadingJobclonerEnabled() {
        return offloadingJobclonerEnabled;
    }

    public void setOffloadingJobclonerEnabled(ConfigNodePropertyBoolean offloadingJobclonerEnabled) {
        this.offloadingJobclonerEnabled = offloadingJobclonerEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {\n");
        
        sb.append("    offloadingJobclonerEnabled: ").append(toIndentedString(offloadingJobclonerEnabled)).append("\n");
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

