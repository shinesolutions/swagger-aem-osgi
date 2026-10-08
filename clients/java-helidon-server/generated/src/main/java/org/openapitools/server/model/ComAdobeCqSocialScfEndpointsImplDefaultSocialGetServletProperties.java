package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties   {

    private ConfigNodePropertyArray slingServletSelectors;
    private ConfigNodePropertyString slingServletExtensions;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.
     *
     * @param slingServletSelectors slingServletSelectors
     * @param slingServletExtensions slingServletExtensions
     */
    public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties(
        ConfigNodePropertyArray slingServletSelectors, 
        ConfigNodePropertyString slingServletExtensions
    ) {
        this.slingServletSelectors = slingServletSelectors;
        this.slingServletExtensions = slingServletExtensions;
    }



    /**
     * Get slingServletSelectors
     * @return slingServletSelectors
     */
    public ConfigNodePropertyArray getSlingServletSelectors() {
        return slingServletSelectors;
    }

    public void setSlingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
        this.slingServletSelectors = slingServletSelectors;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties {\n");
        
        sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
        sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
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

