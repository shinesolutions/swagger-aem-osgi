package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties   {

    private ConfigNodePropertyString slingAuthRequirements;

    /**
     * Default constructor.
     */
    public ComDayCqWcmFoundationImplPageImpressionsTrackerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.
     *
     * @param slingAuthRequirements slingAuthRequirements
     */
    public ComDayCqWcmFoundationImplPageImpressionsTrackerProperties(
        ConfigNodePropertyString slingAuthRequirements
    ) {
        this.slingAuthRequirements = slingAuthRequirements;
    }



    /**
     * Get slingAuthRequirements
     * @return slingAuthRequirements
     */
    public ConfigNodePropertyString getSlingAuthRequirements() {
        return slingAuthRequirements;
    }

    public void setSlingAuthRequirements(ConfigNodePropertyString slingAuthRequirements) {
        this.slingAuthRequirements = slingAuthRequirements;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties {\n");
        
        sb.append("    slingAuthRequirements: ").append(toIndentedString(slingAuthRequirements)).append("\n");
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

