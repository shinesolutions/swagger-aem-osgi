package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties   {

    private ConfigNodePropertyBoolean xmpFilterApplyWhitelist;
    private ConfigNodePropertyArray xmpFilterWhitelist;
    private ConfigNodePropertyBoolean xmpFilterApplyBlacklist;
    private ConfigNodePropertyArray xmpFilterBlacklist;

    /**
     * Default constructor.
     */
    public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.
     *
     * @param xmpFilterApplyWhitelist xmpFilterApplyWhitelist
     * @param xmpFilterWhitelist xmpFilterWhitelist
     * @param xmpFilterApplyBlacklist xmpFilterApplyBlacklist
     * @param xmpFilterBlacklist xmpFilterBlacklist
     */
    public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(
        ConfigNodePropertyBoolean xmpFilterApplyWhitelist, 
        ConfigNodePropertyArray xmpFilterWhitelist, 
        ConfigNodePropertyBoolean xmpFilterApplyBlacklist, 
        ConfigNodePropertyArray xmpFilterBlacklist
    ) {
        this.xmpFilterApplyWhitelist = xmpFilterApplyWhitelist;
        this.xmpFilterWhitelist = xmpFilterWhitelist;
        this.xmpFilterApplyBlacklist = xmpFilterApplyBlacklist;
        this.xmpFilterBlacklist = xmpFilterBlacklist;
    }



    /**
     * Get xmpFilterApplyWhitelist
     * @return xmpFilterApplyWhitelist
     */
    public ConfigNodePropertyBoolean getXmpFilterApplyWhitelist() {
        return xmpFilterApplyWhitelist;
    }

    public void setXmpFilterApplyWhitelist(ConfigNodePropertyBoolean xmpFilterApplyWhitelist) {
        this.xmpFilterApplyWhitelist = xmpFilterApplyWhitelist;
    }

    /**
     * Get xmpFilterWhitelist
     * @return xmpFilterWhitelist
     */
    public ConfigNodePropertyArray getXmpFilterWhitelist() {
        return xmpFilterWhitelist;
    }

    public void setXmpFilterWhitelist(ConfigNodePropertyArray xmpFilterWhitelist) {
        this.xmpFilterWhitelist = xmpFilterWhitelist;
    }

    /**
     * Get xmpFilterApplyBlacklist
     * @return xmpFilterApplyBlacklist
     */
    public ConfigNodePropertyBoolean getXmpFilterApplyBlacklist() {
        return xmpFilterApplyBlacklist;
    }

    public void setXmpFilterApplyBlacklist(ConfigNodePropertyBoolean xmpFilterApplyBlacklist) {
        this.xmpFilterApplyBlacklist = xmpFilterApplyBlacklist;
    }

    /**
     * Get xmpFilterBlacklist
     * @return xmpFilterBlacklist
     */
    public ConfigNodePropertyArray getXmpFilterBlacklist() {
        return xmpFilterBlacklist;
    }

    public void setXmpFilterBlacklist(ConfigNodePropertyArray xmpFilterBlacklist) {
        this.xmpFilterBlacklist = xmpFilterBlacklist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties {\n");
        
        sb.append("    xmpFilterApplyWhitelist: ").append(toIndentedString(xmpFilterApplyWhitelist)).append("\n");
        sb.append("    xmpFilterWhitelist: ").append(toIndentedString(xmpFilterWhitelist)).append("\n");
        sb.append("    xmpFilterApplyBlacklist: ").append(toIndentedString(xmpFilterApplyBlacklist)).append("\n");
        sb.append("    xmpFilterBlacklist: ").append(toIndentedString(xmpFilterBlacklist)).append("\n");
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

