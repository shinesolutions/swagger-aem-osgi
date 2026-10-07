package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties   {

    private ConfigNodePropertyString tokenExpiration;
    private ConfigNodePropertyString tokenLength;
    private ConfigNodePropertyBoolean tokenRefresh;
    private ConfigNodePropertyInteger tokenCleanupThreshold;
    private ConfigNodePropertyString passwordHashAlgorithm;
    private ConfigNodePropertyInteger passwordHashIterations;
    private ConfigNodePropertyInteger passwordSaltSize;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.
     *
     * @param tokenExpiration tokenExpiration
     * @param tokenLength tokenLength
     * @param tokenRefresh tokenRefresh
     * @param tokenCleanupThreshold tokenCleanupThreshold
     * @param passwordHashAlgorithm passwordHashAlgorithm
     * @param passwordHashIterations passwordHashIterations
     * @param passwordSaltSize passwordSaltSize
     */
    public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(
        ConfigNodePropertyString tokenExpiration, 
        ConfigNodePropertyString tokenLength, 
        ConfigNodePropertyBoolean tokenRefresh, 
        ConfigNodePropertyInteger tokenCleanupThreshold, 
        ConfigNodePropertyString passwordHashAlgorithm, 
        ConfigNodePropertyInteger passwordHashIterations, 
        ConfigNodePropertyInteger passwordSaltSize
    ) {
        this.tokenExpiration = tokenExpiration;
        this.tokenLength = tokenLength;
        this.tokenRefresh = tokenRefresh;
        this.tokenCleanupThreshold = tokenCleanupThreshold;
        this.passwordHashAlgorithm = passwordHashAlgorithm;
        this.passwordHashIterations = passwordHashIterations;
        this.passwordSaltSize = passwordSaltSize;
    }



    /**
     * Get tokenExpiration
     * @return tokenExpiration
     */
    public ConfigNodePropertyString getTokenExpiration() {
        return tokenExpiration;
    }

    public void setTokenExpiration(ConfigNodePropertyString tokenExpiration) {
        this.tokenExpiration = tokenExpiration;
    }

    /**
     * Get tokenLength
     * @return tokenLength
     */
    public ConfigNodePropertyString getTokenLength() {
        return tokenLength;
    }

    public void setTokenLength(ConfigNodePropertyString tokenLength) {
        this.tokenLength = tokenLength;
    }

    /**
     * Get tokenRefresh
     * @return tokenRefresh
     */
    public ConfigNodePropertyBoolean getTokenRefresh() {
        return tokenRefresh;
    }

    public void setTokenRefresh(ConfigNodePropertyBoolean tokenRefresh) {
        this.tokenRefresh = tokenRefresh;
    }

    /**
     * Get tokenCleanupThreshold
     * @return tokenCleanupThreshold
     */
    public ConfigNodePropertyInteger getTokenCleanupThreshold() {
        return tokenCleanupThreshold;
    }

    public void setTokenCleanupThreshold(ConfigNodePropertyInteger tokenCleanupThreshold) {
        this.tokenCleanupThreshold = tokenCleanupThreshold;
    }

    /**
     * Get passwordHashAlgorithm
     * @return passwordHashAlgorithm
     */
    public ConfigNodePropertyString getPasswordHashAlgorithm() {
        return passwordHashAlgorithm;
    }

    public void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
        this.passwordHashAlgorithm = passwordHashAlgorithm;
    }

    /**
     * Get passwordHashIterations
     * @return passwordHashIterations
     */
    public ConfigNodePropertyInteger getPasswordHashIterations() {
        return passwordHashIterations;
    }

    public void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
        this.passwordHashIterations = passwordHashIterations;
    }

    /**
     * Get passwordSaltSize
     * @return passwordSaltSize
     */
    public ConfigNodePropertyInteger getPasswordSaltSize() {
        return passwordSaltSize;
    }

    public void setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
        this.passwordSaltSize = passwordSaltSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties {\n");
        
        sb.append("    tokenExpiration: ").append(toIndentedString(tokenExpiration)).append("\n");
        sb.append("    tokenLength: ").append(toIndentedString(tokenLength)).append("\n");
        sb.append("    tokenRefresh: ").append(toIndentedString(tokenRefresh)).append("\n");
        sb.append("    tokenCleanupThreshold: ").append(toIndentedString(tokenCleanupThreshold)).append("\n");
        sb.append("    passwordHashAlgorithm: ").append(toIndentedString(passwordHashAlgorithm)).append("\n");
        sb.append("    passwordHashIterations: ").append(toIndentedString(passwordHashIterations)).append("\n");
        sb.append("    passwordSaltSize: ").append(toIndentedString(passwordSaltSize)).append("\n");
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

