package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties   {

    private ConfigNodePropertyString osgiHttpWhiteboardContextSelect;
    private ConfigNodePropertyString osgiHttpWhiteboardListener;
    private ConfigNodePropertyString authSudoCookie;
    private ConfigNodePropertyString authSudoParameter;
    private ConfigNodePropertyBoolean authAnnonymous;
    private ConfigNodePropertyArray slingAuthRequirements;
    private ConfigNodePropertyString slingAuthAnonymousUser;
    private ConfigNodePropertyString slingAuthAnonymousPassword;
    private ConfigNodePropertyDropDown authHttp;
    private ConfigNodePropertyString authHttpRealm;
    private ConfigNodePropertyArray authUriSuffix;

    /**
     * Default constructor.
     */
    public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.
     *
     * @param osgiHttpWhiteboardContextSelect osgiHttpWhiteboardContextSelect
     * @param osgiHttpWhiteboardListener osgiHttpWhiteboardListener
     * @param authSudoCookie authSudoCookie
     * @param authSudoParameter authSudoParameter
     * @param authAnnonymous authAnnonymous
     * @param slingAuthRequirements slingAuthRequirements
     * @param slingAuthAnonymousUser slingAuthAnonymousUser
     * @param slingAuthAnonymousPassword slingAuthAnonymousPassword
     * @param authHttp authHttp
     * @param authHttpRealm authHttpRealm
     * @param authUriSuffix authUriSuffix
     */
    public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(
        ConfigNodePropertyString osgiHttpWhiteboardContextSelect, 
        ConfigNodePropertyString osgiHttpWhiteboardListener, 
        ConfigNodePropertyString authSudoCookie, 
        ConfigNodePropertyString authSudoParameter, 
        ConfigNodePropertyBoolean authAnnonymous, 
        ConfigNodePropertyArray slingAuthRequirements, 
        ConfigNodePropertyString slingAuthAnonymousUser, 
        ConfigNodePropertyString slingAuthAnonymousPassword, 
        ConfigNodePropertyDropDown authHttp, 
        ConfigNodePropertyString authHttpRealm, 
        ConfigNodePropertyArray authUriSuffix
    ) {
        this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
        this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
        this.authSudoCookie = authSudoCookie;
        this.authSudoParameter = authSudoParameter;
        this.authAnnonymous = authAnnonymous;
        this.slingAuthRequirements = slingAuthRequirements;
        this.slingAuthAnonymousUser = slingAuthAnonymousUser;
        this.slingAuthAnonymousPassword = slingAuthAnonymousPassword;
        this.authHttp = authHttp;
        this.authHttpRealm = authHttpRealm;
        this.authUriSuffix = authUriSuffix;
    }



    /**
     * Get osgiHttpWhiteboardContextSelect
     * @return osgiHttpWhiteboardContextSelect
     */
    public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
        return osgiHttpWhiteboardContextSelect;
    }

    public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
        this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    }

    /**
     * Get osgiHttpWhiteboardListener
     * @return osgiHttpWhiteboardListener
     */
    public ConfigNodePropertyString getOsgiHttpWhiteboardListener() {
        return osgiHttpWhiteboardListener;
    }

    public void setOsgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
        this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
    }

    /**
     * Get authSudoCookie
     * @return authSudoCookie
     */
    public ConfigNodePropertyString getAuthSudoCookie() {
        return authSudoCookie;
    }

    public void setAuthSudoCookie(ConfigNodePropertyString authSudoCookie) {
        this.authSudoCookie = authSudoCookie;
    }

    /**
     * Get authSudoParameter
     * @return authSudoParameter
     */
    public ConfigNodePropertyString getAuthSudoParameter() {
        return authSudoParameter;
    }

    public void setAuthSudoParameter(ConfigNodePropertyString authSudoParameter) {
        this.authSudoParameter = authSudoParameter;
    }

    /**
     * Get authAnnonymous
     * @return authAnnonymous
     */
    public ConfigNodePropertyBoolean getAuthAnnonymous() {
        return authAnnonymous;
    }

    public void setAuthAnnonymous(ConfigNodePropertyBoolean authAnnonymous) {
        this.authAnnonymous = authAnnonymous;
    }

    /**
     * Get slingAuthRequirements
     * @return slingAuthRequirements
     */
    public ConfigNodePropertyArray getSlingAuthRequirements() {
        return slingAuthRequirements;
    }

    public void setSlingAuthRequirements(ConfigNodePropertyArray slingAuthRequirements) {
        this.slingAuthRequirements = slingAuthRequirements;
    }

    /**
     * Get slingAuthAnonymousUser
     * @return slingAuthAnonymousUser
     */
    public ConfigNodePropertyString getSlingAuthAnonymousUser() {
        return slingAuthAnonymousUser;
    }

    public void setSlingAuthAnonymousUser(ConfigNodePropertyString slingAuthAnonymousUser) {
        this.slingAuthAnonymousUser = slingAuthAnonymousUser;
    }

    /**
     * Get slingAuthAnonymousPassword
     * @return slingAuthAnonymousPassword
     */
    public ConfigNodePropertyString getSlingAuthAnonymousPassword() {
        return slingAuthAnonymousPassword;
    }

    public void setSlingAuthAnonymousPassword(ConfigNodePropertyString slingAuthAnonymousPassword) {
        this.slingAuthAnonymousPassword = slingAuthAnonymousPassword;
    }

    /**
     * Get authHttp
     * @return authHttp
     */
    public ConfigNodePropertyDropDown getAuthHttp() {
        return authHttp;
    }

    public void setAuthHttp(ConfigNodePropertyDropDown authHttp) {
        this.authHttp = authHttp;
    }

    /**
     * Get authHttpRealm
     * @return authHttpRealm
     */
    public ConfigNodePropertyString getAuthHttpRealm() {
        return authHttpRealm;
    }

    public void setAuthHttpRealm(ConfigNodePropertyString authHttpRealm) {
        this.authHttpRealm = authHttpRealm;
    }

    /**
     * Get authUriSuffix
     * @return authUriSuffix
     */
    public ConfigNodePropertyArray getAuthUriSuffix() {
        return authUriSuffix;
    }

    public void setAuthUriSuffix(ConfigNodePropertyArray authUriSuffix) {
        this.authUriSuffix = authUriSuffix;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties {\n");
        
        sb.append("    osgiHttpWhiteboardContextSelect: ").append(toIndentedString(osgiHttpWhiteboardContextSelect)).append("\n");
        sb.append("    osgiHttpWhiteboardListener: ").append(toIndentedString(osgiHttpWhiteboardListener)).append("\n");
        sb.append("    authSudoCookie: ").append(toIndentedString(authSudoCookie)).append("\n");
        sb.append("    authSudoParameter: ").append(toIndentedString(authSudoParameter)).append("\n");
        sb.append("    authAnnonymous: ").append(toIndentedString(authAnnonymous)).append("\n");
        sb.append("    slingAuthRequirements: ").append(toIndentedString(slingAuthRequirements)).append("\n");
        sb.append("    slingAuthAnonymousUser: ").append(toIndentedString(slingAuthAnonymousUser)).append("\n");
        sb.append("    slingAuthAnonymousPassword: ").append(toIndentedString(slingAuthAnonymousPassword)).append("\n");
        sb.append("    authHttp: ").append(toIndentedString(authHttp)).append("\n");
        sb.append("    authHttpRealm: ").append(toIndentedString(authHttpRealm)).append("\n");
        sb.append("    authUriSuffix: ").append(toIndentedString(authUriSuffix)).append("\n");
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

