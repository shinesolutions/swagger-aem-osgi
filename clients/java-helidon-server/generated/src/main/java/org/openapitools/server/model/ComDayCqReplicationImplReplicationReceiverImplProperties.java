package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReplicationImplReplicationReceiverImplProperties   {

    private ConfigNodePropertyInteger receiverTmpfileThreshold;
    private ConfigNodePropertyBoolean receiverPackagesUseInstall;

    /**
     * Default constructor.
     */
    public ComDayCqReplicationImplReplicationReceiverImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReplicationImplReplicationReceiverImplProperties.
     *
     * @param receiverTmpfileThreshold receiverTmpfileThreshold
     * @param receiverPackagesUseInstall receiverPackagesUseInstall
     */
    public ComDayCqReplicationImplReplicationReceiverImplProperties(
        ConfigNodePropertyInteger receiverTmpfileThreshold, 
        ConfigNodePropertyBoolean receiverPackagesUseInstall
    ) {
        this.receiverTmpfileThreshold = receiverTmpfileThreshold;
        this.receiverPackagesUseInstall = receiverPackagesUseInstall;
    }



    /**
     * Get receiverTmpfileThreshold
     * @return receiverTmpfileThreshold
     */
    public ConfigNodePropertyInteger getReceiverTmpfileThreshold() {
        return receiverTmpfileThreshold;
    }

    public void setReceiverTmpfileThreshold(ConfigNodePropertyInteger receiverTmpfileThreshold) {
        this.receiverTmpfileThreshold = receiverTmpfileThreshold;
    }

    /**
     * Get receiverPackagesUseInstall
     * @return receiverPackagesUseInstall
     */
    public ConfigNodePropertyBoolean getReceiverPackagesUseInstall() {
        return receiverPackagesUseInstall;
    }

    public void setReceiverPackagesUseInstall(ConfigNodePropertyBoolean receiverPackagesUseInstall) {
        this.receiverPackagesUseInstall = receiverPackagesUseInstall;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReplicationImplReplicationReceiverImplProperties {\n");
        
        sb.append("    receiverTmpfileThreshold: ").append(toIndentedString(receiverTmpfileThreshold)).append("\n");
        sb.append("    receiverPackagesUseInstall: ").append(toIndentedString(receiverPackagesUseInstall)).append("\n");
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

