package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties   {

    private ConfigNodePropertyString slingServletExtensions;
    private ConfigNodePropertyString slingServletPaths;
    private ConfigNodePropertyString slingServletMethods;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.
     *
     * @param slingServletExtensions slingServletExtensions
     * @param slingServletPaths slingServletPaths
     * @param slingServletMethods slingServletMethods
     */
    public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties(
        ConfigNodePropertyString slingServletExtensions, 
        ConfigNodePropertyString slingServletPaths, 
        ConfigNodePropertyString slingServletMethods
    ) {
        this.slingServletExtensions = slingServletExtensions;
        this.slingServletPaths = slingServletPaths;
        this.slingServletMethods = slingServletMethods;
    }



    /**
     * Get slingServletExtensions
     * @return slingServletExtensions
     */
    public ConfigNodePropertyString getSlingServletExtensions() {
        return slingServletExtensions;
    }

    public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
        this.slingServletExtensions = slingServletExtensions;
    }

    /**
     * Get slingServletPaths
     * @return slingServletPaths
     */
    public ConfigNodePropertyString getSlingServletPaths() {
        return slingServletPaths;
    }

    public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
        this.slingServletPaths = slingServletPaths;
    }

    /**
     * Get slingServletMethods
     * @return slingServletMethods
     */
    public ConfigNodePropertyString getSlingServletMethods() {
        return slingServletMethods;
    }

    public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
        this.slingServletMethods = slingServletMethods;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties {\n");
        
        sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
        sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
        sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
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

