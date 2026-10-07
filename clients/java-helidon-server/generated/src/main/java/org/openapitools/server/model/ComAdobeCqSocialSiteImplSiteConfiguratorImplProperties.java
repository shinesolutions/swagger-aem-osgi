package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties   {

    private ConfigNodePropertyArray componentsUsingTags;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.
     *
     * @param componentsUsingTags componentsUsingTags
     */
    public ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties(
        ConfigNodePropertyArray componentsUsingTags
    ) {
        this.componentsUsingTags = componentsUsingTags;
    }



    /**
     * Get componentsUsingTags
     * @return componentsUsingTags
     */
    public ConfigNodePropertyArray getComponentsUsingTags() {
        return componentsUsingTags;
    }

    public void setComponentsUsingTags(ConfigNodePropertyArray componentsUsingTags) {
        this.componentsUsingTags = componentsUsingTags;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {\n");
        
        sb.append("    componentsUsingTags: ").append(toIndentedString(componentsUsingTags)).append("\n");
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

