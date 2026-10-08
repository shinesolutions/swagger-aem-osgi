package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties   {

    private ConfigNodePropertyString cqSearchpromoteConfigurationServerUri;
    private ConfigNodePropertyString cqSearchpromoteConfigurationEnvironment;
    private ConfigNodePropertyInteger connectionTimeout;
    private ConfigNodePropertyInteger socketTimeout;

    /**
     * Default constructor.
     */
    public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.
     *
     * @param cqSearchpromoteConfigurationServerUri cqSearchpromoteConfigurationServerUri
     * @param cqSearchpromoteConfigurationEnvironment cqSearchpromoteConfigurationEnvironment
     * @param connectionTimeout connectionTimeout
     * @param socketTimeout socketTimeout
     */
    public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties(
        ConfigNodePropertyString cqSearchpromoteConfigurationServerUri, 
        ConfigNodePropertyString cqSearchpromoteConfigurationEnvironment, 
        ConfigNodePropertyInteger connectionTimeout, 
        ConfigNodePropertyInteger socketTimeout
    ) {
        this.cqSearchpromoteConfigurationServerUri = cqSearchpromoteConfigurationServerUri;
        this.cqSearchpromoteConfigurationEnvironment = cqSearchpromoteConfigurationEnvironment;
        this.connectionTimeout = connectionTimeout;
        this.socketTimeout = socketTimeout;
    }



    /**
     * Get cqSearchpromoteConfigurationServerUri
     * @return cqSearchpromoteConfigurationServerUri
     */
    public ConfigNodePropertyString getCqSearchpromoteConfigurationServerUri() {
        return cqSearchpromoteConfigurationServerUri;
    }

    public void setCqSearchpromoteConfigurationServerUri(ConfigNodePropertyString cqSearchpromoteConfigurationServerUri) {
        this.cqSearchpromoteConfigurationServerUri = cqSearchpromoteConfigurationServerUri;
    }

    /**
     * Get cqSearchpromoteConfigurationEnvironment
     * @return cqSearchpromoteConfigurationEnvironment
     */
    public ConfigNodePropertyString getCqSearchpromoteConfigurationEnvironment() {
        return cqSearchpromoteConfigurationEnvironment;
    }

    public void setCqSearchpromoteConfigurationEnvironment(ConfigNodePropertyString cqSearchpromoteConfigurationEnvironment) {
        this.cqSearchpromoteConfigurationEnvironment = cqSearchpromoteConfigurationEnvironment;
    }

    /**
     * Get connectionTimeout
     * @return connectionTimeout
     */
    public ConfigNodePropertyInteger getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * Get socketTimeout
     * @return socketTimeout
     */
    public ConfigNodePropertyInteger getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties {\n");
        
        sb.append("    cqSearchpromoteConfigurationServerUri: ").append(toIndentedString(cqSearchpromoteConfigurationServerUri)).append("\n");
        sb.append("    cqSearchpromoteConfigurationEnvironment: ").append(toIndentedString(cqSearchpromoteConfigurationEnvironment)).append("\n");
        sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
        sb.append("    socketTimeout: ").append(toIndentedString(socketTimeout)).append("\n");
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

