package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingServletsPostImplSlingPostServletProperties   {

    private ConfigNodePropertyArray servletPostDateFormats;
    private ConfigNodePropertyArray servletPostNodeNameHints;
    private ConfigNodePropertyInteger servletPostNodeNameMaxLength;
    private ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes;
    private ConfigNodePropertyBoolean servletPostAutoCheckout;
    private ConfigNodePropertyBoolean servletPostAutoCheckin;
    private ConfigNodePropertyString servletPostIgnorePattern;

    /**
     * Default constructor.
     */
    public OrgApacheSlingServletsPostImplSlingPostServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingServletsPostImplSlingPostServletProperties.
     *
     * @param servletPostDateFormats servletPostDateFormats
     * @param servletPostNodeNameHints servletPostNodeNameHints
     * @param servletPostNodeNameMaxLength servletPostNodeNameMaxLength
     * @param servletPostCheckinNewVersionableNodes servletPostCheckinNewVersionableNodes
     * @param servletPostAutoCheckout servletPostAutoCheckout
     * @param servletPostAutoCheckin servletPostAutoCheckin
     * @param servletPostIgnorePattern servletPostIgnorePattern
     */
    public OrgApacheSlingServletsPostImplSlingPostServletProperties(
        ConfigNodePropertyArray servletPostDateFormats, 
        ConfigNodePropertyArray servletPostNodeNameHints, 
        ConfigNodePropertyInteger servletPostNodeNameMaxLength, 
        ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes, 
        ConfigNodePropertyBoolean servletPostAutoCheckout, 
        ConfigNodePropertyBoolean servletPostAutoCheckin, 
        ConfigNodePropertyString servletPostIgnorePattern
    ) {
        this.servletPostDateFormats = servletPostDateFormats;
        this.servletPostNodeNameHints = servletPostNodeNameHints;
        this.servletPostNodeNameMaxLength = servletPostNodeNameMaxLength;
        this.servletPostCheckinNewVersionableNodes = servletPostCheckinNewVersionableNodes;
        this.servletPostAutoCheckout = servletPostAutoCheckout;
        this.servletPostAutoCheckin = servletPostAutoCheckin;
        this.servletPostIgnorePattern = servletPostIgnorePattern;
    }



    /**
     * Get servletPostDateFormats
     * @return servletPostDateFormats
     */
    public ConfigNodePropertyArray getServletPostDateFormats() {
        return servletPostDateFormats;
    }

    public void setServletPostDateFormats(ConfigNodePropertyArray servletPostDateFormats) {
        this.servletPostDateFormats = servletPostDateFormats;
    }

    /**
     * Get servletPostNodeNameHints
     * @return servletPostNodeNameHints
     */
    public ConfigNodePropertyArray getServletPostNodeNameHints() {
        return servletPostNodeNameHints;
    }

    public void setServletPostNodeNameHints(ConfigNodePropertyArray servletPostNodeNameHints) {
        this.servletPostNodeNameHints = servletPostNodeNameHints;
    }

    /**
     * Get servletPostNodeNameMaxLength
     * @return servletPostNodeNameMaxLength
     */
    public ConfigNodePropertyInteger getServletPostNodeNameMaxLength() {
        return servletPostNodeNameMaxLength;
    }

    public void setServletPostNodeNameMaxLength(ConfigNodePropertyInteger servletPostNodeNameMaxLength) {
        this.servletPostNodeNameMaxLength = servletPostNodeNameMaxLength;
    }

    /**
     * Get servletPostCheckinNewVersionableNodes
     * @return servletPostCheckinNewVersionableNodes
     */
    public ConfigNodePropertyBoolean getServletPostCheckinNewVersionableNodes() {
        return servletPostCheckinNewVersionableNodes;
    }

    public void setServletPostCheckinNewVersionableNodes(ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes) {
        this.servletPostCheckinNewVersionableNodes = servletPostCheckinNewVersionableNodes;
    }

    /**
     * Get servletPostAutoCheckout
     * @return servletPostAutoCheckout
     */
    public ConfigNodePropertyBoolean getServletPostAutoCheckout() {
        return servletPostAutoCheckout;
    }

    public void setServletPostAutoCheckout(ConfigNodePropertyBoolean servletPostAutoCheckout) {
        this.servletPostAutoCheckout = servletPostAutoCheckout;
    }

    /**
     * Get servletPostAutoCheckin
     * @return servletPostAutoCheckin
     */
    public ConfigNodePropertyBoolean getServletPostAutoCheckin() {
        return servletPostAutoCheckin;
    }

    public void setServletPostAutoCheckin(ConfigNodePropertyBoolean servletPostAutoCheckin) {
        this.servletPostAutoCheckin = servletPostAutoCheckin;
    }

    /**
     * Get servletPostIgnorePattern
     * @return servletPostIgnorePattern
     */
    public ConfigNodePropertyString getServletPostIgnorePattern() {
        return servletPostIgnorePattern;
    }

    public void setServletPostIgnorePattern(ConfigNodePropertyString servletPostIgnorePattern) {
        this.servletPostIgnorePattern = servletPostIgnorePattern;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingServletsPostImplSlingPostServletProperties {\n");
        
        sb.append("    servletPostDateFormats: ").append(toIndentedString(servletPostDateFormats)).append("\n");
        sb.append("    servletPostNodeNameHints: ").append(toIndentedString(servletPostNodeNameHints)).append("\n");
        sb.append("    servletPostNodeNameMaxLength: ").append(toIndentedString(servletPostNodeNameMaxLength)).append("\n");
        sb.append("    servletPostCheckinNewVersionableNodes: ").append(toIndentedString(servletPostCheckinNewVersionableNodes)).append("\n");
        sb.append("    servletPostAutoCheckout: ").append(toIndentedString(servletPostAutoCheckout)).append("\n");
        sb.append("    servletPostAutoCheckin: ").append(toIndentedString(servletPostAutoCheckin)).append("\n");
        sb.append("    servletPostIgnorePattern: ").append(toIndentedString(servletPostIgnorePattern)).append("\n");
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

