package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties   {

    private ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths;
    private ConfigNodePropertyArray inboxImplTypeproviderLegacypaths;
    private ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem;
    private ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem;
    private ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask;

    /**
     * Default constructor.
     */
    public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.
     *
     * @param inboxImplTypeproviderRegistrypaths inboxImplTypeproviderRegistrypaths
     * @param inboxImplTypeproviderLegacypaths inboxImplTypeproviderLegacypaths
     * @param inboxImplTypeproviderDefaulturlFailureitem inboxImplTypeproviderDefaulturlFailureitem
     * @param inboxImplTypeproviderDefaulturlWorkitem inboxImplTypeproviderDefaulturlWorkitem
     * @param inboxImplTypeproviderDefaulturlTask inboxImplTypeproviderDefaulturlTask
     */
    public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(
        ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths, 
        ConfigNodePropertyArray inboxImplTypeproviderLegacypaths, 
        ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem, 
        ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem, 
        ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask
    ) {
        this.inboxImplTypeproviderRegistrypaths = inboxImplTypeproviderRegistrypaths;
        this.inboxImplTypeproviderLegacypaths = inboxImplTypeproviderLegacypaths;
        this.inboxImplTypeproviderDefaulturlFailureitem = inboxImplTypeproviderDefaulturlFailureitem;
        this.inboxImplTypeproviderDefaulturlWorkitem = inboxImplTypeproviderDefaulturlWorkitem;
        this.inboxImplTypeproviderDefaulturlTask = inboxImplTypeproviderDefaulturlTask;
    }



    /**
     * Get inboxImplTypeproviderRegistrypaths
     * @return inboxImplTypeproviderRegistrypaths
     */
    public ConfigNodePropertyArray getInboxImplTypeproviderRegistrypaths() {
        return inboxImplTypeproviderRegistrypaths;
    }

    public void setInboxImplTypeproviderRegistrypaths(ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths) {
        this.inboxImplTypeproviderRegistrypaths = inboxImplTypeproviderRegistrypaths;
    }

    /**
     * Get inboxImplTypeproviderLegacypaths
     * @return inboxImplTypeproviderLegacypaths
     */
    public ConfigNodePropertyArray getInboxImplTypeproviderLegacypaths() {
        return inboxImplTypeproviderLegacypaths;
    }

    public void setInboxImplTypeproviderLegacypaths(ConfigNodePropertyArray inboxImplTypeproviderLegacypaths) {
        this.inboxImplTypeproviderLegacypaths = inboxImplTypeproviderLegacypaths;
    }

    /**
     * Get inboxImplTypeproviderDefaulturlFailureitem
     * @return inboxImplTypeproviderDefaulturlFailureitem
     */
    public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlFailureitem() {
        return inboxImplTypeproviderDefaulturlFailureitem;
    }

    public void setInboxImplTypeproviderDefaulturlFailureitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem) {
        this.inboxImplTypeproviderDefaulturlFailureitem = inboxImplTypeproviderDefaulturlFailureitem;
    }

    /**
     * Get inboxImplTypeproviderDefaulturlWorkitem
     * @return inboxImplTypeproviderDefaulturlWorkitem
     */
    public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlWorkitem() {
        return inboxImplTypeproviderDefaulturlWorkitem;
    }

    public void setInboxImplTypeproviderDefaulturlWorkitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem) {
        this.inboxImplTypeproviderDefaulturlWorkitem = inboxImplTypeproviderDefaulturlWorkitem;
    }

    /**
     * Get inboxImplTypeproviderDefaulturlTask
     * @return inboxImplTypeproviderDefaulturlTask
     */
    public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlTask() {
        return inboxImplTypeproviderDefaulturlTask;
    }

    public void setInboxImplTypeproviderDefaulturlTask(ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask) {
        this.inboxImplTypeproviderDefaulturlTask = inboxImplTypeproviderDefaulturlTask;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties {\n");
        
        sb.append("    inboxImplTypeproviderRegistrypaths: ").append(toIndentedString(inboxImplTypeproviderRegistrypaths)).append("\n");
        sb.append("    inboxImplTypeproviderLegacypaths: ").append(toIndentedString(inboxImplTypeproviderLegacypaths)).append("\n");
        sb.append("    inboxImplTypeproviderDefaulturlFailureitem: ").append(toIndentedString(inboxImplTypeproviderDefaulturlFailureitem)).append("\n");
        sb.append("    inboxImplTypeproviderDefaulturlWorkitem: ").append(toIndentedString(inboxImplTypeproviderDefaulturlWorkitem)).append("\n");
        sb.append("    inboxImplTypeproviderDefaulturlTask: ").append(toIndentedString(inboxImplTypeproviderDefaulturlTask)).append("\n");
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

