package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReplicationImplTransportHttpProperties   {

    private ConfigNodePropertyArray disabledCipherSuites;
    private ConfigNodePropertyArray enabledCipherSuites;

    /**
     * Default constructor.
     */
    public ComDayCqReplicationImplTransportHttpProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReplicationImplTransportHttpProperties.
     *
     * @param disabledCipherSuites disabledCipherSuites
     * @param enabledCipherSuites enabledCipherSuites
     */
    public ComDayCqReplicationImplTransportHttpProperties(
        ConfigNodePropertyArray disabledCipherSuites, 
        ConfigNodePropertyArray enabledCipherSuites
    ) {
        this.disabledCipherSuites = disabledCipherSuites;
        this.enabledCipherSuites = enabledCipherSuites;
    }



    /**
     * Get disabledCipherSuites
     * @return disabledCipherSuites
     */
    public ConfigNodePropertyArray getDisabledCipherSuites() {
        return disabledCipherSuites;
    }

    public void setDisabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
        this.disabledCipherSuites = disabledCipherSuites;
    }

    /**
     * Get enabledCipherSuites
     * @return enabledCipherSuites
     */
    public ConfigNodePropertyArray getEnabledCipherSuites() {
        return enabledCipherSuites;
    }

    public void setEnabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
        this.enabledCipherSuites = enabledCipherSuites;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReplicationImplTransportHttpProperties {\n");
        
        sb.append("    disabledCipherSuites: ").append(toIndentedString(disabledCipherSuites)).append("\n");
        sb.append("    enabledCipherSuites: ").append(toIndentedString(enabledCipherSuites)).append("\n");
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

