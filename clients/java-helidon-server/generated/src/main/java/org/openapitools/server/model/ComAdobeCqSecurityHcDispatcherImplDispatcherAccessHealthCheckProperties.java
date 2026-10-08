package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties   {

    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyString dispatcherAddress;
    private ConfigNodePropertyArray dispatcherFilterAllowed;
    private ConfigNodePropertyArray dispatcherFilterBlocked;

    /**
     * Default constructor.
     */
    public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.
     *
     * @param hcTags hcTags
     * @param dispatcherAddress dispatcherAddress
     * @param dispatcherFilterAllowed dispatcherFilterAllowed
     * @param dispatcherFilterBlocked dispatcherFilterBlocked
     */
    public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyString dispatcherAddress, 
        ConfigNodePropertyArray dispatcherFilterAllowed, 
        ConfigNodePropertyArray dispatcherFilterBlocked
    ) {
        this.hcTags = hcTags;
        this.dispatcherAddress = dispatcherAddress;
        this.dispatcherFilterAllowed = dispatcherFilterAllowed;
        this.dispatcherFilterBlocked = dispatcherFilterBlocked;
    }



    /**
     * Get hcTags
     * @return hcTags
     */
    public ConfigNodePropertyArray getHcTags() {
        return hcTags;
    }

    public void setHcTags(ConfigNodePropertyArray hcTags) {
        this.hcTags = hcTags;
    }

    /**
     * Get dispatcherAddress
     * @return dispatcherAddress
     */
    public ConfigNodePropertyString getDispatcherAddress() {
        return dispatcherAddress;
    }

    public void setDispatcherAddress(ConfigNodePropertyString dispatcherAddress) {
        this.dispatcherAddress = dispatcherAddress;
    }

    /**
     * Get dispatcherFilterAllowed
     * @return dispatcherFilterAllowed
     */
    public ConfigNodePropertyArray getDispatcherFilterAllowed() {
        return dispatcherFilterAllowed;
    }

    public void setDispatcherFilterAllowed(ConfigNodePropertyArray dispatcherFilterAllowed) {
        this.dispatcherFilterAllowed = dispatcherFilterAllowed;
    }

    /**
     * Get dispatcherFilterBlocked
     * @return dispatcherFilterBlocked
     */
    public ConfigNodePropertyArray getDispatcherFilterBlocked() {
        return dispatcherFilterBlocked;
    }

    public void setDispatcherFilterBlocked(ConfigNodePropertyArray dispatcherFilterBlocked) {
        this.dispatcherFilterBlocked = dispatcherFilterBlocked;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties {\n");
        
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    dispatcherAddress: ").append(toIndentedString(dispatcherAddress)).append("\n");
        sb.append("    dispatcherFilterAllowed: ").append(toIndentedString(dispatcherFilterAllowed)).append("\n");
        sb.append("    dispatcherFilterBlocked: ").append(toIndentedString(dispatcherFilterBlocked)).append("\n");
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

