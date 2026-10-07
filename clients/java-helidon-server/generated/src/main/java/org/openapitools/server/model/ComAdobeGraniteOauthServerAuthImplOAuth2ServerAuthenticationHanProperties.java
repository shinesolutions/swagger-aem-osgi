package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties   {

    private ConfigNodePropertyString path;
    private ConfigNodePropertyString jaasControlFlag;
    private ConfigNodePropertyString jaasRealmName;
    private ConfigNodePropertyInteger jaasRanking;
    private ConfigNodePropertyBoolean oauthOfflineValidation;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.
     *
     * @param path path
     * @param jaasControlFlag jaasControlFlag
     * @param jaasRealmName jaasRealmName
     * @param jaasRanking jaasRanking
     * @param oauthOfflineValidation oauthOfflineValidation
     */
    public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(
        ConfigNodePropertyString path, 
        ConfigNodePropertyString jaasControlFlag, 
        ConfigNodePropertyString jaasRealmName, 
        ConfigNodePropertyInteger jaasRanking, 
        ConfigNodePropertyBoolean oauthOfflineValidation
    ) {
        this.path = path;
        this.jaasControlFlag = jaasControlFlag;
        this.jaasRealmName = jaasRealmName;
        this.jaasRanking = jaasRanking;
        this.oauthOfflineValidation = oauthOfflineValidation;
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
     * Get oauthOfflineValidation
     * @return oauthOfflineValidation
     */
    public ConfigNodePropertyBoolean getOauthOfflineValidation() {
        return oauthOfflineValidation;
    }

    public void setOauthOfflineValidation(ConfigNodePropertyBoolean oauthOfflineValidation) {
        this.oauthOfflineValidation = oauthOfflineValidation;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties {\n");
        
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    jaasControlFlag: ").append(toIndentedString(jaasControlFlag)).append("\n");
        sb.append("    jaasRealmName: ").append(toIndentedString(jaasRealmName)).append("\n");
        sb.append("    jaasRanking: ").append(toIndentedString(jaasRanking)).append("\n");
        sb.append("    oauthOfflineValidation: ").append(toIndentedString(oauthOfflineValidation)).append("\n");
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

