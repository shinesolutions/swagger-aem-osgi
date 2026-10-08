package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties   {

    private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl;
    private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey;
    private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject;
    private ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment;
    private ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.
     *
     * @param comAdobeCqScreensAnalyticsImplUrl comAdobeCqScreensAnalyticsImplUrl
     * @param comAdobeCqScreensAnalyticsImplApikey comAdobeCqScreensAnalyticsImplApikey
     * @param comAdobeCqScreensAnalyticsImplProject comAdobeCqScreensAnalyticsImplProject
     * @param comAdobeCqScreensAnalyticsImplEnvironment comAdobeCqScreensAnalyticsImplEnvironment
     * @param comAdobeCqScreensAnalyticsImplSendFrequency comAdobeCqScreensAnalyticsImplSendFrequency
     */
    public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(
        ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl, 
        ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey, 
        ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject, 
        ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment, 
        ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency
    ) {
        this.comAdobeCqScreensAnalyticsImplUrl = comAdobeCqScreensAnalyticsImplUrl;
        this.comAdobeCqScreensAnalyticsImplApikey = comAdobeCqScreensAnalyticsImplApikey;
        this.comAdobeCqScreensAnalyticsImplProject = comAdobeCqScreensAnalyticsImplProject;
        this.comAdobeCqScreensAnalyticsImplEnvironment = comAdobeCqScreensAnalyticsImplEnvironment;
        this.comAdobeCqScreensAnalyticsImplSendFrequency = comAdobeCqScreensAnalyticsImplSendFrequency;
    }



    /**
     * Get comAdobeCqScreensAnalyticsImplUrl
     * @return comAdobeCqScreensAnalyticsImplUrl
     */
    public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplUrl() {
        return comAdobeCqScreensAnalyticsImplUrl;
    }

    public void setComAdobeCqScreensAnalyticsImplUrl(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl) {
        this.comAdobeCqScreensAnalyticsImplUrl = comAdobeCqScreensAnalyticsImplUrl;
    }

    /**
     * Get comAdobeCqScreensAnalyticsImplApikey
     * @return comAdobeCqScreensAnalyticsImplApikey
     */
    public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplApikey() {
        return comAdobeCqScreensAnalyticsImplApikey;
    }

    public void setComAdobeCqScreensAnalyticsImplApikey(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey) {
        this.comAdobeCqScreensAnalyticsImplApikey = comAdobeCqScreensAnalyticsImplApikey;
    }

    /**
     * Get comAdobeCqScreensAnalyticsImplProject
     * @return comAdobeCqScreensAnalyticsImplProject
     */
    public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplProject() {
        return comAdobeCqScreensAnalyticsImplProject;
    }

    public void setComAdobeCqScreensAnalyticsImplProject(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject) {
        this.comAdobeCqScreensAnalyticsImplProject = comAdobeCqScreensAnalyticsImplProject;
    }

    /**
     * Get comAdobeCqScreensAnalyticsImplEnvironment
     * @return comAdobeCqScreensAnalyticsImplEnvironment
     */
    public ConfigNodePropertyDropDown getComAdobeCqScreensAnalyticsImplEnvironment() {
        return comAdobeCqScreensAnalyticsImplEnvironment;
    }

    public void setComAdobeCqScreensAnalyticsImplEnvironment(ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment) {
        this.comAdobeCqScreensAnalyticsImplEnvironment = comAdobeCqScreensAnalyticsImplEnvironment;
    }

    /**
     * Get comAdobeCqScreensAnalyticsImplSendFrequency
     * @return comAdobeCqScreensAnalyticsImplSendFrequency
     */
    public ConfigNodePropertyInteger getComAdobeCqScreensAnalyticsImplSendFrequency() {
        return comAdobeCqScreensAnalyticsImplSendFrequency;
    }

    public void setComAdobeCqScreensAnalyticsImplSendFrequency(ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency) {
        this.comAdobeCqScreensAnalyticsImplSendFrequency = comAdobeCqScreensAnalyticsImplSendFrequency;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties {\n");
        
        sb.append("    comAdobeCqScreensAnalyticsImplUrl: ").append(toIndentedString(comAdobeCqScreensAnalyticsImplUrl)).append("\n");
        sb.append("    comAdobeCqScreensAnalyticsImplApikey: ").append(toIndentedString(comAdobeCqScreensAnalyticsImplApikey)).append("\n");
        sb.append("    comAdobeCqScreensAnalyticsImplProject: ").append(toIndentedString(comAdobeCqScreensAnalyticsImplProject)).append("\n");
        sb.append("    comAdobeCqScreensAnalyticsImplEnvironment: ").append(toIndentedString(comAdobeCqScreensAnalyticsImplEnvironment)).append("\n");
        sb.append("    comAdobeCqScreensAnalyticsImplSendFrequency: ").append(toIndentedString(comAdobeCqScreensAnalyticsImplSendFrequency)).append("\n");
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

