package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties   {

    private ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting;
    private ConfigNodePropertyBoolean linkcheckertransformerDisableChecking;
    private ConfigNodePropertyInteger linkcheckertransformerMapCacheSize;
    private ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck;
    private ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension;
    private ConfigNodePropertyArray linkcheckertransformerRewriteElements;
    private ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist;

    /**
     * Default constructor.
     */
    public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.
     *
     * @param linkcheckertransformerDisableRewriting linkcheckertransformerDisableRewriting
     * @param linkcheckertransformerDisableChecking linkcheckertransformerDisableChecking
     * @param linkcheckertransformerMapCacheSize linkcheckertransformerMapCacheSize
     * @param linkcheckertransformerStrictExtensionCheck linkcheckertransformerStrictExtensionCheck
     * @param linkcheckertransformerStripHtmltExtension linkcheckertransformerStripHtmltExtension
     * @param linkcheckertransformerRewriteElements linkcheckertransformerRewriteElements
     * @param linkcheckertransformerStripExtensionPathBlacklist linkcheckertransformerStripExtensionPathBlacklist
     */
    public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(
        ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting, 
        ConfigNodePropertyBoolean linkcheckertransformerDisableChecking, 
        ConfigNodePropertyInteger linkcheckertransformerMapCacheSize, 
        ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck, 
        ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension, 
        ConfigNodePropertyArray linkcheckertransformerRewriteElements, 
        ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist
    ) {
        this.linkcheckertransformerDisableRewriting = linkcheckertransformerDisableRewriting;
        this.linkcheckertransformerDisableChecking = linkcheckertransformerDisableChecking;
        this.linkcheckertransformerMapCacheSize = linkcheckertransformerMapCacheSize;
        this.linkcheckertransformerStrictExtensionCheck = linkcheckertransformerStrictExtensionCheck;
        this.linkcheckertransformerStripHtmltExtension = linkcheckertransformerStripHtmltExtension;
        this.linkcheckertransformerRewriteElements = linkcheckertransformerRewriteElements;
        this.linkcheckertransformerStripExtensionPathBlacklist = linkcheckertransformerStripExtensionPathBlacklist;
    }



    /**
     * Get linkcheckertransformerDisableRewriting
     * @return linkcheckertransformerDisableRewriting
     */
    public ConfigNodePropertyBoolean getLinkcheckertransformerDisableRewriting() {
        return linkcheckertransformerDisableRewriting;
    }

    public void setLinkcheckertransformerDisableRewriting(ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting) {
        this.linkcheckertransformerDisableRewriting = linkcheckertransformerDisableRewriting;
    }

    /**
     * Get linkcheckertransformerDisableChecking
     * @return linkcheckertransformerDisableChecking
     */
    public ConfigNodePropertyBoolean getLinkcheckertransformerDisableChecking() {
        return linkcheckertransformerDisableChecking;
    }

    public void setLinkcheckertransformerDisableChecking(ConfigNodePropertyBoolean linkcheckertransformerDisableChecking) {
        this.linkcheckertransformerDisableChecking = linkcheckertransformerDisableChecking;
    }

    /**
     * Get linkcheckertransformerMapCacheSize
     * @return linkcheckertransformerMapCacheSize
     */
    public ConfigNodePropertyInteger getLinkcheckertransformerMapCacheSize() {
        return linkcheckertransformerMapCacheSize;
    }

    public void setLinkcheckertransformerMapCacheSize(ConfigNodePropertyInteger linkcheckertransformerMapCacheSize) {
        this.linkcheckertransformerMapCacheSize = linkcheckertransformerMapCacheSize;
    }

    /**
     * Get linkcheckertransformerStrictExtensionCheck
     * @return linkcheckertransformerStrictExtensionCheck
     */
    public ConfigNodePropertyBoolean getLinkcheckertransformerStrictExtensionCheck() {
        return linkcheckertransformerStrictExtensionCheck;
    }

    public void setLinkcheckertransformerStrictExtensionCheck(ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck) {
        this.linkcheckertransformerStrictExtensionCheck = linkcheckertransformerStrictExtensionCheck;
    }

    /**
     * Get linkcheckertransformerStripHtmltExtension
     * @return linkcheckertransformerStripHtmltExtension
     */
    public ConfigNodePropertyBoolean getLinkcheckertransformerStripHtmltExtension() {
        return linkcheckertransformerStripHtmltExtension;
    }

    public void setLinkcheckertransformerStripHtmltExtension(ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension) {
        this.linkcheckertransformerStripHtmltExtension = linkcheckertransformerStripHtmltExtension;
    }

    /**
     * Get linkcheckertransformerRewriteElements
     * @return linkcheckertransformerRewriteElements
     */
    public ConfigNodePropertyArray getLinkcheckertransformerRewriteElements() {
        return linkcheckertransformerRewriteElements;
    }

    public void setLinkcheckertransformerRewriteElements(ConfigNodePropertyArray linkcheckertransformerRewriteElements) {
        this.linkcheckertransformerRewriteElements = linkcheckertransformerRewriteElements;
    }

    /**
     * Get linkcheckertransformerStripExtensionPathBlacklist
     * @return linkcheckertransformerStripExtensionPathBlacklist
     */
    public ConfigNodePropertyArray getLinkcheckertransformerStripExtensionPathBlacklist() {
        return linkcheckertransformerStripExtensionPathBlacklist;
    }

    public void setLinkcheckertransformerStripExtensionPathBlacklist(ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist) {
        this.linkcheckertransformerStripExtensionPathBlacklist = linkcheckertransformerStripExtensionPathBlacklist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {\n");
        
        sb.append("    linkcheckertransformerDisableRewriting: ").append(toIndentedString(linkcheckertransformerDisableRewriting)).append("\n");
        sb.append("    linkcheckertransformerDisableChecking: ").append(toIndentedString(linkcheckertransformerDisableChecking)).append("\n");
        sb.append("    linkcheckertransformerMapCacheSize: ").append(toIndentedString(linkcheckertransformerMapCacheSize)).append("\n");
        sb.append("    linkcheckertransformerStrictExtensionCheck: ").append(toIndentedString(linkcheckertransformerStrictExtensionCheck)).append("\n");
        sb.append("    linkcheckertransformerStripHtmltExtension: ").append(toIndentedString(linkcheckertransformerStripHtmltExtension)).append("\n");
        sb.append("    linkcheckertransformerRewriteElements: ").append(toIndentedString(linkcheckertransformerRewriteElements)).append("\n");
        sb.append("    linkcheckertransformerStripExtensionPathBlacklist: ").append(toIndentedString(linkcheckertransformerStripExtensionPathBlacklist)).append("\n");
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

