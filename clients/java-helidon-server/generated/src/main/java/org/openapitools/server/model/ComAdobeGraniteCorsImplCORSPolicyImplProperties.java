package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteCorsImplCORSPolicyImplProperties   {

    private ConfigNodePropertyArray alloworigin;
    private ConfigNodePropertyArray alloworiginregexp;
    private ConfigNodePropertyArray allowedpaths;
    private ConfigNodePropertyArray exposedheaders;
    private ConfigNodePropertyInteger maxage;
    private ConfigNodePropertyArray supportedheaders;
    private ConfigNodePropertyArray supportedmethods;
    private ConfigNodePropertyBoolean supportscredentials;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteCorsImplCORSPolicyImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteCorsImplCORSPolicyImplProperties.
     *
     * @param alloworigin alloworigin
     * @param alloworiginregexp alloworiginregexp
     * @param allowedpaths allowedpaths
     * @param exposedheaders exposedheaders
     * @param maxage maxage
     * @param supportedheaders supportedheaders
     * @param supportedmethods supportedmethods
     * @param supportscredentials supportscredentials
     */
    public ComAdobeGraniteCorsImplCORSPolicyImplProperties(
        ConfigNodePropertyArray alloworigin, 
        ConfigNodePropertyArray alloworiginregexp, 
        ConfigNodePropertyArray allowedpaths, 
        ConfigNodePropertyArray exposedheaders, 
        ConfigNodePropertyInteger maxage, 
        ConfigNodePropertyArray supportedheaders, 
        ConfigNodePropertyArray supportedmethods, 
        ConfigNodePropertyBoolean supportscredentials
    ) {
        this.alloworigin = alloworigin;
        this.alloworiginregexp = alloworiginregexp;
        this.allowedpaths = allowedpaths;
        this.exposedheaders = exposedheaders;
        this.maxage = maxage;
        this.supportedheaders = supportedheaders;
        this.supportedmethods = supportedmethods;
        this.supportscredentials = supportscredentials;
    }



    /**
     * Get alloworigin
     * @return alloworigin
     */
    public ConfigNodePropertyArray getAlloworigin() {
        return alloworigin;
    }

    public void setAlloworigin(ConfigNodePropertyArray alloworigin) {
        this.alloworigin = alloworigin;
    }

    /**
     * Get alloworiginregexp
     * @return alloworiginregexp
     */
    public ConfigNodePropertyArray getAlloworiginregexp() {
        return alloworiginregexp;
    }

    public void setAlloworiginregexp(ConfigNodePropertyArray alloworiginregexp) {
        this.alloworiginregexp = alloworiginregexp;
    }

    /**
     * Get allowedpaths
     * @return allowedpaths
     */
    public ConfigNodePropertyArray getAllowedpaths() {
        return allowedpaths;
    }

    public void setAllowedpaths(ConfigNodePropertyArray allowedpaths) {
        this.allowedpaths = allowedpaths;
    }

    /**
     * Get exposedheaders
     * @return exposedheaders
     */
    public ConfigNodePropertyArray getExposedheaders() {
        return exposedheaders;
    }

    public void setExposedheaders(ConfigNodePropertyArray exposedheaders) {
        this.exposedheaders = exposedheaders;
    }

    /**
     * Get maxage
     * @return maxage
     */
    public ConfigNodePropertyInteger getMaxage() {
        return maxage;
    }

    public void setMaxage(ConfigNodePropertyInteger maxage) {
        this.maxage = maxage;
    }

    /**
     * Get supportedheaders
     * @return supportedheaders
     */
    public ConfigNodePropertyArray getSupportedheaders() {
        return supportedheaders;
    }

    public void setSupportedheaders(ConfigNodePropertyArray supportedheaders) {
        this.supportedheaders = supportedheaders;
    }

    /**
     * Get supportedmethods
     * @return supportedmethods
     */
    public ConfigNodePropertyArray getSupportedmethods() {
        return supportedmethods;
    }

    public void setSupportedmethods(ConfigNodePropertyArray supportedmethods) {
        this.supportedmethods = supportedmethods;
    }

    /**
     * Get supportscredentials
     * @return supportscredentials
     */
    public ConfigNodePropertyBoolean getSupportscredentials() {
        return supportscredentials;
    }

    public void setSupportscredentials(ConfigNodePropertyBoolean supportscredentials) {
        this.supportscredentials = supportscredentials;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteCorsImplCORSPolicyImplProperties {\n");
        
        sb.append("    alloworigin: ").append(toIndentedString(alloworigin)).append("\n");
        sb.append("    alloworiginregexp: ").append(toIndentedString(alloworiginregexp)).append("\n");
        sb.append("    allowedpaths: ").append(toIndentedString(allowedpaths)).append("\n");
        sb.append("    exposedheaders: ").append(toIndentedString(exposedheaders)).append("\n");
        sb.append("    maxage: ").append(toIndentedString(maxage)).append("\n");
        sb.append("    supportedheaders: ").append(toIndentedString(supportedheaders)).append("\n");
        sb.append("    supportedmethods: ").append(toIndentedString(supportedmethods)).append("\n");
        sb.append("    supportscredentials: ").append(toIndentedString(supportscredentials)).append("\n");
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

