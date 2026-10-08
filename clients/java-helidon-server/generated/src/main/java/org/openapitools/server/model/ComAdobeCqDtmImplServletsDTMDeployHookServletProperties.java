package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties   {

    private ConfigNodePropertyArray dtmStagingIpWhitelist;
    private ConfigNodePropertyArray dtmProductionIpWhitelist;

    /**
     * Default constructor.
     */
    public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.
     *
     * @param dtmStagingIpWhitelist dtmStagingIpWhitelist
     * @param dtmProductionIpWhitelist dtmProductionIpWhitelist
     */
    public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties(
        ConfigNodePropertyArray dtmStagingIpWhitelist, 
        ConfigNodePropertyArray dtmProductionIpWhitelist
    ) {
        this.dtmStagingIpWhitelist = dtmStagingIpWhitelist;
        this.dtmProductionIpWhitelist = dtmProductionIpWhitelist;
    }



    /**
     * Get dtmStagingIpWhitelist
     * @return dtmStagingIpWhitelist
     */
    public ConfigNodePropertyArray getDtmStagingIpWhitelist() {
        return dtmStagingIpWhitelist;
    }

    public void setDtmStagingIpWhitelist(ConfigNodePropertyArray dtmStagingIpWhitelist) {
        this.dtmStagingIpWhitelist = dtmStagingIpWhitelist;
    }

    /**
     * Get dtmProductionIpWhitelist
     * @return dtmProductionIpWhitelist
     */
    public ConfigNodePropertyArray getDtmProductionIpWhitelist() {
        return dtmProductionIpWhitelist;
    }

    public void setDtmProductionIpWhitelist(ConfigNodePropertyArray dtmProductionIpWhitelist) {
        this.dtmProductionIpWhitelist = dtmProductionIpWhitelist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {\n");
        
        sb.append("    dtmStagingIpWhitelist: ").append(toIndentedString(dtmStagingIpWhitelist)).append("\n");
        sb.append("    dtmProductionIpWhitelist: ").append(toIndentedString(dtmProductionIpWhitelist)).append("\n");
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

