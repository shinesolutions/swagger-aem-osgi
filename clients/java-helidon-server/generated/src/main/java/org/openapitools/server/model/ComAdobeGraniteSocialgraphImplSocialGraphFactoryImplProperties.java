package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties   {

    private ConfigNodePropertyString group2memberRelationshipOutgoing;
    private ConfigNodePropertyArray group2memberExcludedOutgoing;
    private ConfigNodePropertyString group2memberRelationshipIncoming;
    private ConfigNodePropertyArray group2memberExcludedIncoming;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.
     *
     * @param group2memberRelationshipOutgoing group2memberRelationshipOutgoing
     * @param group2memberExcludedOutgoing group2memberExcludedOutgoing
     * @param group2memberRelationshipIncoming group2memberRelationshipIncoming
     * @param group2memberExcludedIncoming group2memberExcludedIncoming
     */
    public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(
        ConfigNodePropertyString group2memberRelationshipOutgoing, 
        ConfigNodePropertyArray group2memberExcludedOutgoing, 
        ConfigNodePropertyString group2memberRelationshipIncoming, 
        ConfigNodePropertyArray group2memberExcludedIncoming
    ) {
        this.group2memberRelationshipOutgoing = group2memberRelationshipOutgoing;
        this.group2memberExcludedOutgoing = group2memberExcludedOutgoing;
        this.group2memberRelationshipIncoming = group2memberRelationshipIncoming;
        this.group2memberExcludedIncoming = group2memberExcludedIncoming;
    }



    /**
     * Get group2memberRelationshipOutgoing
     * @return group2memberRelationshipOutgoing
     */
    public ConfigNodePropertyString getGroup2memberRelationshipOutgoing() {
        return group2memberRelationshipOutgoing;
    }

    public void setGroup2memberRelationshipOutgoing(ConfigNodePropertyString group2memberRelationshipOutgoing) {
        this.group2memberRelationshipOutgoing = group2memberRelationshipOutgoing;
    }

    /**
     * Get group2memberExcludedOutgoing
     * @return group2memberExcludedOutgoing
     */
    public ConfigNodePropertyArray getGroup2memberExcludedOutgoing() {
        return group2memberExcludedOutgoing;
    }

    public void setGroup2memberExcludedOutgoing(ConfigNodePropertyArray group2memberExcludedOutgoing) {
        this.group2memberExcludedOutgoing = group2memberExcludedOutgoing;
    }

    /**
     * Get group2memberRelationshipIncoming
     * @return group2memberRelationshipIncoming
     */
    public ConfigNodePropertyString getGroup2memberRelationshipIncoming() {
        return group2memberRelationshipIncoming;
    }

    public void setGroup2memberRelationshipIncoming(ConfigNodePropertyString group2memberRelationshipIncoming) {
        this.group2memberRelationshipIncoming = group2memberRelationshipIncoming;
    }

    /**
     * Get group2memberExcludedIncoming
     * @return group2memberExcludedIncoming
     */
    public ConfigNodePropertyArray getGroup2memberExcludedIncoming() {
        return group2memberExcludedIncoming;
    }

    public void setGroup2memberExcludedIncoming(ConfigNodePropertyArray group2memberExcludedIncoming) {
        this.group2memberExcludedIncoming = group2memberExcludedIncoming;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties {\n");
        
        sb.append("    group2memberRelationshipOutgoing: ").append(toIndentedString(group2memberRelationshipOutgoing)).append("\n");
        sb.append("    group2memberExcludedOutgoing: ").append(toIndentedString(group2memberExcludedOutgoing)).append("\n");
        sb.append("    group2memberRelationshipIncoming: ").append(toIndentedString(group2memberRelationshipIncoming)).append("\n");
        sb.append("    group2memberExcludedIncoming: ").append(toIndentedString(group2memberExcludedIncoming)).append("\n");
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

