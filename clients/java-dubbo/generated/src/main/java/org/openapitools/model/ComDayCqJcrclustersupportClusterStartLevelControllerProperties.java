package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqJcrclustersupportClusterStartLevelControllerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cluster.level.enable")
  private ConfigNodePropertyBoolean clusterLevelEnable;

  @JsonProperty("cluster.master.level")
  private ConfigNodePropertyInteger clusterMasterLevel;

  @JsonProperty("cluster.slave.level")
  private ConfigNodePropertyInteger clusterSlaveLevel;

  /**
   * 
   * @return clusterLevelEnable
   */
  public ConfigNodePropertyBoolean getClusterLevelEnable() {
    return clusterLevelEnable;
  }

  public void setClusterLevelEnable(ConfigNodePropertyBoolean clusterLevelEnable) {
    this.clusterLevelEnable = clusterLevelEnable;
  }

  /**
   * 
   * @return clusterMasterLevel
   */
  public ConfigNodePropertyInteger getClusterMasterLevel() {
    return clusterMasterLevel;
  }

  public void setClusterMasterLevel(ConfigNodePropertyInteger clusterMasterLevel) {
    this.clusterMasterLevel = clusterMasterLevel;
  }

  /**
   * 
   * @return clusterSlaveLevel
   */
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
    return Objects.equals(this.clusterLevelEnable, comDayCqJcrclustersupportClusterStartLevelControllerProperties.clusterLevelEnable) &&
        Objects.equals(this.clusterMasterLevel, comDayCqJcrclustersupportClusterStartLevelControllerProperties.clusterMasterLevel) &&
        Objects.equals(this.clusterSlaveLevel, comDayCqJcrclustersupportClusterStartLevelControllerProperties.clusterSlaveLevel);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
