package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties   {

    private ConfigNodePropertyString linkExpiredPrefix;
    private ConfigNodePropertyBoolean linkExpiredRemove;
    private ConfigNodePropertyString linkExpiredSuffix;
    private ConfigNodePropertyString linkInvalidPrefix;
    private ConfigNodePropertyBoolean linkInvalidRemove;
    private ConfigNodePropertyString linkInvalidSuffix;
    private ConfigNodePropertyString linkPredatedPrefix;
    private ConfigNodePropertyBoolean linkPredatedRemove;
    private ConfigNodePropertyString linkPredatedSuffix;
    private ConfigNodePropertyArray linkWcmmodes;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.
     *
     * @param linkExpiredPrefix linkExpiredPrefix
     * @param linkExpiredRemove linkExpiredRemove
     * @param linkExpiredSuffix linkExpiredSuffix
     * @param linkInvalidPrefix linkInvalidPrefix
     * @param linkInvalidRemove linkInvalidRemove
     * @param linkInvalidSuffix linkInvalidSuffix
     * @param linkPredatedPrefix linkPredatedPrefix
     * @param linkPredatedRemove linkPredatedRemove
     * @param linkPredatedSuffix linkPredatedSuffix
     * @param linkWcmmodes linkWcmmodes
     */
    public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(
        ConfigNodePropertyString linkExpiredPrefix, 
        ConfigNodePropertyBoolean linkExpiredRemove, 
        ConfigNodePropertyString linkExpiredSuffix, 
        ConfigNodePropertyString linkInvalidPrefix, 
        ConfigNodePropertyBoolean linkInvalidRemove, 
        ConfigNodePropertyString linkInvalidSuffix, 
        ConfigNodePropertyString linkPredatedPrefix, 
        ConfigNodePropertyBoolean linkPredatedRemove, 
        ConfigNodePropertyString linkPredatedSuffix, 
        ConfigNodePropertyArray linkWcmmodes
    ) {
        this.linkExpiredPrefix = linkExpiredPrefix;
        this.linkExpiredRemove = linkExpiredRemove;
        this.linkExpiredSuffix = linkExpiredSuffix;
        this.linkInvalidPrefix = linkInvalidPrefix;
        this.linkInvalidRemove = linkInvalidRemove;
        this.linkInvalidSuffix = linkInvalidSuffix;
        this.linkPredatedPrefix = linkPredatedPrefix;
        this.linkPredatedRemove = linkPredatedRemove;
        this.linkPredatedSuffix = linkPredatedSuffix;
        this.linkWcmmodes = linkWcmmodes;
    }



    /**
     * Get linkExpiredPrefix
     * @return linkExpiredPrefix
     */
    public ConfigNodePropertyString getLinkExpiredPrefix() {
        return linkExpiredPrefix;
    }

    public void setLinkExpiredPrefix(ConfigNodePropertyString linkExpiredPrefix) {
        this.linkExpiredPrefix = linkExpiredPrefix;
    }

    /**
     * Get linkExpiredRemove
     * @return linkExpiredRemove
     */
    public ConfigNodePropertyBoolean getLinkExpiredRemove() {
        return linkExpiredRemove;
    }

    public void setLinkExpiredRemove(ConfigNodePropertyBoolean linkExpiredRemove) {
        this.linkExpiredRemove = linkExpiredRemove;
    }

    /**
     * Get linkExpiredSuffix
     * @return linkExpiredSuffix
     */
    public ConfigNodePropertyString getLinkExpiredSuffix() {
        return linkExpiredSuffix;
    }

    public void setLinkExpiredSuffix(ConfigNodePropertyString linkExpiredSuffix) {
        this.linkExpiredSuffix = linkExpiredSuffix;
    }

    /**
     * Get linkInvalidPrefix
     * @return linkInvalidPrefix
     */
    public ConfigNodePropertyString getLinkInvalidPrefix() {
        return linkInvalidPrefix;
    }

    public void setLinkInvalidPrefix(ConfigNodePropertyString linkInvalidPrefix) {
        this.linkInvalidPrefix = linkInvalidPrefix;
    }

    /**
     * Get linkInvalidRemove
     * @return linkInvalidRemove
     */
    public ConfigNodePropertyBoolean getLinkInvalidRemove() {
        return linkInvalidRemove;
    }

    public void setLinkInvalidRemove(ConfigNodePropertyBoolean linkInvalidRemove) {
        this.linkInvalidRemove = linkInvalidRemove;
    }

    /**
     * Get linkInvalidSuffix
     * @return linkInvalidSuffix
     */
    public ConfigNodePropertyString getLinkInvalidSuffix() {
        return linkInvalidSuffix;
    }

    public void setLinkInvalidSuffix(ConfigNodePropertyString linkInvalidSuffix) {
        this.linkInvalidSuffix = linkInvalidSuffix;
    }

    /**
     * Get linkPredatedPrefix
     * @return linkPredatedPrefix
     */
    public ConfigNodePropertyString getLinkPredatedPrefix() {
        return linkPredatedPrefix;
    }

    public void setLinkPredatedPrefix(ConfigNodePropertyString linkPredatedPrefix) {
        this.linkPredatedPrefix = linkPredatedPrefix;
    }

    /**
     * Get linkPredatedRemove
     * @return linkPredatedRemove
     */
    public ConfigNodePropertyBoolean getLinkPredatedRemove() {
        return linkPredatedRemove;
    }

    public void setLinkPredatedRemove(ConfigNodePropertyBoolean linkPredatedRemove) {
        this.linkPredatedRemove = linkPredatedRemove;
    }

    /**
     * Get linkPredatedSuffix
     * @return linkPredatedSuffix
     */
    public ConfigNodePropertyString getLinkPredatedSuffix() {
        return linkPredatedSuffix;
    }

    public void setLinkPredatedSuffix(ConfigNodePropertyString linkPredatedSuffix) {
        this.linkPredatedSuffix = linkPredatedSuffix;
    }

    /**
     * Get linkWcmmodes
     * @return linkWcmmodes
     */
    public ConfigNodePropertyArray getLinkWcmmodes() {
        return linkWcmmodes;
    }

    public void setLinkWcmmodes(ConfigNodePropertyArray linkWcmmodes) {
        this.linkWcmmodes = linkWcmmodes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {\n");
        
        sb.append("    linkExpiredPrefix: ").append(toIndentedString(linkExpiredPrefix)).append("\n");
        sb.append("    linkExpiredRemove: ").append(toIndentedString(linkExpiredRemove)).append("\n");
        sb.append("    linkExpiredSuffix: ").append(toIndentedString(linkExpiredSuffix)).append("\n");
        sb.append("    linkInvalidPrefix: ").append(toIndentedString(linkInvalidPrefix)).append("\n");
        sb.append("    linkInvalidRemove: ").append(toIndentedString(linkInvalidRemove)).append("\n");
        sb.append("    linkInvalidSuffix: ").append(toIndentedString(linkInvalidSuffix)).append("\n");
        sb.append("    linkPredatedPrefix: ").append(toIndentedString(linkPredatedPrefix)).append("\n");
        sb.append("    linkPredatedRemove: ").append(toIndentedString(linkPredatedRemove)).append("\n");
        sb.append("    linkPredatedSuffix: ").append(toIndentedString(linkPredatedSuffix)).append("\n");
        sb.append("    linkWcmmodes: ").append(toIndentedString(linkWcmmodes)).append("\n");
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

