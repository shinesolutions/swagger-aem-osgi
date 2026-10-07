package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties   {

    private ConfigNodePropertyArray fieldWhitelist;
    private ConfigNodePropertyArray sitePathFilters;
    private ConfigNodePropertyString sitePackageGroup;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.
     *
     * @param fieldWhitelist fieldWhitelist
     * @param sitePathFilters sitePathFilters
     * @param sitePackageGroup sitePackageGroup
     */
    public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(
        ConfigNodePropertyArray fieldWhitelist, 
        ConfigNodePropertyArray sitePathFilters, 
        ConfigNodePropertyString sitePackageGroup
    ) {
        this.fieldWhitelist = fieldWhitelist;
        this.sitePathFilters = sitePathFilters;
        this.sitePackageGroup = sitePackageGroup;
    }



    /**
     * Get fieldWhitelist
     * @return fieldWhitelist
     */
    public ConfigNodePropertyArray getFieldWhitelist() {
        return fieldWhitelist;
    }

    public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
        this.fieldWhitelist = fieldWhitelist;
    }

    /**
     * Get sitePathFilters
     * @return sitePathFilters
     */
    public ConfigNodePropertyArray getSitePathFilters() {
        return sitePathFilters;
    }

    public void setSitePathFilters(ConfigNodePropertyArray sitePathFilters) {
        this.sitePathFilters = sitePathFilters;
    }

    /**
     * Get sitePackageGroup
     * @return sitePackageGroup
     */
    public ConfigNodePropertyString getSitePackageGroup() {
        return sitePackageGroup;
    }

    public void setSitePackageGroup(ConfigNodePropertyString sitePackageGroup) {
        this.sitePackageGroup = sitePackageGroup;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties {\n");
        
        sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
        sb.append("    sitePathFilters: ").append(toIndentedString(sitePathFilters)).append("\n");
        sb.append("    sitePackageGroup: ").append(toIndentedString(sitePackageGroup)).append("\n");
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

