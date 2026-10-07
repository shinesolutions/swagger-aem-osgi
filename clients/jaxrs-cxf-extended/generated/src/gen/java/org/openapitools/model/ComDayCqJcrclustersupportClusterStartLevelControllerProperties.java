package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqJcrclustersupportClusterStartLevelControllerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean clusterLevelEnable;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterMasterLevel;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterSlaveLevel;
 /**
  * Get clusterLevelEnable
  * @return clusterLevelEnable
  */
  @JsonProperty("cluster.level.enable")
  public ConfigNodePropertyBoolean getClusterLevelEnable() {
    return clusterLevelEnable;
  }

  /**
   * Sets the <code>clusterLevelEnable</code> property.
   */
 public void setClusterLevelEnable(ConfigNodePropertyBoolean clusterLevelEnable) {
    this.clusterLevelEnable = clusterLevelEnable;
  }

  /**
   * Sets the <code>clusterLevelEnable</code> property.
   */
  public ComDayCqJcrclustersupportClusterStartLevelControllerProperties clusterLevelEnable(ConfigNodePropertyBoolean clusterLevelEnable) {
    this.clusterLevelEnable = clusterLevelEnable;
    return this;
  }

 /**
  * Get clusterMasterLevel
  * @return clusterMasterLevel
  */
  @JsonProperty("cluster.master.level")
  public ConfigNodePropertyInteger getClusterMasterLevel() {
    return clusterMasterLevel;
  }

  /**
   * Sets the <code>clusterMasterLevel</code> property.
   */
 public void setClusterMasterLevel(ConfigNodePropertyInteger clusterMasterLevel) {
    this.clusterMasterLevel = clusterMasterLevel;
  }

  /**
   * Sets the <code>clusterMasterLevel</code> property.
   */
  public ComDayCqJcrclustersupportClusterStartLevelControllerProperties clusterMasterLevel(ConfigNodePropertyInteger clusterMasterLevel) {
    this.clusterMasterLevel = clusterMasterLevel;
    return this;
  }

 /**
  * Get clusterSlaveLevel
  * @return clusterSlaveLevel
  */
  @JsonProperty("cluster.slave.level")
  public ConfigNodePropertyInteger getClusterSlaveLevel() {
    return clusterSlaveLevel;
  }

  /**
   * Sets the <code>clusterSlaveLevel</code> property.
   */
 public void setClusterSlaveLevel(ConfigNodePropertyInteger clusterSlaveLevel) {
    this.clusterSlaveLevel = clusterSlaveLevel;
  }

  /**
   * Sets the <code>clusterSlaveLevel</code> property.
   */
  public ComDayCqJcrclustersupportClusterStartLevelControllerProperties clusterSlaveLevel(ConfigNodePropertyInteger clusterSlaveLevel) {
    this.clusterSlaveLevel = clusterSlaveLevel;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

