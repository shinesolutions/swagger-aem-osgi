package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties   {

    private ConfigNodePropertyInteger serviceMaxLinksPerHost;
    private ConfigNodePropertyBoolean serviceSaveExternalLinkReferences;

    /**
     * Default constructor.
     */
    public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.
     *
     * @param serviceMaxLinksPerHost serviceMaxLinksPerHost
     * @param serviceSaveExternalLinkReferences serviceSaveExternalLinkReferences
     */
    public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(
        ConfigNodePropertyInteger serviceMaxLinksPerHost, 
        ConfigNodePropertyBoolean serviceSaveExternalLinkReferences
    ) {
        this.serviceMaxLinksPerHost = serviceMaxLinksPerHost;
        this.serviceSaveExternalLinkReferences = serviceSaveExternalLinkReferences;
    }



    /**
     * Get serviceMaxLinksPerHost
     * @return serviceMaxLinksPerHost
     */
    public ConfigNodePropertyInteger getServiceMaxLinksPerHost() {
        return serviceMaxLinksPerHost;
    }

    public void setServiceMaxLinksPerHost(ConfigNodePropertyInteger serviceMaxLinksPerHost) {
        this.serviceMaxLinksPerHost = serviceMaxLinksPerHost;
    }

    /**
     * Get serviceSaveExternalLinkReferences
     * @return serviceSaveExternalLinkReferences
     */
    public ConfigNodePropertyBoolean getServiceSaveExternalLinkReferences() {
        return serviceSaveExternalLinkReferences;
    }

    public void setServiceSaveExternalLinkReferences(ConfigNodePropertyBoolean serviceSaveExternalLinkReferences) {
        this.serviceSaveExternalLinkReferences = serviceSaveExternalLinkReferences;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties {\n");
        
        sb.append("    serviceMaxLinksPerHost: ").append(toIndentedString(serviceMaxLinksPerHost)).append("\n");
        sb.append("    serviceSaveExternalLinkReferences: ").append(toIndentedString(serviceSaveExternalLinkReferences)).append("\n");
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

