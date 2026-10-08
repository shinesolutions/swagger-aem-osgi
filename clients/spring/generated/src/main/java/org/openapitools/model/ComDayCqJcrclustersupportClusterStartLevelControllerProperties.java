package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqJcrclustersupportClusterStartLevelControllerProperties
 */

@JsonTypeName("comDayCqJcrclustersupportClusterStartLevelControllerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqJcrclustersupportClusterStartLevelControllerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean clusterLevelEnable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterMasterLevel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterSlaveLevel;

  public ComDayCqJcrclustersupportClusterStartLevelControllerProperties clusterLevelEnable(@Nullable ConfigNodePropertyBoolean clusterLevelEnable) {
    this.clusterLevelEnable = clusterLevelEnable;
    return this;
  }

  /**
   * Get clusterLevelEnable
   * @return clusterLevelEnable
   */
  @Valid 
  @Schema(name = "cluster.level.enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.level.enable")
  public @Nullable ConfigNodePropertyBoolean getClusterLevelEnable() {
    return clusterLevelEnable;
  }

  @JsonProperty("cluster.level.enable")
  public void setClusterLevelEnable(@Nullable ConfigNodePropertyBoolean clusterLevelEnable) {
    this.clusterLevelEnable = clusterLevelEnable;
  }

  public ComDayCqJcrclustersupportClusterStartLevelControllerProperties clusterMasterLevel(@Nullable ConfigNodePropertyInteger clusterMasterLevel) {
    this.clusterMasterLevel = clusterMasterLevel;
    return this;
  }

  /**
   * Get clusterMasterLevel
   * @return clusterMasterLevel
   */
  @Valid 
  @Schema(name = "cluster.master.level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.master.level")
  public @Nullable ConfigNodePropertyInteger getClusterMasterLevel() {
    return clusterMasterLevel;
  }

  @JsonProperty("cluster.master.level")
  public void setClusterMasterLevel(@Nullable ConfigNodePropertyInteger clusterMasterLevel) {
    this.clusterMasterLevel = clusterMasterLevel;
  }

  public ComDayCqJcrclustersupportClusterStartLevelControllerProperties clusterSlaveLevel(@Nullable ConfigNodePropertyInteger clusterSlaveLevel) {
    this.clusterSlaveLevel = clusterSlaveLevel;
    return this;
  }

  /**
   * Get clusterSlaveLevel
   * @return clusterSlaveLevel
   */
  @Valid 
  @Schema(name = "cluster.slave.level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.slave.level")
  public @Nullable ConfigNodePropertyInteger getClusterSlaveLevel() {
    return clusterSlaveLevel;
  }

  @JsonProperty("cluster.slave.level")
  public void setClusterSlaveLevel(@Nullable ConfigNodePropertyInteger clusterSlaveLevel) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

