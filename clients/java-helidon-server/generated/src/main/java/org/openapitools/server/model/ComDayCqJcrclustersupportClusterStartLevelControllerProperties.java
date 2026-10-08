package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqJcrclustersupportClusterStartLevelControllerProperties   {

    private ConfigNodePropertyBoolean clusterLevelEnable;
    private ConfigNodePropertyInteger clusterMasterLevel;
    private ConfigNodePropertyInteger clusterSlaveLevel;

    /**
     * Default constructor.
     */
    public ComDayCqJcrclustersupportClusterStartLevelControllerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqJcrclustersupportClusterStartLevelControllerProperties.
     *
     * @param clusterLevelEnable clusterLevelEnable
     * @param clusterMasterLevel clusterMasterLevel
     * @param clusterSlaveLevel clusterSlaveLevel
     */
    public ComDayCqJcrclustersupportClusterStartLevelControllerProperties(
        ConfigNodePropertyBoolean clusterLevelEnable, 
        ConfigNodePropertyInteger clusterMasterLevel, 
        ConfigNodePropertyInteger clusterSlaveLevel
    ) {
        this.clusterLevelEnable = clusterLevelEnable;
        this.clusterMasterLevel = clusterMasterLevel;
        this.clusterSlaveLevel = clusterSlaveLevel;
    }



    /**
     * Get clusterLevelEnable
     * @return clusterLevelEnable
     */
    public ConfigNodePropertyBoolean getClusterLevelEnable() {
        return clusterLevelEnable;
    }

    public void setClusterLevelEnable(ConfigNodePropertyBoolean clusterLevelEnable) {
        this.clusterLevelEnable = clusterLevelEnable;
    }

    /**
     * Get clusterMasterLevel
     * @return clusterMasterLevel
     */
    public ConfigNodePropertyInteger getClusterMasterLevel() {
        return clusterMasterLevel;
    }

    public void setClusterMasterLevel(ConfigNodePropertyInteger clusterMasterLevel) {
        this.clusterMasterLevel = clusterMasterLevel;
    }

    /**
     * Get clusterSlaveLevel
     * @return clusterSlaveLevel
     */
    public ConfigNodePropertyInteger getClusterSlaveLevel() {
        return clusterSlaveLevel;
    }

    public void setClusterSlaveLevel(ConfigNodePropertyInteger clusterSlaveLevel) {
        this.clusterSlaveLevel = clusterSlaveLevel;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqJcrclustersupportClusterStartLevelControllerProperties {\n");
        
        sb.append("    clusterLevelEnable: ").append(toIndentedString(clusterLevelEnable)).append("\n");
        sb.append("    clusterMasterLevel: ").append(toIndentedString(clusterMasterLevel)).append("\n");
        sb.append("    clusterSlaveLevel: ").append(toIndentedString(clusterSlaveLevel)).append("\n");
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

