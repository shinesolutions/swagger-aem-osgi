package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqProjectsImplServletProjectImageServletProperties   {

    private ConfigNodePropertyString imageQuality;
    private ConfigNodePropertyString imageSupportedResolutions;

    /**
     * Default constructor.
     */
    public ComAdobeCqProjectsImplServletProjectImageServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqProjectsImplServletProjectImageServletProperties.
     *
     * @param imageQuality imageQuality
     * @param imageSupportedResolutions imageSupportedResolutions
     */
    public ComAdobeCqProjectsImplServletProjectImageServletProperties(
        ConfigNodePropertyString imageQuality, 
        ConfigNodePropertyString imageSupportedResolutions
    ) {
        this.imageQuality = imageQuality;
        this.imageSupportedResolutions = imageSupportedResolutions;
    }



    /**
     * Get imageQuality
     * @return imageQuality
     */
    public ConfigNodePropertyString getImageQuality() {
        return imageQuality;
    }

    public void setImageQuality(ConfigNodePropertyString imageQuality) {
        this.imageQuality = imageQuality;
    }

    /**
     * Get imageSupportedResolutions
     * @return imageSupportedResolutions
     */
    public ConfigNodePropertyString getImageSupportedResolutions() {
        return imageSupportedResolutions;
    }

    public void setImageSupportedResolutions(ConfigNodePropertyString imageSupportedResolutions) {
        this.imageSupportedResolutions = imageSupportedResolutions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqProjectsImplServletProjectImageServletProperties {\n");
        
        sb.append("    imageQuality: ").append(toIndentedString(imageQuality)).append("\n");
        sb.append("    imageSupportedResolutions: ").append(toIndentedString(imageSupportedResolutions)).append("\n");
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

