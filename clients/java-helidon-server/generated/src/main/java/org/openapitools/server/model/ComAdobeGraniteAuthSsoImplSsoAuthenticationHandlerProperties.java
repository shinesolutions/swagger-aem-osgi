package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties   {

    private ConfigNodePropertyString path;
    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyString jaasControlFlag;
    private ConfigNodePropertyString jaasRealmName;
    private ConfigNodePropertyInteger jaasRanking;
    private ConfigNodePropertyArray headers;
    private ConfigNodePropertyArray cookies;
    private ConfigNodePropertyArray parameters;
    private ConfigNodePropertyArray usermap;
    private ConfigNodePropertyString format;
    private ConfigNodePropertyString trustedCredentialsAttribute;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.
     *
     * @param path path
     * @param serviceRanking serviceRanking
     * @param jaasControlFlag jaasControlFlag
     * @param jaasRealmName jaasRealmName
     * @param jaasRanking jaasRanking
     * @param headers headers
     * @param cookies cookies
     * @param parameters parameters
     * @param usermap usermap
     * @param format format
     * @param trustedCredentialsAttribute trustedCredentialsAttribute
     */
    public ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(
        ConfigNodePropertyString path, 
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyString jaasControlFlag, 
        ConfigNodePropertyString jaasRealmName, 
        ConfigNodePropertyInteger jaasRanking, 
        ConfigNodePropertyArray headers, 
        ConfigNodePropertyArray cookies, 
        ConfigNodePropertyArray parameters, 
        ConfigNodePropertyArray usermap, 
        ConfigNodePropertyString format, 
        ConfigNodePropertyString trustedCredentialsAttribute
    ) {
        this.path = path;
        this.serviceRanking = serviceRanking;
        this.jaasControlFlag = jaasControlFlag;
        this.jaasRealmName = jaasRealmName;
        this.jaasRanking = jaasRanking;
        this.headers = headers;
        this.cookies = cookies;
        this.parameters = parameters;
        this.usermap = usermap;
        this.format = format;
        this.trustedCredentialsAttribute = trustedCredentialsAttribute;
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
     * Get serviceRanking
     * @return serviceRanking
     */
    public ConfigNodePropertyInteger getServiceRanking() {
        return serviceRanking;
    }

    public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
        this.serviceRanking = serviceRanking;
    }

    /**
     * Get jaasControlFlag
     * @return jaasControlFlag
     */
    public ConfigNodePropertyString getJaasControlFlag() {
        return jaasControlFlag;
    }

    public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
        this.jaasControlFlag = jaasControlFlag;
    }

    /**
     * Get jaasRealmName
     * @return jaasRealmName
     */
    public ConfigNodePropertyString getJaasRealmName() {
        return jaasRealmName;
    }

    public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
        this.jaasRealmName = jaasRealmName;
    }

    /**
     * Get jaasRanking
     * @return jaasRanking
     */
    public ConfigNodePropertyInteger getJaasRanking() {
        return jaasRanking;
    }

    public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
        this.jaasRanking = jaasRanking;
    }

    /**
     * Get headers
     * @return headers
     */
    public ConfigNodePropertyArray getHeaders() {
        return headers;
    }

    public void setHeaders(ConfigNodePropertyArray headers) {
        this.headers = headers;
    }

    /**
     * Get cookies
     * @return cookies
     */
    public ConfigNodePropertyArray getCookies() {
        return cookies;
    }

    public void setCookies(ConfigNodePropertyArray cookies) {
        this.cookies = cookies;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public ConfigNodePropertyArray getParameters() {
        return parameters;
    }

    public void setParameters(ConfigNodePropertyArray parameters) {
        this.parameters = parameters;
    }

    /**
     * Get usermap
     * @return usermap
     */
    public ConfigNodePropertyArray getUsermap() {
        return usermap;
    }

    public void setUsermap(ConfigNodePropertyArray usermap) {
        this.usermap = usermap;
    }

    /**
     * Get format
     * @return format
     */
    public ConfigNodePropertyString getFormat() {
        return format;
    }

    public void setFormat(ConfigNodePropertyString format) {
        this.format = format;
    }

    /**
     * Get trustedCredentialsAttribute
     * @return trustedCredentialsAttribute
     */
    public ConfigNodePropertyString getTrustedCredentialsAttribute() {
        return trustedCredentialsAttribute;
    }

    public void setTrustedCredentialsAttribute(ConfigNodePropertyString trustedCredentialsAttribute) {
        this.trustedCredentialsAttribute = trustedCredentialsAttribute;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {\n");
        
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
        sb.append("    jaasControlFlag: ").append(toIndentedString(jaasControlFlag)).append("\n");
        sb.append("    jaasRealmName: ").append(toIndentedString(jaasRealmName)).append("\n");
        sb.append("    jaasRanking: ").append(toIndentedString(jaasRanking)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    cookies: ").append(toIndentedString(cookies)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    usermap: ").append(toIndentedString(usermap)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    trustedCredentialsAttribute: ").append(toIndentedString(trustedCredentialsAttribute)).append("\n");
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

