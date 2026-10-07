package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties   {

    private ConfigNodePropertyString path;
    private ConfigNodePropertyArray oauthClientIdsAllowed;
    private ConfigNodePropertyBoolean authBearerSyncIms;
    private ConfigNodePropertyString authTokenRequestParameter;
    private ConfigNodePropertyString oauthBearerConfigid;
    private ConfigNodePropertyBoolean oauthJwtSupport;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.
     *
     * @param path path
     * @param oauthClientIdsAllowed oauthClientIdsAllowed
     * @param authBearerSyncIms authBearerSyncIms
     * @param authTokenRequestParameter authTokenRequestParameter
     * @param oauthBearerConfigid oauthBearerConfigid
     * @param oauthJwtSupport oauthJwtSupport
     */
    public ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(
        ConfigNodePropertyString path, 
        ConfigNodePropertyArray oauthClientIdsAllowed, 
        ConfigNodePropertyBoolean authBearerSyncIms, 
        ConfigNodePropertyString authTokenRequestParameter, 
        ConfigNodePropertyString oauthBearerConfigid, 
        ConfigNodePropertyBoolean oauthJwtSupport
    ) {
        this.path = path;
        this.oauthClientIdsAllowed = oauthClientIdsAllowed;
        this.authBearerSyncIms = authBearerSyncIms;
        this.authTokenRequestParameter = authTokenRequestParameter;
        this.oauthBearerConfigid = oauthBearerConfigid;
        this.oauthJwtSupport = oauthJwtSupport;
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
     * Get oauthClientIdsAllowed
     * @return oauthClientIdsAllowed
     */
    public ConfigNodePropertyArray getOauthClientIdsAllowed() {
        return oauthClientIdsAllowed;
    }

    public void setOauthClientIdsAllowed(ConfigNodePropertyArray oauthClientIdsAllowed) {
        this.oauthClientIdsAllowed = oauthClientIdsAllowed;
    }

    /**
     * Get authBearerSyncIms
     * @return authBearerSyncIms
     */
    public ConfigNodePropertyBoolean getAuthBearerSyncIms() {
        return authBearerSyncIms;
    }

    public void setAuthBearerSyncIms(ConfigNodePropertyBoolean authBearerSyncIms) {
        this.authBearerSyncIms = authBearerSyncIms;
    }

    /**
     * Get authTokenRequestParameter
     * @return authTokenRequestParameter
     */
    public ConfigNodePropertyString getAuthTokenRequestParameter() {
        return authTokenRequestParameter;
    }

    public void setAuthTokenRequestParameter(ConfigNodePropertyString authTokenRequestParameter) {
        this.authTokenRequestParameter = authTokenRequestParameter;
    }

    /**
     * Get oauthBearerConfigid
     * @return oauthBearerConfigid
     */
    public ConfigNodePropertyString getOauthBearerConfigid() {
        return oauthBearerConfigid;
    }

    public void setOauthBearerConfigid(ConfigNodePropertyString oauthBearerConfigid) {
        this.oauthBearerConfigid = oauthBearerConfigid;
    }

    /**
     * Get oauthJwtSupport
     * @return oauthJwtSupport
     */
    public ConfigNodePropertyBoolean getOauthJwtSupport() {
        return oauthJwtSupport;
    }

    public void setOauthJwtSupport(ConfigNodePropertyBoolean oauthJwtSupport) {
        this.oauthJwtSupport = oauthJwtSupport;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties {\n");
        
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    oauthClientIdsAllowed: ").append(toIndentedString(oauthClientIdsAllowed)).append("\n");
        sb.append("    authBearerSyncIms: ").append(toIndentedString(authBearerSyncIms)).append("\n");
        sb.append("    authTokenRequestParameter: ").append(toIndentedString(authTokenRequestParameter)).append("\n");
        sb.append("    oauthBearerConfigid: ").append(toIndentedString(oauthBearerConfigid)).append("\n");
        sb.append("    oauthJwtSupport: ").append(toIndentedString(oauthJwtSupport)).append("\n");
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

