package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteFragsImplRandomFeatureProperties   {

    private ConfigNodePropertyString featureName;
    private ConfigNodePropertyString featureDescription;
    private ConfigNodePropertyString activePercentage;
    private ConfigNodePropertyString cookieName;
    private ConfigNodePropertyInteger cookieMaxAge;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteFragsImplRandomFeatureProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteFragsImplRandomFeatureProperties.
     *
     * @param featureName featureName
     * @param featureDescription featureDescription
     * @param activePercentage activePercentage
     * @param cookieName cookieName
     * @param cookieMaxAge cookieMaxAge
     */
    public ComAdobeGraniteFragsImplRandomFeatureProperties(
        ConfigNodePropertyString featureName, 
        ConfigNodePropertyString featureDescription, 
        ConfigNodePropertyString activePercentage, 
        ConfigNodePropertyString cookieName, 
        ConfigNodePropertyInteger cookieMaxAge
    ) {
        this.featureName = featureName;
        this.featureDescription = featureDescription;
        this.activePercentage = activePercentage;
        this.cookieName = cookieName;
        this.cookieMaxAge = cookieMaxAge;
    }



    /**
     * Get featureName
     * @return featureName
     */
    public ConfigNodePropertyString getFeatureName() {
        return featureName;
    }

    public void setFeatureName(ConfigNodePropertyString featureName) {
        this.featureName = featureName;
    }

    /**
     * Get featureDescription
     * @return featureDescription
     */
    public ConfigNodePropertyString getFeatureDescription() {
        return featureDescription;
    }

    public void setFeatureDescription(ConfigNodePropertyString featureDescription) {
        this.featureDescription = featureDescription;
    }

    /**
     * Get activePercentage
     * @return activePercentage
     */
    public ConfigNodePropertyString getActivePercentage() {
        return activePercentage;
    }

    public void setActivePercentage(ConfigNodePropertyString activePercentage) {
        this.activePercentage = activePercentage;
    }

    /**
     * Get cookieName
     * @return cookieName
     */
    public ConfigNodePropertyString getCookieName() {
        return cookieName;
    }

    public void setCookieName(ConfigNodePropertyString cookieName) {
        this.cookieName = cookieName;
    }

    /**
     * Get cookieMaxAge
     * @return cookieMaxAge
     */
    public ConfigNodePropertyInteger getCookieMaxAge() {
        return cookieMaxAge;
    }

    public void setCookieMaxAge(ConfigNodePropertyInteger cookieMaxAge) {
        this.cookieMaxAge = cookieMaxAge;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteFragsImplRandomFeatureProperties {\n");
        
        sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
        sb.append("    featureDescription: ").append(toIndentedString(featureDescription)).append("\n");
        sb.append("    activePercentage: ").append(toIndentedString(activePercentage)).append("\n");
        sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
        sb.append("    cookieMaxAge: ").append(toIndentedString(cookieMaxAge)).append("\n");
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

