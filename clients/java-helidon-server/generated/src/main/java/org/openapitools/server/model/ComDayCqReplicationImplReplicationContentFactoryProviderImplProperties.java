package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties   {

    private ConfigNodePropertyBoolean replicationContentUseFileStorage;
    private ConfigNodePropertyInteger replicationContentMaxCommitAttempts;

    /**
     * Default constructor.
     */
    public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.
     *
     * @param replicationContentUseFileStorage replicationContentUseFileStorage
     * @param replicationContentMaxCommitAttempts replicationContentMaxCommitAttempts
     */
    public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties(
        ConfigNodePropertyBoolean replicationContentUseFileStorage, 
        ConfigNodePropertyInteger replicationContentMaxCommitAttempts
    ) {
        this.replicationContentUseFileStorage = replicationContentUseFileStorage;
        this.replicationContentMaxCommitAttempts = replicationContentMaxCommitAttempts;
    }



    /**
     * Get replicationContentUseFileStorage
     * @return replicationContentUseFileStorage
     */
    public ConfigNodePropertyBoolean getReplicationContentUseFileStorage() {
        return replicationContentUseFileStorage;
    }

    public void setReplicationContentUseFileStorage(ConfigNodePropertyBoolean replicationContentUseFileStorage) {
        this.replicationContentUseFileStorage = replicationContentUseFileStorage;
    }

    /**
     * Get replicationContentMaxCommitAttempts
     * @return replicationContentMaxCommitAttempts
     */
    public ConfigNodePropertyInteger getReplicationContentMaxCommitAttempts() {
        return replicationContentMaxCommitAttempts;
    }

    public void setReplicationContentMaxCommitAttempts(ConfigNodePropertyInteger replicationContentMaxCommitAttempts) {
        this.replicationContentMaxCommitAttempts = replicationContentMaxCommitAttempts;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties {\n");
        
        sb.append("    replicationContentUseFileStorage: ").append(toIndentedString(replicationContentUseFileStorage)).append("\n");
        sb.append("    replicationContentMaxCommitAttempts: ").append(toIndentedString(replicationContentMaxCommitAttempts)).append("\n");
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

