package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties   {

    private ConfigNodePropertyString path;
    private ConfigNodePropertyDropDown tokenRequiredAttr;
    private ConfigNodePropertyString tokenAlternateUrl;
    private ConfigNodePropertyBoolean tokenEncapsulated;
    private ConfigNodePropertyArray skipTokenRefresh;

    /**
     * Default constructor.
     */
    public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.
     *
     * @param path path
     * @param tokenRequiredAttr tokenRequiredAttr
     * @param tokenAlternateUrl tokenAlternateUrl
     * @param tokenEncapsulated tokenEncapsulated
     * @param skipTokenRefresh skipTokenRefresh
     */
    public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties(
        ConfigNodePropertyString path, 
        ConfigNodePropertyDropDown tokenRequiredAttr, 
        ConfigNodePropertyString tokenAlternateUrl, 
        ConfigNodePropertyBoolean tokenEncapsulated, 
        ConfigNodePropertyArray skipTokenRefresh
    ) {
        this.path = path;
        this.tokenRequiredAttr = tokenRequiredAttr;
        this.tokenAlternateUrl = tokenAlternateUrl;
        this.tokenEncapsulated = tokenEncapsulated;
        this.skipTokenRefresh = skipTokenRefresh;
    }



    /**
     * Get path
     * @return path
     */
    public ConfigNodePropertyString getPath() {
        return path;
    }

    public void setPath(ConfigNodePropertyString path) {
        this.path = path;
    }

    /**
     * Get tokenRequiredAttr
     * @return tokenRequiredAttr
     */
    public ConfigNodePropertyDropDown getTokenRequiredAttr() {
        return tokenRequiredAttr;
    }

    public void setTokenRequiredAttr(ConfigNodePropertyDropDown tokenRequiredAttr) {
        this.tokenRequiredAttr = tokenRequiredAttr;
    }

    /**
     * Get tokenAlternateUrl
     * @return tokenAlternateUrl
     */
    public ConfigNodePropertyString getTokenAlternateUrl() {
        return tokenAlternateUrl;
    }

    public void setTokenAlternateUrl(ConfigNodePropertyString tokenAlternateUrl) {
        this.tokenAlternateUrl = tokenAlternateUrl;
    }

    /**
     * Get tokenEncapsulated
     * @return tokenEncapsulated
     */
    public ConfigNodePropertyBoolean getTokenEncapsulated() {
        return tokenEncapsulated;
    }

    public void setTokenEncapsulated(ConfigNodePropertyBoolean tokenEncapsulated) {
        this.tokenEncapsulated = tokenEncapsulated;
    }

    /**
     * Get skipTokenRefresh
     * @return skipTokenRefresh
     */
    public ConfigNodePropertyArray getSkipTokenRefresh() {
        return skipTokenRefresh;
    }

    public void setSkipTokenRefresh(ConfigNodePropertyArray skipTokenRefresh) {
        this.skipTokenRefresh = skipTokenRefresh;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {\n");
        
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    tokenRequiredAttr: ").append(toIndentedString(tokenRequiredAttr)).append("\n");
        sb.append("    tokenAlternateUrl: ").append(toIndentedString(tokenAlternateUrl)).append("\n");
        sb.append("    tokenEncapsulated: ").append(toIndentedString(tokenEncapsulated)).append("\n");
        sb.append("    skipTokenRefresh: ").append(toIndentedString(skipTokenRefresh)).append("\n");
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

