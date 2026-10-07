package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingSecurityImplReferrerFilterProperties   {

    private ConfigNodePropertyBoolean allowEmpty;
    private ConfigNodePropertyArray allowHosts;
    private ConfigNodePropertyArray allowHostsRegexp;
    private ConfigNodePropertyArray filterMethods;
    private ConfigNodePropertyArray excludeAgentsRegexp;

    /**
     * Default constructor.
     */
    public OrgApacheSlingSecurityImplReferrerFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingSecurityImplReferrerFilterProperties.
     *
     * @param allowEmpty allowEmpty
     * @param allowHosts allowHosts
     * @param allowHostsRegexp allowHostsRegexp
     * @param filterMethods filterMethods
     * @param excludeAgentsRegexp excludeAgentsRegexp
     */
    public OrgApacheSlingSecurityImplReferrerFilterProperties(
        ConfigNodePropertyBoolean allowEmpty, 
        ConfigNodePropertyArray allowHosts, 
        ConfigNodePropertyArray allowHostsRegexp, 
        ConfigNodePropertyArray filterMethods, 
        ConfigNodePropertyArray excludeAgentsRegexp
    ) {
        this.allowEmpty = allowEmpty;
        this.allowHosts = allowHosts;
        this.allowHostsRegexp = allowHostsRegexp;
        this.filterMethods = filterMethods;
        this.excludeAgentsRegexp = excludeAgentsRegexp;
    }



    /**
     * Get allowEmpty
     * @return allowEmpty
     */
    public ConfigNodePropertyBoolean getAllowEmpty() {
        return allowEmpty;
    }

    public void setAllowEmpty(ConfigNodePropertyBoolean allowEmpty) {
        this.allowEmpty = allowEmpty;
    }

    /**
     * Get allowHosts
     * @return allowHosts
     */
    public ConfigNodePropertyArray getAllowHosts() {
        return allowHosts;
    }

    public void setAllowHosts(ConfigNodePropertyArray allowHosts) {
        this.allowHosts = allowHosts;
    }

    /**
     * Get allowHostsRegexp
     * @return allowHostsRegexp
     */
    public ConfigNodePropertyArray getAllowHostsRegexp() {
        return allowHostsRegexp;
    }

    public void setAllowHostsRegexp(ConfigNodePropertyArray allowHostsRegexp) {
        this.allowHostsRegexp = allowHostsRegexp;
    }

    /**
     * Get filterMethods
     * @return filterMethods
     */
    public ConfigNodePropertyArray getFilterMethods() {
        return filterMethods;
    }

    public void setFilterMethods(ConfigNodePropertyArray filterMethods) {
        this.filterMethods = filterMethods;
    }

    /**
     * Get excludeAgentsRegexp
     * @return excludeAgentsRegexp
     */
    public ConfigNodePropertyArray getExcludeAgentsRegexp() {
        return excludeAgentsRegexp;
    }

    public void setExcludeAgentsRegexp(ConfigNodePropertyArray excludeAgentsRegexp) {
        this.excludeAgentsRegexp = excludeAgentsRegexp;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingSecurityImplReferrerFilterProperties {\n");
        
        sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
        sb.append("    allowHosts: ").append(toIndentedString(allowHosts)).append("\n");
        sb.append("    allowHostsRegexp: ").append(toIndentedString(allowHostsRegexp)).append("\n");
        sb.append("    filterMethods: ").append(toIndentedString(filterMethods)).append("\n");
        sb.append("    excludeAgentsRegexp: ").append(toIndentedString(excludeAgentsRegexp)).append("\n");
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

