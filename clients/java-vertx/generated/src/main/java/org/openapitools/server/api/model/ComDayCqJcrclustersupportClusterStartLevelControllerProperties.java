package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqJcrclustersupportClusterStartLevelControllerProperties   {
  
  private ConfigNodePropertyBoolean clusterLevelEnable = null;
  private ConfigNodePropertyInteger clusterMasterLevel = null;
  private ConfigNodePropertyInteger clusterSlaveLevel = null;

  public ComDayCqJcrclustersupportClusterStartLevelControllerProperties () {

  }

  public ComDayCqJcrclustersupportClusterStartLevelControllerProperties (ConfigNodePropertyBoolean clusterLevelEnable, ConfigNodePropertyInteger clusterMasterLevel, ConfigNodePropertyInteger clusterSlaveLevel) {
    this.clusterLevelEnable = clusterLevelEnable;
    this.clusterMasterLevel = clusterMasterLevel;
    this.clusterSlaveLevel = clusterSlaveLevel;
  }

    
  @JsonProperty("cluster.level.enable")
  public ConfigNodePropertyBoolean getClusterLevelEnable() {
    return clusterLevelEnable;
  }
  public void setClusterLevelEnable(ConfigNodePropertyBoolean clusterLevelEnable) {
    this.clusterLevelEnable = clusterLevelEnable;
  }

    
  @JsonProperty("cluster.master.level")
  public ConfigNodePropertyInteger getClusterMasterLevel() {
    return clusterMasterLevel;
  }
  public void setClusterMasterLevel(ConfigNodePropertyInteger clusterMasterLevel) {
    this.clusterMasterLevel = clusterMasterLevel;
  }

    
  @JsonProperty("cluster.slave.level")
  public ConfigNodePropertyInteger getClusterSlaveLevel() {
    return clusterSlaveLevel;
  }
  public void setClusterSlaveLevel(ConfigNodePropertyInteger clusterSlaveLevel) {
    this.clusterSlaveLevel = clusterSlaveLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqJcrclustersupportClusterStartLevelControllerProperties comDayCqJcrclustersupportClusterStartLevelControllerProperties = (ComDayCqJcrclustersupportClusterStartLevelControllerProperties) o;
    return Objects.equals(clusterLevelEnable, comDayCqJcrclustersupportClusterStartLevelControllerProperties.clusterLevelEnable) &&
        Objects.equals(clusterMasterLevel, comDayCqJcrclustersupportClusterStartLevelControllerProperties.clusterMasterLevel) &&
        Objects.equals(clusterSlaveLevel, comDayCqJcrclustersupportClusterStartLevelControllerProperties.clusterSlaveLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterLevelEnable, clusterMasterLevel, clusterSlaveLevel);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
