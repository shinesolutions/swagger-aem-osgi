package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties   {

    private ConfigNodePropertyArray path;
    private ConfigNodePropertyInteger serviceRanking;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.
     *
     * @param path path
     * @param serviceRanking serviceRanking
     */
    public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties(
        ConfigNodePropertyArray path, 
        ConfigNodePropertyInteger serviceRanking
    ) {
        this.path = path;
        this.serviceRanking = serviceRanking;
    }



    /**
     * Get path
     * @return path
     */
    public ConfigNodePropertyArray getPath() {
        return path;
    }

    public void setPath(ConfigNodePropertyArray path) {
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties {\n");
        
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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

