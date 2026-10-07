package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties   {

    private ConfigNodePropertyInteger connectionTimeout;
    private ConfigNodePropertyInteger socketTimeout;

    /**
     * Default constructor.
     */
    public ComAdobeCqDtmImplServiceDTMWebServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.
     *
     * @param connectionTimeout connectionTimeout
     * @param socketTimeout socketTimeout
     */
    public ComAdobeCqDtmImplServiceDTMWebServiceImplProperties(
        ConfigNodePropertyInteger connectionTimeout, 
        ConfigNodePropertyInteger socketTimeout
    ) {
        this.connectionTimeout = connectionTimeout;
        this.socketTimeout = socketTimeout;
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
        sb.append("class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties {\n");
        
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

