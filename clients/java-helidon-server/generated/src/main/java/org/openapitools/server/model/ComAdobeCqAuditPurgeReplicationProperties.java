package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqAuditPurgeReplicationProperties   {

    private ConfigNodePropertyString auditlogRuleName;
    private ConfigNodePropertyString auditlogRuleContentpath;
    private ConfigNodePropertyInteger auditlogRuleMinimumage;
    private ConfigNodePropertyDropDown auditlogRuleTypes;

    /**
     * Default constructor.
     */
    public ComAdobeCqAuditPurgeReplicationProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqAuditPurgeReplicationProperties.
     *
     * @param auditlogRuleName auditlogRuleName
     * @param auditlogRuleContentpath auditlogRuleContentpath
     * @param auditlogRuleMinimumage auditlogRuleMinimumage
     * @param auditlogRuleTypes auditlogRuleTypes
     */
    public ComAdobeCqAuditPurgeReplicationProperties(
        ConfigNodePropertyString auditlogRuleName, 
        ConfigNodePropertyString auditlogRuleContentpath, 
        ConfigNodePropertyInteger auditlogRuleMinimumage, 
        ConfigNodePropertyDropDown auditlogRuleTypes
    ) {
        this.auditlogRuleName = auditlogRuleName;
        this.auditlogRuleContentpath = auditlogRuleContentpath;
        this.auditlogRuleMinimumage = auditlogRuleMinimumage;
        this.auditlogRuleTypes = auditlogRuleTypes;
    }



    /**
     * Get auditlogRuleName
     * @return auditlogRuleName
     */
    public ConfigNodePropertyString getAuditlogRuleName() {
        return auditlogRuleName;
    }

    public void setAuditlogRuleName(ConfigNodePropertyString auditlogRuleName) {
        this.auditlogRuleName = auditlogRuleName;
    }

    /**
     * Get auditlogRuleContentpath
     * @return auditlogRuleContentpath
     */
    public ConfigNodePropertyString getAuditlogRuleContentpath() {
        return auditlogRuleContentpath;
    }

    public void setAuditlogRuleContentpath(ConfigNodePropertyString auditlogRuleContentpath) {
        this.auditlogRuleContentpath = auditlogRuleContentpath;
    }

    /**
     * Get auditlogRuleMinimumage
     * @return auditlogRuleMinimumage
     */
    public ConfigNodePropertyInteger getAuditlogRuleMinimumage() {
        return auditlogRuleMinimumage;
    }

    public void setAuditlogRuleMinimumage(ConfigNodePropertyInteger auditlogRuleMinimumage) {
        this.auditlogRuleMinimumage = auditlogRuleMinimumage;
    }

    /**
     * Get auditlogRuleTypes
     * @return auditlogRuleTypes
     */
    public ConfigNodePropertyDropDown getAuditlogRuleTypes() {
        return auditlogRuleTypes;
    }

    public void setAuditlogRuleTypes(ConfigNodePropertyDropDown auditlogRuleTypes) {
        this.auditlogRuleTypes = auditlogRuleTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqAuditPurgeReplicationProperties {\n");
        
        sb.append("    auditlogRuleName: ").append(toIndentedString(auditlogRuleName)).append("\n");
        sb.append("    auditlogRuleContentpath: ").append(toIndentedString(auditlogRuleContentpath)).append("\n");
        sb.append("    auditlogRuleMinimumage: ").append(toIndentedString(auditlogRuleMinimumage)).append("\n");
        sb.append("    auditlogRuleTypes: ").append(toIndentedString(auditlogRuleTypes)).append("\n");
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

