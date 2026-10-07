package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties   {

    private ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.
     *
     * @param comAdobeDamMacSyncClientSoTimeout comAdobeDamMacSyncClientSoTimeout
     */
    public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties(
        ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout
    ) {
        this.comAdobeDamMacSyncClientSoTimeout = comAdobeDamMacSyncClientSoTimeout;
    }



    /**
     * Get comAdobeDamMacSyncClientSoTimeout
     * @return comAdobeDamMacSyncClientSoTimeout
     */
    public ConfigNodePropertyInteger getComAdobeDamMacSyncClientSoTimeout() {
        return comAdobeDamMacSyncClientSoTimeout;
    }

    public void setComAdobeDamMacSyncClientSoTimeout(ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout) {
        this.comAdobeDamMacSyncClientSoTimeout = comAdobeDamMacSyncClientSoTimeout;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties {\n");
        
        sb.append("    comAdobeDamMacSyncClientSoTimeout: ").append(toIndentedString(comAdobeDamMacSyncClientSoTimeout)).append("\n");
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

