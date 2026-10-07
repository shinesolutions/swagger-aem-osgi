package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties   {

    private ConfigNodePropertyArray nodetypes;
    private ConfigNodePropertyArray ignorableprops;
    private ConfigNodePropertyString ignorablenodes;
    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyString distfolders;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.
     *
     * @param nodetypes nodetypes
     * @param ignorableprops ignorableprops
     * @param ignorablenodes ignorablenodes
     * @param enabled enabled
     * @param distfolders distfolders
     */
    public ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties(
        ConfigNodePropertyArray nodetypes, 
        ConfigNodePropertyArray ignorableprops, 
        ConfigNodePropertyString ignorablenodes, 
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyString distfolders
    ) {
        this.nodetypes = nodetypes;
        this.ignorableprops = ignorableprops;
        this.ignorablenodes = ignorablenodes;
        this.enabled = enabled;
        this.distfolders = distfolders;
    }



    /**
     * Get nodetypes
     * @return nodetypes
     */
    public ConfigNodePropertyArray getNodetypes() {
        return nodetypes;
    }

    public void setNodetypes(ConfigNodePropertyArray nodetypes) {
        this.nodetypes = nodetypes;
    }

    /**
     * Get ignorableprops
     * @return ignorableprops
     */
    public ConfigNodePropertyArray getIgnorableprops() {
        return ignorableprops;
    }

    public void setIgnorableprops(ConfigNodePropertyArray ignorableprops) {
        this.ignorableprops = ignorableprops;
    }

    /**
     * Get ignorablenodes
     * @return ignorablenodes
     */
    public ConfigNodePropertyString getIgnorablenodes() {
        return ignorablenodes;
    }

    public void setIgnorablenodes(ConfigNodePropertyString ignorablenodes) {
        this.ignorablenodes = ignorablenodes;
    }

    /**
     * Get enabled
     * @return enabled
     */
    public ConfigNodePropertyBoolean getEnabled() {
        return enabled;
    }

    public void setEnabled(ConfigNodePropertyBoolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get distfolders
     * @return distfolders
     */
    public ConfigNodePropertyString getDistfolders() {
        return distfolders;
    }

    public void setDistfolders(ConfigNodePropertyString distfolders) {
        this.distfolders = distfolders;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties {\n");
        
        sb.append("    nodetypes: ").append(toIndentedString(nodetypes)).append("\n");
        sb.append("    ignorableprops: ").append(toIndentedString(ignorableprops)).append("\n");
        sb.append("    ignorablenodes: ").append(toIndentedString(ignorablenodes)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    distfolders: ").append(toIndentedString(distfolders)).append("\n");
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

