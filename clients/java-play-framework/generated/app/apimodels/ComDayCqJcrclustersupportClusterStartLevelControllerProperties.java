package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqJcrclustersupportClusterStartLevelControllerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqJcrclustersupportClusterStartLevelControllerProperties   {
  @JsonProperty("cluster.level.enable")
  private ConfigNodePropertyBoolean clusterLevelEnable = null;

  @JsonProperty("cluster.master.level")
  private ConfigNodePropertyInteger clusterMasterLevel = null;

  @JsonProperty("cluster.slave.level")
  private ConfigNodePropertyInteger clusterSlaveLevel = null;

  public ComDayCqJcrclustersupportClusterStartLevelControllerProperties clusterLevelEnable(ConfigNodePropertyBoolean clusterLevelEnable) {
    this.clusterLevelEnable = clusterLevelEnable;
    return this;
  }

   /**
   * Get clusterLevelEnable
   * @return clusterLevelEnable
  **/
  @Valid
  public ConfigNodePropertyBoolean getClusterLevelEnable() {
    return clusterLevelEnable;
  }

  public void setClusterLevelEnable(ConfigNodePropertyBoolean clusterLevelEnable) {
    this.clusterLevelEnable = clusterLevelEnable;
  }

  public ComDayCqJcrclustersupportClusterStartLevelControllerProperties clusterMasterLevel(ConfigNodePropertyInteger clusterMasterLevel) {
    this.clusterMasterLevel = clusterMasterLevel;
    return this;
  }

   /**
   * Get clusterMasterLevel
   * @return clusterMasterLevel
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterMasterLevel() {
    return clusterMasterLevel;
  }

  public void setClusterMasterLevel(ConfigNodePropertyInteger clusterMasterLevel) {
    this.clusterMasterLevel = clusterMasterLevel;
  }

  public ComDayCqJcrclustersupportClusterStartLevelControllerProperties clusterSlaveLevel(ConfigNodePropertyInteger clusterSlaveLevel) {
    this.clusterSlaveLevel = clusterSlaveLevel;
    return this;
  }

   /**
   * Get clusterSlaveLevel
   * @return clusterSlaveLevel
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

