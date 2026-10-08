package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties   {

    private ConfigNodePropertyString path;
    private ConfigNodePropertyBoolean authHttpNologin;
    private ConfigNodePropertyString authHttpRealm;
    private ConfigNodePropertyString authDefaultLoginpage;
    private ConfigNodePropertyArray authCredForm;
    private ConfigNodePropertyArray authCredUtf8;

    /**
     * Default constructor.
     */
    public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.
     *
     * @param path path
     * @param authHttpNologin authHttpNologin
     * @param authHttpRealm authHttpRealm
     * @param authDefaultLoginpage authDefaultLoginpage
     * @param authCredForm authCredForm
     * @param authCredUtf8 authCredUtf8
     */
    public ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(
        ConfigNodePropertyString path, 
        ConfigNodePropertyBoolean authHttpNologin, 
        ConfigNodePropertyString authHttpRealm, 
        ConfigNodePropertyString authDefaultLoginpage, 
        ConfigNodePropertyArray authCredForm, 
        ConfigNodePropertyArray authCredUtf8
    ) {
        this.path = path;
        this.authHttpNologin = authHttpNologin;
        this.authHttpRealm = authHttpRealm;
        this.authDefaultLoginpage = authDefaultLoginpage;
        this.authCredForm = authCredForm;
        this.authCredUtf8 = authCredUtf8;
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
     * Get authHttpNologin
     * @return authHttpNologin
     */
    public ConfigNodePropertyBoolean getAuthHttpNologin() {
        return authHttpNologin;
    }

    public void setAuthHttpNologin(ConfigNodePropertyBoolean authHttpNologin) {
        this.authHttpNologin = authHttpNologin;
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
     * Get authDefaultLoginpage
     * @return authDefaultLoginpage
     */
    public ConfigNodePropertyString getAuthDefaultLoginpage() {
        return authDefaultLoginpage;
    }

    public void setAuthDefaultLoginpage(ConfigNodePropertyString authDefaultLoginpage) {
        this.authDefaultLoginpage = authDefaultLoginpage;
    }

    /**
     * Get authCredForm
     * @return authCredForm
     */
    public ConfigNodePropertyArray getAuthCredForm() {
        return authCredForm;
    }

    public void setAuthCredForm(ConfigNodePropertyArray authCredForm) {
        this.authCredForm = authCredForm;
    }

    /**
     * Get authCredUtf8
     * @return authCredUtf8
     */
    public ConfigNodePropertyArray getAuthCredUtf8() {
        return authCredUtf8;
    }

    public void setAuthCredUtf8(ConfigNodePropertyArray authCredUtf8) {
        this.authCredUtf8 = authCredUtf8;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {\n");
        
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    authHttpNologin: ").append(toIndentedString(authHttpNologin)).append("\n");
        sb.append("    authHttpRealm: ").append(toIndentedString(authHttpRealm)).append("\n");
        sb.append("    authDefaultLoginpage: ").append(toIndentedString(authDefaultLoginpage)).append("\n");
        sb.append("    authCredForm: ").append(toIndentedString(authCredForm)).append("\n");
        sb.append("    authCredUtf8: ").append(toIndentedString(authCredUtf8)).append("\n");
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

