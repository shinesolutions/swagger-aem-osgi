package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReplicationContentStaticContentBuilderProperties   {

    private ConfigNodePropertyString host;
    private ConfigNodePropertyInteger port;

    /**
     * Default constructor.
     */
    public ComDayCqReplicationContentStaticContentBuilderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReplicationContentStaticContentBuilderProperties.
     *
     * @param host host
     * @param port port
     */
    public ComDayCqReplicationContentStaticContentBuilderProperties(
        ConfigNodePropertyString host, 
        ConfigNodePropertyInteger port
    ) {
        this.host = host;
        this.port = port;
    }



    /**
     * Get host
     * @return host
     */
    public ConfigNodePropertyString getHost() {
        return host;
    }

    public void setHost(ConfigNodePropertyString host) {
        this.host = host;
    }

    /**
     * Get port
     * @return port
     */
    public ConfigNodePropertyInteger getPort() {
        return port;
    }

    public void setPort(ConfigNodePropertyInteger port) {
        this.port = port;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReplicationContentStaticContentBuilderProperties {\n");
        
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

