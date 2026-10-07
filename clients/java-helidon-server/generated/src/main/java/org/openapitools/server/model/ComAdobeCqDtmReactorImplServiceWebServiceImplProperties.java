package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties   {

    private ConfigNodePropertyString endpointUri;
    private ConfigNodePropertyInteger connectionTimeout;
    private ConfigNodePropertyInteger socketTimeout;

    /**
     * Default constructor.
     */
    public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDtmReactorImplServiceWebServiceImplProperties.
     *
     * @param endpointUri endpointUri
     * @param connectionTimeout connectionTimeout
     * @param socketTimeout socketTimeout
     */
    public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties(
        ConfigNodePropertyString endpointUri, 
        ConfigNodePropertyInteger connectionTimeout, 
        ConfigNodePropertyInteger socketTimeout
    ) {
        this.endpointUri = endpointUri;
        this.connectionTimeout = connectionTimeout;
        this.socketTimeout = socketTimeout;
    }



    /**
     * Get endpointUri
     * @return endpointUri
     */
    public ConfigNodePropertyString getEndpointUri() {
        return endpointUri;
    }

    public void setEndpointUri(ConfigNodePropertyString endpointUri) {
        this.endpointUri = endpointUri;
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
        sb.append("class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties {\n");
        
        sb.append("    endpointUri: ").append(toIndentedString(endpointUri)).append("\n");
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

