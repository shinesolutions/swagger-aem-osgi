package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqJcrclustersupportClusterStartLevelControllerProperties   {
  
  private ConfigNodePropertyBoolean clusterLevelEnable = null;
  private ConfigNodePropertyInteger clusterMasterLevel = null;
  private ConfigNodePropertyInteger clusterSlaveLevel = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.level.enable")
  public ConfigNodePropertyBoolean getClusterLevelEnable() {
    return clusterLevelEnable;
  }
  public void setClusterLevelEnable(ConfigNodePropertyBoolean clusterLevelEnable) {
    this.clusterLevelEnable = clusterLevelEnable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.master.level")
  public ConfigNodePropertyInteger getClusterMasterLevel() {
    return clusterMasterLevel;
  }
  public void setClusterMasterLevel(ConfigNodePropertyInteger clusterMasterLevel) {
    this.clusterMasterLevel = clusterMasterLevel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.slave.level")
  public ConfigNodePropertyInteger getClusterSlaveLevel() {
    return clusterSlaveLevel;
  }
  public void setClusterSlaveLevel(ConfigNodePropertyInteger clusterSlaveLevel) {
    this.clusterSlaveLevel = clusterSlaveLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

