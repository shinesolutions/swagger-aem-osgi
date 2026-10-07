package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties   {

    private ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault;

    /**
     * Default constructor.
     */
    public ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties.
     *
     * @param liverelationshipmgrRelationsconfigDefault liverelationshipmgrRelationsconfigDefault
     */
    public ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties(
        ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault
    ) {
        this.liverelationshipmgrRelationsconfigDefault = liverelationshipmgrRelationsconfigDefault;
    }



    /**
     * Get liverelationshipmgrRelationsconfigDefault
     * @return liverelationshipmgrRelationsconfigDefault
     */
    public ConfigNodePropertyString getLiverelationshipmgrRelationsconfigDefault() {
        return liverelationshipmgrRelationsconfigDefault;
    }

    public void setLiverelationshipmgrRelationsconfigDefault(ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault) {
        this.liverelationshipmgrRelationsconfigDefault = liverelationshipmgrRelationsconfigDefault;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties {\n");
        
        sb.append("    liverelationshipmgrRelationsconfigDefault: ").append(toIndentedString(liverelationshipmgrRelationsconfigDefault)).append("\n");
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

