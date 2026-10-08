package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties   {

    private ConfigNodePropertyBoolean graniteMaintenanceMandatory;
    private ConfigNodePropertyString jobTopics;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.
     *
     * @param graniteMaintenanceMandatory graniteMaintenanceMandatory
     * @param jobTopics jobTopics
     */
    public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(
        ConfigNodePropertyBoolean graniteMaintenanceMandatory, 
        ConfigNodePropertyString jobTopics
    ) {
        this.graniteMaintenanceMandatory = graniteMaintenanceMandatory;
        this.jobTopics = jobTopics;
    }



    /**
     * Get graniteMaintenanceMandatory
     * @return graniteMaintenanceMandatory
     */
    public ConfigNodePropertyBoolean getGraniteMaintenanceMandatory() {
        return graniteMaintenanceMandatory;
    }

    public void setGraniteMaintenanceMandatory(ConfigNodePropertyBoolean graniteMaintenanceMandatory) {
        this.graniteMaintenanceMandatory = graniteMaintenanceMandatory;
    }

    /**
     * Get jobTopics
     * @return jobTopics
     */
    public ConfigNodePropertyString getJobTopics() {
        return jobTopics;
    }

    public void setJobTopics(ConfigNodePropertyString jobTopics) {
        this.jobTopics = jobTopics;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties {\n");
        
        sb.append("    graniteMaintenanceMandatory: ").append(toIndentedString(graniteMaintenanceMandatory)).append("\n");
        sb.append("    jobTopics: ").append(toIndentedString(jobTopics)).append("\n");
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

